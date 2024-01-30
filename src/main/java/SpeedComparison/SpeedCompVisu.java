package SpeedComparison;

import miniProjects.AbstractDrawingCanva;
import miniProjects.AbstractDrawingPanel;
import miniProjects.AbstractInfoPanel;
import miniProjects.Point;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

class NewIpanel extends AbstractInfoPanel {

}

class DrawingCanva2 extends AbstractDrawingCanva {

    private java.util.List<Point> pointsLL;
    private java.util.List<Point> pointsADQ;

    public DrawingCanva2(AbstractInfoPanel infopanel, ArrayList<Point> ll, ArrayList<Point> adq) {
        super(infopanel);

        this.pointsLL = ll;
        this.pointsADQ = adq;

        points.addAll(ll);
        points.addAll(adq);


    }

    @Override
    protected void paintComponent(Graphics g) {
        //setSize(600,400);
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        double rotationAngle = Math.toRadians(0);
        g.translate(20,320);
        g2d.rotate(rotationAngle);
        ((Graphics2D) g).scale(1,-1);

        paintAxis(g);


        Point previous = new Point(0,0);
        for (Point point : pointsLL) {
            g.setColor(Color.blue);
            g.fillOval(point.x , point.y , 4, 4);
            g.drawLine(previous.x, previous.y, point.x, point.y);
            previous = point;
        }

        previous = new Point(0,0);
        for (Point point : pointsADQ) {
            g.setColor(Color.green);
            g.fillOval(point.x , point.y , 4, 4);
            g.drawLine(previous.x, previous.y, point.x, point.y);
            previous = point;
        }

    }

}

public class SpeedCompVisu  {


    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                int scaleX = 10;
                double scaleY = 0.4d;

                ArrayList<Point> ll = null;
                try (FileInputStream fis = new FileInputStream("C:\\Users\\Toren\\IdeaProjects\\untitled\\out\\result\\ll.txt");
                     ObjectInputStream ois = new ObjectInputStream(fis)) {
                    ll = (ArrayList<Point>) ois.readObject();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                applyScale(ll,scaleX,scaleY);

                ArrayList<miniProjects.Point> adq = null;
                try (FileInputStream fis = new FileInputStream("C:\\Users\\Toren\\IdeaProjects\\untitled\\out\\result\\ArdQ.txt");
                     ObjectInputStream ois = new ObjectInputStream(fis)) {
                    adq = (ArrayList<Point>) ois.readObject();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                applyScale(adq,scaleX,scaleY);

                NewIpanel ip = new NewIpanel();
                DrawingCanva2 dc2 = new DrawingCanva2(ip, ll, adq);
                //JFrame
                AbstractDrawingPanel p = new AbstractDrawingPanel(ip, dc2) {

                    @Override
                    public void pointsSetter() {

                    }
                };


            }
        });
        //SwingUtilities.invokeLater(SpeedCompVisu::new);
    }

    private static void applyScale(ArrayList<Point> store, int scaleX, double scaleY) {
        for(Point p: store){
            p.x=p.x*scaleX;
            p.y=(int) (p.y*scaleY);
        }
    }


}
