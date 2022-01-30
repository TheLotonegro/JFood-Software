package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.time.LocalDateTime;

public class LoginPage extends JFrame implements MouseListener, ActionListener {

    JFrame LoginFrame = new JFrame();
    JPanel LoginPanel = new JPanel();
    JTextArea WelcomeArea = new JTextArea("Welcome To JFood");
    JTextArea QuickServiceArea = new JTextArea("Quick Service Restaurant :D");
    JLabel LoginLabel = new JLabel();
    JLabel UsernameLabel = new JLabel("       Username");
    JTextField UsernameField = new JTextField();
    JLabel PasswordLabel = new JLabel("       Password");
    JPasswordField PasswordField = new JPasswordField();
    JLabel EmailLabel = new JLabel("           Email");
    JTextField EmailField = new JTextField();
    JLabel AddressLabel = new JLabel("         Address");
    JTextField AddressField = new JTextField();
    JTextArea SignUpNowArea = new JTextArea("Sign Up Now");
    JLabel HaveAccountLabel = new JLabel("already have an account ?");
    JTextArea SignInArea = new JTextArea("Sign in");
    JRadioButton ShowPasswordButton = new JRadioButton("Show Password");
    JButton SignUpButton = new JButton("Sign up");

    LoginPage() {

        LoginPanel.setBounds(0, 0, 1300, 720);
        LoginPanel.setLayout(null);

        Color C1 = new Color(0x6e5ed4);


        ImageIcon LoginBackground = new ImageIcon("Image/LoginBackground.png");
        LoginLabel.setBounds(0, 0, 1350, 720);
        LoginLabel.setIcon(LoginBackground);
        LoginLabel.setOpaque(true);

        WelcomeArea.setBounds(110, 100, 500, 150);
        WelcomeArea.setBackground(new Color(0x281984));
        WelcomeArea.setForeground(new Color(0xffffff));
        WelcomeArea.setEditable(false);
        WelcomeArea.setFont(new Font("Century gothic", Font.PLAIN, 50));

        QuickServiceArea.setBounds(110, 400, 500, 150);
        QuickServiceArea.setBackground(new Color(0x281984));
        QuickServiceArea.setForeground(new Color(0xffffff));
        QuickServiceArea.setEditable(false);
        QuickServiceArea.setFont(new Font("Century gothic", Font.PLAIN, 37));

        SignUpNowArea.setBounds(750, 50, 350, 60);
        SignUpNowArea.setBackground(new Color(0xf5f5ff));
        SignUpNowArea.setForeground(C1);
        SignUpNowArea.setEditable(false);
        SignUpNowArea.setFont(new Font("Century gothic", Font.PLAIN, 40));

        UsernameLabel.setBounds(750, 150, 100, 40);
        UsernameLabel.setBackground(C1);
        UsernameLabel.setOpaque(true);
        UsernameField.setBounds(850, 150, 250, 40);
        UsernameField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        UsernameField.setBorder(new LineBorder(C1, 2, false));
        UsernameField.setOpaque(true);

        PasswordLabel.setBounds(750, 250, 100, 40);
        PasswordLabel.setBackground(C1);
        PasswordLabel.setOpaque(true);
        PasswordField.setBounds(850, 250, 250, 40);
        PasswordField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        PasswordField.setBorder(new LineBorder(C1, 2, false));
        PasswordField.setOpaque(true);

        ShowPasswordButton.setBounds(1100, 260, 120, 20);
        ShowPasswordButton.setFont(new Font("century gothic", Font.PLAIN, 12));
        ShowPasswordButton.setBackground(new Color(0xf5f5ff));
        ShowPasswordButton.setFocusable(false);
        ShowPasswordButton.setOpaque(true);
        ShowPasswordButton.addActionListener(this);

        EmailLabel.setBounds(750, 350, 100, 40);
        EmailLabel.setBackground(C1);
        EmailLabel.setOpaque(true);
        EmailField.setBounds(850, 350, 250, 40);
        EmailField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        EmailField.setBorder(new LineBorder(C1, 2, false));
        EmailField.setOpaque(true);

        AddressLabel.setBounds(750, 450, 100, 40);
        AddressLabel.setBackground(C1);
        AddressLabel.setOpaque(true);
        AddressField.setBounds(850, 450, 250, 40);
        AddressField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        AddressField.setBorder(new LineBorder(C1, 2, false));
        AddressField.setOpaque(true);

        HaveAccountLabel.setBounds(810, 565, 180, 50);
        HaveAccountLabel.setForeground(Color.GRAY);
        HaveAccountLabel.setBackground(new Color(0xf5f5ff));
        HaveAccountLabel.setFont(new Font("Helvetica", Font.PLAIN, 15));
        HaveAccountLabel.setOpaque(true);

        SignInArea.setBounds(994, 577, 80, 30);
        SignInArea.setBackground(new Color(0xf5f5ff));
        SignInArea.setForeground(Color.black);
        SignInArea.setFont(new Font("Century gothic", Font.BOLD, 18));
        SignInArea.setOpaque(true);
        SignInArea.setEditable(false);
        SignInArea.addMouseListener(this);
        SignInArea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        SignUpButton.setBounds(865, 520, 120, 35);
        SignUpButton.setFont(new Font("century gothic", Font.BOLD, 15));
        SignUpButton.setBackground(Color.white);
        SignUpButton.setBorder(new LineBorder(C1, 2, true));
        SignUpButton.setFocusable(false);
        SignUpButton.setOpaque(true);
        SignUpButton.addActionListener(this);
        SignUpButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        LoginPanel.add(WelcomeArea);
        LoginPanel.add(QuickServiceArea);
        LoginPanel.add(SignUpNowArea);
        LoginPanel.add(UsernameLabel);
        LoginPanel.add(UsernameField);
        LoginPanel.add(PasswordLabel);
        LoginPanel.add(PasswordField);
        LoginPanel.add(ShowPasswordButton);
        LoginPanel.add(EmailLabel);
        LoginPanel.add(EmailField);
        LoginPanel.add(AddressLabel);
        LoginPanel.add(AddressField);
        LoginPanel.add(HaveAccountLabel);
        LoginPanel.add(SignInArea);
        LoginPanel.add(SignUpButton);
        LoginPanel.add(LoginLabel);


        LoginFrame.setSize(1300, 720);
        LoginFrame.setResizable(false);
//        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginFrame.setLocationRelativeTo(null);
        LoginFrame.setLayout(null);
        LoginFrame.add(LoginPanel);
        LoginFrame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == SignInArea) {
            SignIn signIn = new SignIn();
            LoginFrame.dispose();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if (e.getSource() == SignInArea) {
            SignInArea.setForeground(new Color(0x6e5ed4));
            SignInArea.setOpaque(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

        if (e.getSource() == SignInArea) {
            SignInArea.setForeground(Color.black);
            SignInArea.setOpaque(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ShowPasswordButton) {
            if (ShowPasswordButton.isSelected()) {
                PasswordField.setEchoChar((char) 0);
            }
            if (!ShowPasswordButton.isSelected()) {
                PasswordField.setEchoChar('*');
            }
        }
        if (e.getSource() == SignUpButton) {
            try {
                if (UsernameField.getText().length() > 2) {
                    if (PasswordField.getPassword().length > 7) {
                        if (!(EmailField.getText().equals(""))) {
                            if (!(AddressField.getText().equals(""))) {
                                File file = new File("File/" + UsernameField.getText() + ".txt");
                                if (!(file.exists())) {

                                    FileWriter wr = new FileWriter(file);
                                    wr.write(PasswordField.getPassword());
                                    wr.write("\n" + EmailField.getText());
                                    wr.write("\n" + AddressField.getText() + "\n");
                                    wr.close();

                                    Main.userA.add(0, UsernameField.getText());
                                    Main.passA.add(0, PasswordField.getText());
                                    Main.emailA.add(0, EmailField.getText());
                                    Main.addressA.add(0, AddressField.getText());

                                    FileOutputStream mainFile = new FileOutputStream("File/ADMIN.txt", true);
                                    PrintWriter mainWr = new PrintWriter(mainFile);

                                    mainWr.println(UsernameField.getText());
                                    mainWr.println(PasswordField.getText());
                                    mainWr.println(EmailField.getText());
                                    mainWr.println(AddressField.getText());
                                    mainWr.println(LocalDateTime.now());

                                    mainWr.close();

                                    Main.u.add(UsernameField.getText());
                                    Main.p.add(PasswordField.getText());
                                    Main.e.add(EmailField.getText());
                                    Main.a.add(AddressField.getText());
                                    Main.t.add(String.valueOf(LocalDateTime.now()));
                                    categoryPage.loggedIn = 1;
                                    JOptionPane.showMessageDialog(null, "You Successfully Signed Up , Now Click On Refresh Button");
                                    LoginFrame.dispose();
                                } else
                                    JOptionPane.showMessageDialog(null, "This Account Already Exists");
                            } else
                                JOptionPane.showMessageDialog(null, "Please Write An Address");
                        } else
                            JOptionPane.showMessageDialog(null, "Please Write An Email");
                    } else
                        JOptionPane.showMessageDialog(null, "Your Pass Must Longer Than 7 Character");
                } else
                    JOptionPane.showMessageDialog(null, "Your Username Must Longer Than 3 Character");

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

