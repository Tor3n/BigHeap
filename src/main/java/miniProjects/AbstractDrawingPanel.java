package miniProjects;


import javax.swing.*;
import java.awt.*;


public abstract class AbstractDrawingPanel extends JFrame {

    public abstract void pointsSetter();

    public AbstractDrawingPanel(AbstractInfoPanel iPanel, AbstractDrawingCanva canv){
        setTitle("genericDrawing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int height = 400;
        int width = 500;
        setSize(width,height);
        canv.setHight(height);
        setResizable(false);

        pointsSetter();

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(iPanel, BorderLayout.NORTH);
        getContentPane().add(canv, BorderLayout.SOUTH);


         /*PointsArea pA = new PointsArea();

        for(Point p: pA.points){
            canv.addPoint(p);
        }

        Point p1 = new Point(10,10);
        Point p2 = new Point(20,20);
        canv.addPoint(p1);
        canv.addPoint(p2); */

        getContentPane().add(canv);

        setVisible(true);
    }

    public static void main(String[] args) {
        //SwingUtilities.invokeLater(DrawingPanel::new);
    }
}