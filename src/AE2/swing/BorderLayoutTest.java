package AE2.swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JPanel{
    public BorderLayoutTest(){
        setLayout(new BorderLayout());
        add(new JButton("Nord"), BorderLayout.NORTH);
        add(new JButton("West"), BorderLayout.WEST);
        add(new JButton("Ost"), BorderLayout.EAST);
        add(new JButton("Süd"), BorderLayout.SOUTH);
        add(new JButton("Mitte"), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BorderLayoutTest());
        frame.pack();
        frame.setVisible(true);
    }
}
