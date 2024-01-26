package unsorted;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class InfoPanel extends JPanel {
    private JLabel coordinatesLabel;

    public InfoPanel() {
        coordinatesLabel = new JLabel();
        setLayout(new FlowLayout());
        add(coordinatesLabel);
    }

    public void showCoordinates(Point point) {
        if (point != null) {
            coordinatesLabel.setText("Point Coordinates: (" + point.x + ", " + point.y + ")");
        } else {
            coordinatesLabel.setText("Point Coordinates: ");
        }
    }
}

class DrawingCanvas extends JPanel {
    private List<Point> points;
    private InfoPanel infoPanel;
    private Point highlightedPoint;

    public DrawingCanvas(InfoPanel infoPanel) {
        this.points = new ArrayList<>();
        this.infoPanel = infoPanel;
        this.highlightedPoint = null;

        // Add mouse listener to handle clicks
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                checkPointClicked(e.getPoint());
            }
        });

        // Add mouse motion listener to handle cursor changes
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                checkPointProximity(e.getPoint());
            }
        });
    }

    public void addPoint(Point point) {
        points.add(point);
        repaint(); // Request a redraw of the canvas
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw each point on the canvas
        for (Point point : points) {
            g.setColor(Color.BLUE); // Set the color for drawing points
            g.fillOval(point.x - 5, point.y - 5, 10, 10); // Draw a small circle for each point
        }
    }

    private void checkPointClicked(java.awt.Point clickPoint) {
        for (Point point : points) {
            // Check if the click point is close to any existing points
            if (isPointClicked(point, clickPoint)) {
                infoPanel.showCoordinates(point);
                return;
            }
        }

        // If clicked elsewhere, clear the coordinates
        infoPanel.showCoordinates(null);
    }

    private boolean isPointClicked(Point point, java.awt.Point clickPoint) {
        // Check if the click point is close to the center of the existing point
        int distanceSquared = (point.x - clickPoint.x) * (point.x - clickPoint.x) +
                (point.y - clickPoint.y) * (point.y - clickPoint.y);
        return distanceSquared <= 25; // Adjust this threshold as needed
    }

    private void checkPointProximity(java.awt.Point mousePoint) {
        for (Point point : points) {
            // Check if the mouse is close to the center of any existing point
            if (isPointClicked(point, mousePoint)) {
                highlightedPoint = point;
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                return;
            }
        }

        // If not close to any point, reset the cursor and highlightedPoint
        highlightedPoint = null;
        setCursor(Cursor.getDefaultCursor());
    }
}

public class MainApp extends JFrame {
    private DrawingCanvas drawingCanvas;
    private InfoPanel infoPanel;

    public MainApp() {
        setTitle("Point Drawing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        infoPanel = new InfoPanel();
        drawingCanvas = new DrawingCanvas(infoPanel);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(infoPanel, BorderLayout.NORTH);
        getContentPane().add(drawingCanvas, BorderLayout.CENTER);

        // Create a point and add it to the canvas
        Point point1 = new Point(50, 50);
        drawingCanvas.addPoint(point1);

        // Create another point and add it to the canvas
        Point point2 = new Point(150, 150);
        drawingCanvas.addPoint(point2);

        // Display the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainApp::new);
    }
}