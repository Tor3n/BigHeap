import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

    public class SwingExample extends JFrame {
        public SwingExample() {
            // Set the title for the window
            setTitle("Swing Example");

            // Set the size of the window
            setSize(500, 500);

            // Set the default close operation for the window
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a new JPanel
            JPanel panel = new JPanel();

            // Set the layout for the panel
            panel.setLayout(new BorderLayout());

            // Create a new JTable
            String[] columnNames = {"Column 1", "Column 2"};
            Object[][] data = {{"Data 1", "Data 2"}, {"Data 3", "Data 4"}};
            JTable table = new JTable(data, columnNames);

            // Add the table to the panel
            panel.add(new JScrollPane(table), BorderLayout.CENTER);

            // Create two buttons
            JButton button1 = new JButton("Button 1");
            JButton button2 = new JButton("Button 2");

            // Create a button panel
            JPanel buttonPanel = new JPanel();

            // Add the buttons to the button panel
            buttonPanel.add(button1);
            buttonPanel.add(button2);

            // Add the button panel to the bottom of the panel
            panel.add(buttonPanel, BorderLayout.SOUTH);

            // Add the panel to the window
            add(panel);

            // Show the window
            setVisible(true);
        }

        public static void main(String[] args) {
            // Create a new instance of the SwingExample class
            SwingExample example = new SwingExample();
        }
    }

