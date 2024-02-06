package miniProjects;


import javax.swing.*;
import java.awt.*;


public abstract class AbstractDrawingFrame extends JFrame {

    public abstract void pointsSetter();

    public AbstractDrawingFrame(){

    }

    public AbstractDrawingFrame(AbstractInfoPanel iPanel, AbstractDrawingCanva canv){
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

        getContentPane().add(canv);

        setVisible(true);
    }

    public AbstractDrawingFrame(AbstractInfoPanel iPanel, AbstractDrawingCanva canv, int h, int w){
        this(iPanel,canv);
        setSize(w,h);
        setVisible(true);
    }

    public static void main(String[] args) {
        //SwingUtilities.invokeLater(DrawingPanel::new);
    }
}