package miniProjects.PointsAreaCoding;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

class InfoPanel extends JPanel{
    private JLabel coordinateLabel;

    public InfoPanel(){
        coordinateLabel = new JLabel();
        coordinateLabel.setText(" ");
        setLayout(new FlowLayout());
        add(coordinateLabel);
    }

    public void showCoordinates(miniProjects.PointsAreaCoding.Point point){
        if (point != null){
            coordinateLabel.setText("x: "+point.x+", y: "+point.y);
        }
    }
}

public class DrawingPane extends JFrame{

    public DrawingPane(){
        setTitle("points");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setResizable(false);

        InfoPanel iPanel = new InfoPanel();
        DrawingCanvas canv = new DrawingCanvas(iPanel);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(iPanel, BorderLayout.NORTH);
        getContentPane().add(canv, BorderLayout.SOUTH);


        PointsArea pA = new PointsArea();

        for(miniProjects.PointsAreaCoding.Point p: pA.points){
            canv.addPoint(p);
        }

        for(miniProjects.PointsAreaCoding.Rectangle rr: pA.rectangles){
            canv.addRect(rr);
        }

        for(miniProjects.PointsAreaCoding.Rectangle rr: pA.biggestEmptyRect){
            canv.addEmptRect(rr);
        }

        //Point p0 = new Point(2, (int) (Math.round(this.getSize().getHeight())-30));


        getContentPane().add(canv);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawingPane::new);

    }
}

class DrawingCanvas extends JPanel{
    private List<miniProjects.PointsAreaCoding.Point> points;
    private List<miniProjects.PointsAreaCoding.Rectangle> rects;
    private List<miniProjects.PointsAreaCoding.Rectangle> emptRects;
    private InfoPanel infoPanel;
    private miniProjects.PointsAreaCoding.Point highlightedPoint;
    private final int GLOBALSENS = 10;

    public DrawingCanvas(InfoPanel infopanel){
        this.points = new ArrayList<>();
        this.rects = new ArrayList<>();
        this.emptRects = new ArrayList<>();
        this.infoPanel=infopanel;
        this.highlightedPoint=null;

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                checkPointClicked(e.getPoint());
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                checkPointProximity(e.getPoint());
            }
        });
    }

    public void addEmptRect(miniProjects.PointsAreaCoding.Rectangle r){
        emptRects.add(r);
        repaint();
    }

    public void addRect(miniProjects.PointsAreaCoding.Rectangle r){
        rects.add(r);
        repaint();
    }

    public void addPoint(miniProjects.PointsAreaCoding.Point p){
        points.add(p);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        paintAxis(g);

        int i=0;
        int j=0;
        for(miniProjects.PointsAreaCoding.Rectangle r: rects){
            g.setColor(new Color(100,i,j));
            int w=(r.first.x-r.second.x);
            int h=(r.first.y-r.second.y);
            g.drawPolygon(new int[]{r.first.x,r.first.x, r.second.x,r.second.x}, new int[]{r.first.y,r.second.y,r.second.y,r.first.y},4);
            //g.drawLine(r.first.x,r.first.y,r.second.x,r.second.y);
            //g.fillPolygon();
            if((i=i+30)>250){
                i=250;
                if((j=j+30)>250){
                    j=250;
                }
            }
        }

        for(Rectangle r: emptRects){
            g.setColor(Color.green);
            int w=Math.abs(r.first.x-r.second.x);
            int h=Math.abs(r.first.y-r.second.y);
            g.fillPolygon(new int[]{r.first.x,r.first.x, r.second.x,r.second.x},
                    new int[]{r.first.y,r.second.y,r.second.y,r.first.y},4);
        }

        for(miniProjects.PointsAreaCoding.Point point: points){
            g.setColor(Color.blue);
            g.fillOval(point.x-5,point.y-5, 6,6);
        }
    }

    public void paintAxis(Graphics g){

        g.fillRect(0,0,400,4);
        g.fillRect(0,0,4,400);
    }

    private void checkPointClicked(java.awt.Point clickPoint){
        System.out.println("coord x:"+clickPoint.x+", y: "+clickPoint.y);
        for(miniProjects.PointsAreaCoding.Point point:points){
            //check if the click is close to any existing points
            int cPx=clickPoint.x;
            int cPy=clickPoint.y;
            int px=point.x;
            int py=point.y;

            double distanceSqr = Math.sqrt(Math.pow(cPx-px,2) + Math.pow(cPy-py,2));
            if(distanceSqr<=GLOBALSENS){
                //JOptionPane.showMessageDialog(this, "x: "+point.x+",y: "+point.y);
                infoPanel.showCoordinates(point);
                return;
            } else {
                infoPanel.showCoordinates(null);
            }
        }
    }

    private void checkPointProximity(java.awt.Point mousePoint){
        for(miniProjects.PointsAreaCoding.Point point:points){
            int cPx=mousePoint.x;
            int cPy=mousePoint.y;
            int px=point.x;
            int py=point.y;

            double distanceSqr = Math.sqrt(Math.pow(cPx-px,2) + Math.pow(cPy-py,2));
            if(distanceSqr<=GLOBALSENS){
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                return;
            }

            setCursor(Cursor.getDefaultCursor());
        }
    }

}
