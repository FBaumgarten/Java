package AE2.password;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

public class PWGenUI implements ActionListener{
    private static final String DEFAULT_FILE = "deutsch.txt";
    private static JFrame mainFrame;
    private JPanel panelMain;
    private JButton buttonGenerate;
    private JTextField textFieldPWAnzahl;
    private JSlider sliderCapitalisePercent;
    private JSlider sliderLeetPercent;
    private JTextArea textArea;
    private JTextField textFieldLaenge;
    private JTextField textFieldFile;
    private JButton buttonFile;
    private File file;

    public PWGenUI() {
        buttonGenerate.addActionListener(this);
        buttonFile.addActionListener(this);
        file = new File(DEFAULT_FILE);
        textFieldFile.setText(file.getPath());
        buttonGenerate.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
    }



    public static void main(String[] args) {
        mainFrame = new JFrame("Password Generator");
        mainFrame.setSize(350,400);
        mainFrame.setContentPane(new PWGenUI().panelMain);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source.equals(buttonGenerate)) buttonGenerateClick();
        if (source.equals(buttonFile)) buttonFileClick();
    }

    private void buttonFileClick() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(mainFrame) == JFileChooser.APPROVE_OPTION){
            file = fileChooser.getSelectedFile();
            textFieldFile.setText(file.getPath());
        }
    }

    private void buttonGenerateClick() {
        try {
            PasswordGenerator pwgen = new PasswordGenerator(FileOperations.readFile(file));
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

}
