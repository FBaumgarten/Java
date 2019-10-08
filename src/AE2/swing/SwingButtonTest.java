package AE2.swing;

import javax.swing.*;

public class SwingButtonTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Test Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JButton("Dies ist ein Button"));
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
