package AE2.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTest implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Geklickt: " + e.getActionCommand());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Test");
        JButton button = new JButton("Klick mich!");
        ActionListenerTest alt = new ActionListenerTest();
        button.addActionListener(alt);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
    }
}
