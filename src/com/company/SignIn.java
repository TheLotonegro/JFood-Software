package com.company;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class SignIn implements MouseListener, ActionListener {
    String Selected;
    String Selected2;
    JFrame SignInFrame = new JFrame();
    JPanel SignInPanel = new JPanel();
    JLabel SignInLabel = new JLabel();
    JTextArea WelcomeBackArea = new JTextArea("Welcome Back!");
    JTextArea GladToSeeArea = new JTextArea("Glad To See You Again ;)");
    String[] combo = {"User", "Admin", "Seller"};
    JLabel SignInAsLabel = new JLabel("    Sign In As");
    JComboBox ComboBox = new JComboBox(combo);
    JLabel UsernameLabel = new JLabel("       Username");
    JTextField UsernameField = new JTextField();
    JLabel PasswordLabel = new JLabel("        Password");
    JPasswordField PasswordField = new JPasswordField();
    JButton SignInButton = new JButton("Sign In");
    JButton BackToSignUpButton = new JButton("Go Back");


    SignIn() {




        SignInPanel.setBounds(0, 0, 1300, 720);
        SignInPanel.setLayout(null);

        Color C1 = new Color(0x6e5ed4);
        Color C2 = new Color(0xff4081);

        ImageIcon LoginBackground = new ImageIcon("Image/LoginBackground.png");
        SignInLabel.setBounds(0, 0, 1350, 720);
        SignInLabel.setIcon(LoginBackground);
        SignInLabel.setOpaque(true);

        WelcomeBackArea.setBounds(130, 100, 500, 150);
        WelcomeBackArea.setBackground(new Color(0x281984));
        WelcomeBackArea.setForeground(new Color(0xffffff));
        WelcomeBackArea.setEditable(false);
        WelcomeBackArea.setFont(new Font("Century gothic", Font.PLAIN, 50));

        GladToSeeArea.setBounds(110, 400, 500, 150);
        GladToSeeArea.setBackground(new Color(0x281984));
        GladToSeeArea.setForeground(new Color(0xffffff));
        GladToSeeArea.setEditable(false);
        GladToSeeArea.setFont(new Font("Century gothic", Font.PLAIN, 37));

        SignInAsLabel.setBounds(750, 100, 150, 40);
        SignInAsLabel.setFont(new Font("Century gothic", Font.PLAIN, 22));
        SignInAsLabel.setBackground(C2);
        SignInAsLabel.setOpaque(true);
        ComboBox.setBounds(900, 100, 200, 40);
        ComboBox.setFont(new Font("century gothic", Font.PLAIN, 20));
        ((JLabel) ComboBox.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        ComboBox.setForeground(Color.black);
        ComboBox.setBackground(Color.white);
        ComboBox.setBorder(new LineBorder(C2, 1, false));
        ComboBox.setFocusable(false);
        ComboBox.addActionListener(this);
        ComboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        UsernameLabel.setBounds(750, 250, 100, 40);
        UsernameLabel.setBackground(C2);
        UsernameLabel.setOpaque(true);
        UsernameField.setBounds(850, 250, 250, 40);
        UsernameField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        UsernameField.setBorder(new LineBorder(C2, 2, false));
        UsernameField.setOpaque(true);

        PasswordLabel.setBounds(750, 350, 100, 40);
        PasswordLabel.setBackground(C2);
        PasswordLabel.setOpaque(true);
        PasswordField.setBounds(850, 350, 250, 40);
        PasswordField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        PasswordField.setBorder(new LineBorder(C2, 2, false));
        PasswordField.setOpaque(true);

        SignInButton.setBounds(865, 520, 120, 35);
        SignInButton.setFont(new Font("century gothic", Font.BOLD, 15));
        SignInButton.setBackground(Color.white);
        SignInButton.setBorder(new LineBorder(C2, 2, true));
        SignInButton.setFocusable(false);
        SignInButton.setOpaque(true);
        SignInButton.addActionListener(this);
        SignInButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        BackToSignUpButton.setBounds(642, 612, 120, 35);
        BackToSignUpButton.setFont(new Font("century gothic", Font.BOLD, 15));
        BackToSignUpButton.setBackground(Color.white);
        BackToSignUpButton.setBorder(new LineBorder(C1, 2, true));
        BackToSignUpButton.setFocusable(false);
        BackToSignUpButton.setOpaque(true);
        BackToSignUpButton.addActionListener(this);
        BackToSignUpButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        SignInPanel.add(WelcomeBackArea);
        SignInPanel.add(GladToSeeArea);
        SignInPanel.add(SignInAsLabel);
        SignInPanel.add(ComboBox);
        SignInPanel.add(UsernameLabel);
        SignInPanel.add(UsernameField);
        SignInPanel.add(PasswordLabel);
        SignInPanel.add(PasswordField);
        SignInPanel.add(SignInButton);
        SignInPanel.add(BackToSignUpButton);
        SignInPanel.add(SignInLabel);

        SignInFrame.setSize(1300, 720);
        SignInFrame.setResizable(false);
//        SignInFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SignInFrame.setLocationRelativeTo(null);
        SignInFrame.setLayout(null);
        SignInFrame.add(SignInPanel);
        SignInFrame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == BackToSignUpButton) {
            LoginPage loginPage = new LoginPage();
            SignInFrame.dispose();
        }

        if (e.getSource() == ComboBox) {
            Selected = String.valueOf(ComboBox.getSelectedItem());
        }
        if (e.getSource() == ComboBox) {
            Selected2 = String.valueOf(ComboBox.getSelectedItem());
        }

        if (e.getSource() == SignInButton) {
            if("12345678".equals(PasswordField.getText()) && UsernameField.getText().equals("ImSeller") && Selected2.equals("Seller")) {

                SignInFrame.dispose();

                SellerPage sellerPage = new SellerPage();


            }else if ("12345678".equals(PasswordField.getText()) && UsernameField.getText().equals("JFood") && Selected.equals("Admin")) {

                new AdminPage();

                SignInFrame.dispose();
            }
             else {
                try {
                    BufferedReader read = new BufferedReader(new FileReader("File/"+UsernameField.getText() + ".txt"));
                    String pass = read.readLine();
                    if (pass.equals(PasswordField.getText())) {
                        JOptionPane.showMessageDialog(null, "You Successfully Signed In,Now Click On The Refresh Button");
                        Main.userA.add(0, UsernameField.getText());
                        Main.passA.add(0, PasswordField.getText());
                        categoryPage.loggedIn = 1;
                        String email = read.readLine();
                        Main.emailA.add(0, email);

                        String Address = read.readLine();
                        Main.addressA.add(0, Address);

                        SignInFrame.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Something Went Wrong");
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "User Not Found !!!");
                }
            }
        }

    }

}
