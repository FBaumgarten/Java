package AE2.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rechner {
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton Button4;
    private JButton Button5;
    private JButton Button6;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button0;
    private JTextField textField1;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonMulti;
    private JButton buttonDiv;
    private JButton buttonResult;
    private JButton buttonClear;
    private JPanel panel1;

    public Rechner() {
        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        Rechner rechner = new Rechner();
    }


}
