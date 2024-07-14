package DinamicProg;

import miniProjects.AbstractDrawingCanva;
import miniProjects.AbstractDrawingFrame;
import miniProjects.AbstractInfoPanel;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawingFrameMCS extends AbstractDrawingFrame {

    public DrawingFrameMCS(AbstractInfoPanel iPanel, AbstractDrawingCanva canv, ArrayList<AbstractInfoPanel> ALword1, ArrayList<AbstractInfoPanel> ALword2) {
        super();
        setTitle("123");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int height = 500;
        int width = 500;
        setSize(width,height);
        canv.setHight(height);
        setResizable(false);

        pointsSetter();

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(iPanel, BorderLayout.NORTH);


            JPanel west = new JPanel(){};
            west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
            west.add(new AbstractInfoPanel(){});
            for(AbstractInfoPanel pp : ALword2){
                west.add(pp);
                //pp.setBackground(Color.blue);
            }
            getContentPane().add(west, BorderLayout.WEST);


            JPanel center = new JPanel(){};
            JPanel upCenter = new JPanel(){};
            center.setLayout(new BorderLayout());
            upCenter.setLayout(new BoxLayout(upCenter, BoxLayout.X_AXIS));
            for(AbstractInfoPanel p : ALword1){
                upCenter.add(p, BorderLayout.NORTH);
                //p.setSize(new Dimension(2510,20));
                //p.setBackground(Color.green);
            }
            center.add(upCenter, BorderLayout.NORTH);
            center.add(canv);
            canv.setBackground(new Color(121,130,125));
            add(center);


        setVisible(true);

    }


    @Override
    public void pointsSetter() {

    }
}
