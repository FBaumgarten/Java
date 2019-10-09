package AE2.password;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PWGenUI {
    private JPanel panelMain;
    private JButton buttonGenerate;
    private JTextField textFieldPWAnzahl;
    private JSlider sliderCapitalisePercent;
    private JSlider sliderLeetPercent;
    private JTextArea textArea;
    private JTextField textFieldLaenge;

    public PWGenUI() {
        buttonGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    PasswordGenerator pwgen = new PasswordGenerator(FileOperations.readFile("C:\\data\\deutsch.txt"));
                    int amount = Integer.parseInt(textFieldPWAnzahl.getText());
                    int length = Integer.parseInt(textFieldLaenge.getText());
                    double leetifyPercent =  sliderLeetPercent.getValue() / 100.0f;
                    double capitalizePercent = sliderCapitalisePercent.getValue() / 100.0f;
                    textArea.setText("");
                    for (int i = 0; i < amount; i++) {
                        textArea.append(pwgen.generatePassword(length, leetifyPercent, capitalizePercent) + "\n");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,"Wrong Input!");
                }
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Generator");
        frame.setSize(350,400);
        frame.setContentPane(new PWGenUI().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
