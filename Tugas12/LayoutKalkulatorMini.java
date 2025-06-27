package Tugas12;

import javax.swing.*;
import java.awt.*;

public class LayoutKalkulatorMini extends JFrame {
    JTextField textField;
    JButton[] buttons;
    String[] labels = {
        "1", "2", "3", "4", "5", "6",
        "7", "8", "9", "0", "+", "-",
        "*", "/", "=", "%", "Mod", "Exit"
    };

    public LayoutKalkulatorMini() {
        setTitle("Kalkulator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        add(textField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 6, 4, 4)); 


        buttons = new JButton[labels.length];
        for (int i = 0; i < labels.length; i++) {
            buttons[i] = new JButton(labels[i]);
            buttonPanel.add(buttons[i]);

            if (labels[i].equals("Exit")) {
                buttons[i].addActionListener(e -> System.exit(0));
            }
        }

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new LayoutKalkulatorMini();
    }
}
