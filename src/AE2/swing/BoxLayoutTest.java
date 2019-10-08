package AE2.swing;

import javax.swing.*;

public class BoxLayoutTest extends JPanel {
    public BoxLayoutTest(){
        this(BoxLayout.X_AXIS);
    }

    public BoxLayoutTest(int direction){
        setLayout(new BoxLayout(this, direction));
        for (int i = 0; i < 6; i++) {
            add(new JButton(Integer.toString(i)));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Box Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BoxLayoutTest());
        frame.pack();
        frame.setVisible(true);
    }
}
