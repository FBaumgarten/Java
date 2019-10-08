package AE2.swing;

import javax.swing.*;

public class FlowLayoutTest extends JPanel{

    public FlowLayoutTest(){
        for (int i = 0; i < 5; i++) {
            add(new JButton("Button " + i));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new FlowLayoutTest());
        frame.pack();
        frame.setVisible(true);
    }
}
