package supply.exige.markey.gui;

import javax.swing.*;
import java.awt.*;

public class MarKeyGUI extends JFrame {

    public final static int WIDTH = 300;
    public final static int HEIGHT = WIDTH / 16 * 9;
    public static final double VERSION = 1.0;
    private final String title = "MarKey | " + VERSION;

    private JFrame frame;

    public MarKeyGUI() {
        Dimension size = new Dimension(WIDTH, HEIGHT);
        frame = new JFrame(); // Instantiate game frame

        //frame.setResizable(false); // Disable resize
        add(this); // Add game engine to JFrame
        pack(); // Fill entire window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close When the exit button is pressed
        setLocationRelativeTo(null); // Center window
        setVisible(true); // Show window

    }

}
