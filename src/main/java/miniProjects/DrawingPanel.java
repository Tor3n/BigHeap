package miniProjects;


import miniProjects.PointsAreaCoding.DrawingPane;

import javax.swing.*;

public class DrawingPanel extends JFrame {
    public DrawingPanel(){

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DrawingPane::new);

    }
}
