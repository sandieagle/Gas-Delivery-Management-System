package LoginPage;

import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Delivery {
    private JButton btnNext;
    private JPanel panel;

    private JTextField tfMessage;
    private JTextField tfAddress;
    private JTextField tfName;
    private JTextField tfPhone;
    private JTextField tfEmail;
    private JTextField tfTimeSchedule;
    private JFrame frame;

    public Delivery() {

        frame = new JFrame("Delivery Frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setResizable(false);

        //now add the panel
        frame.add(panel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
