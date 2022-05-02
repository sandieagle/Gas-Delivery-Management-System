package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class Login extends JFrame{
   Login(){
        setLayout(null);
    }
}

public class LoginPage<button> {
    private JTextField userText;
    private JPanel panel1;
    private JPasswordField password;

    private JButton loginButton;
    private JButton resetButton;
    private JButton exitButton;
    private JButton registerHereButton;
    private JLabel Message;
    private JButton LoginButton;
    private JFrame frame;

    public LoginPage() {

        frame = new JFrame("Login Frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setResizable(false);

        //now add the panel
        frame.add(panel1);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                password.setText("");
            }
        });

    }
}




