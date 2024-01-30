package miniProjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public abstract class AbstractDrawingCanva extends JPanel {
    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    private int hight;
    protected java.util.List<Point> points;
    private AbstractInfoPanel infoPanel;
    private final int GLOBALSENS = 10;


    public AbstractDrawingCanva(AbstractInfoPanel infopanel) {

        this.points = new ArrayList<>();
        this.infoPanel = infopanel;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                java.awt.Point mousePoint = e.getPoint();
                int mouseX = mousePoint.x;
                int mouseY = mousePoint.y;
                AffineTransform inverseTransform = new AffineTransform();
                inverseTransform.translate(-17, 322);
                inverseTransform.rotate(Math.toRadians(-180));
                inverseTransform.scale(-1,1);
                Point2D transformedPoint = inverseTransform.transform(new  java.awt.Point(mouseX, mouseY), null);

                checkPointClicked(new java.awt.Point((int) transformedPoint.getX(), (int)transformedPoint.getY()));
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                java.awt.Point mousePoint = e.getPoint();
                int mouseX = mousePoint.x;
                int mouseY = mousePoint.y;
                AffineTransform inverseTransform = new AffineTransform();
                inverseTransform.translate(-17, 322);
                inverseTransform.rotate(Math.toRadians(-180));
                inverseTransform.scale(-1,1);
                Point2D transformedPoint = inverseTransform.transform(new  java.awt.Point(mouseX, mouseY), null);
                checkPointProximity(new java.awt.Point((int) transformedPoint.getX(), (int)transformedPoint.getY()));
            }
        });
    }

    public void addPoint(Point p) {
        points.add(p);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        /*Graphics2D g2d = (Graphics2D) g;

        double rotationAngle = Math.toRadians(0);
        g.translate(20,320);
        g2d.rotate(rotationAngle);
        ((Graphics2D) g).scale(1,-1);

        paintAxis(g);


        for (Point point : points) {
            g.setColor(Color.blue);
            g.fillOval(point.x - 5, point.y - 5, 6, 6);
        }
        */
    }

    public void paintAxis(Graphics g) {

        g.fillRect(0, 0, 400, 4);
        g.fillRect(0, 0, 4, 400);
    }

    protected void checkPointClicked(java.awt.Point clickPoint) {

        System.out.println("coord x:" + clickPoint.x + ", y: " + clickPoint.y);
        for (Point point : points) {
            //check if the click is close to any existing points
            int cPx = clickPoint.x;
            int cPy = clickPoint.y;
            int px = point.x;
            int py = point.y;

            double distanceSqr = Math.sqrt(Math.pow(cPx - px, 2) + Math.pow(cPy - py, 2));
            if (distanceSqr <= GLOBALSENS) {
                //JOptionPane.showMessageDialog(this, "x: "+point.x+",y: "+point.y);
                infoPanel.showCoordinates(point);
                return;
            } else {
                infoPanel.showCoordinates(null);
            }
        }
    }

    protected void checkPointProximity(java.awt.Point mousePoint) {

        for (Point point : points) {
            int cPx = mousePoint.x;
            int cPy = mousePoint.y;
            int px = point.x;
            int py = point.y;

            double distanceSqr = Math.sqrt(Math.pow(cPx - px, 2) + Math.pow(cPy - py, 2));
            if (distanceSqr <= GLOBALSENS) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                return;
            }

            setCursor(Cursor.getDefaultCursor());
        }
    }

}
