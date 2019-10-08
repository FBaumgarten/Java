package AE2.swing;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutTest  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setLayout(new GridBagLayout());

        JLabel labelName = new JLabel("Name:");
        JLabel labelPassword = new JLabel("Password:");
        JTextField fieldName = new JTextField();
        JPasswordField fieldPassword = new JPasswordField();
        JButton buttonOk = new JButton("Ok");
        JButton buttonCancel = new JButton("Abbrechen");

        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(4,4,4,4);
        c.gridx = 0;
        c.gridy = 0;
       // frame.add(labelName.c);
    }


}
