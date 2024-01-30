package miniProjects;

import javax.swing.*;
import java.awt.*;

public abstract class AbstractInfoPanel extends JPanel {
    private JLabel coordinateLabel;

    public AbstractInfoPanel() {
        coordinateLabel = new JLabel();
        coordinateLabel.setText(" ");
        setLayout(new FlowLayout());
        add(coordinateLabel);
    }

    public void showCoordinates(Point point) {
        if (point != null) {
            coordinateLabel.setText("x: " + point.x + ", y: " + point.y);
        }
    }

}
