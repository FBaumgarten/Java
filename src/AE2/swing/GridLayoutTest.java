package AE2.swing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutTest extends JPanel {
    public GridLayoutTest(){
        setLayout(new GridLayout(4,3));
        for (int i = 9; i >= 0; i--) {
            add(new JButton(Integer.toString(i)));
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new GridLayoutTest());
        frame.pack();
        frame.setVisible(true);
    }
}
