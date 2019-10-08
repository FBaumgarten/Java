package AE2.swing;

import javax.swing.*;

public class SwingTextFieldTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Test TextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JTextField("Dies ist ein Textfeld  Und noch etwas Text 12345678901234567890",60));
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
