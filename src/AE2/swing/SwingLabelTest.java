package AE2.swing;

import javax.swing.*;

public class SwingLabelTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Test Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("Dies ist ein Label", JLabel.LEADING));
        frame.setSize(300,200);
        frame.setVisible(true);
    }

}
