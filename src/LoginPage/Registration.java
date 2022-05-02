package LoginPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JTextField;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Registration <button> {

    private JPanel panel2;
    private JTextField tfFirstname;
    private JTextField tfLastname;
    private JTextField tfEmail;

    private JButton btnRegister;
    private JButton btnBackToLogin;
    private JButton btnClear;
    private JTextField tfAddress;
    private JTextField userText;
    private JTextField Password;
    private JTextField tfTelephone;
    private JLabel UserNameLable;
    private JLabel EmailLable;
    private JLabel AddressLable;
    private JLabel TelephoneLable;
    private JLabel LastNameLable;
    private JLabel FirstNameLable;
    private JLabel PasswordLable;
    private JFrame frame;
    FileWriter fileWriter;

    public Registration() {

        frame = new JFrame("Registration Frame");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.setResizable(false);

        //now add the panel
        frame.add(panel2);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstname.setText("");
                tfLastname.setText("");
                tfEmail.setText("");
                tfAddress.setText("");
                userText.setText("");
                Password.setText("");
                tfTelephone.setText("");
            }
        });

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ae.getActionCommand()==btnRegister.getActionCommand()){
                    try{
                        fileWriter = new FileWriter("C:/Sign Up Sheet.txt");
                        fileWriter.write(FirstNameLable.getText() + " : "+tfFirstname.getText()+"\n");
                        fileWriter.write(LastNameLable.getText() + " : "+tfLastname.getText()+"\n");
                        fileWriter.write(TelephoneLable.getText() + " : "+tfTelephone.getText()+"\n");
                        fileWriter.write(AddressLable.getText() + " : "+tfAddress.getText()+"\n");
                        fileWriter.write(EmailLable.getText() + " : "+tfEmail.getText()+"\n");
                        fileWriter.write(UserNameLable.getText() + " : "+ userText.getText()+"\n");
                        fileWriter.write(PasswordLable.getText() + " : "+ Password.getText()+"\n");
                        fileWriter.close();
                        JOptionPane.showMessageDialog(null, "Register Successfully");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e+"");
                    }
                }
            }
        });
    }


}




