package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class AdminPage implements KeyListener, MouseListener, ActionListener {
    JFrame AdminFrame = new JFrame();
    JPanel AdminPanel = new JPanel();
    JPanel CenterPanel = new JPanel();
    JLabel AdminLabel = new JLabel();
    JLabel LetsManageItLabel = new JLabel("There Is Nothing Without You", JLabel.CENTER);
    JTextArea InformationArea = new JTextArea();
    JLabel SeeCommandsLabel = new JLabel("See Commands", JLabel.CENTER);
    JTextArea CommandsArea = new JTextArea();
    public Timer timer;
    int i = 0;


    AdminPage() {


        AdminPanel.setSize(1300, 720);
        AdminPanel.setBounds(0, 0, 1300, 720);
        AdminPanel.setLayout(null);
        AdminPanel.setVisible(true);

        LetsManageItLabel.setBounds(300, 10, 700, 100);
        LetsManageItLabel.setFont(new Font("Hacked", Font.PLAIN, 60));
        LetsManageItLabel.setForeground(Color.WHITE);

        SeeCommandsLabel.setBounds(1050, 200, 150, 50);
        SeeCommandsLabel.setFont(new Font("Cutive Mono", Font.PLAIN, 15));
        SeeCommandsLabel.setBackground(new Color(0x282828));
        SeeCommandsLabel.setForeground(Color.WHITE);
        SeeCommandsLabel.setOpaque(true);
        SeeCommandsLabel.addMouseListener(this);

        CommandsArea.setBounds(650, 100, 400, 200);
        CommandsArea.setFont(new Font("Cutive Mono", Font.PLAIN, 15));
        CommandsArea.setText("/list //List of Users\n\n/delete (username) //Delete By Username\n\n/seller //Show Seller's Detail\n\n/clear //Clear Area");
        CommandsArea.setBackground(new Color(0x282828));
        CommandsArea.setForeground(Color.WHITE);
        CommandsArea.setOpaque(true);
        CommandsArea.setVisible(false);

        AdminLabel.setBounds(0, 0, 1300, 720);
        AdminLabel.setBackground(new Color(0x141414));
        AdminLabel.setOpaque(true);

        InformationArea.setOpaque(true);
        InformationArea.setPreferredSize(new Dimension(2000, 1500));
        InformationArea.setFont(new Font("Cutive Mono", Font.PLAIN, 20));
        InformationArea.setBackground(Color.BLACK);
        InformationArea.setForeground(Color.WHITE);
        InformationArea.setText("Write Command >");
        InformationArea.setCaretPosition(InformationArea.getText().length());
        InformationArea.addKeyListener(this);
        InformationArea.addMouseListener(this);


        CenterPanel.setLayout(new BorderLayout());
        CenterPanel.setBounds(25, 250, 1235, 1500);
        CenterPanel.add(InformationArea, BorderLayout.CENTER);

        JScrollPane scroll = new JScrollPane(CenterPanel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(25, 250, 1235, 430);
        scroll.getVerticalScrollBar().setBackground(Color.BLACK);
        scroll.getVerticalScrollBar().setForeground(Color.BLACK);
        scroll.getHorizontalScrollBar().setBackground(Color.BLACK);
        scroll.setBorder(new EmptyBorder(0, 0, 0, 0));

        AdminPanel.add(scroll);
        AdminPanel.add(LetsManageItLabel);
        AdminPanel.add(SeeCommandsLabel);
        AdminPanel.add(CommandsArea);
        AdminPanel.add(AdminLabel);

        AdminFrame.add(AdminPanel);

        AdminFrame.setLayout(null);

        AdminFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AdminFrame.setSize(1300, 720);
        AdminFrame.setResizable(false);
        AdminFrame.setVisible(true);
        AdminFrame.addMouseListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getSource() == InformationArea) {
            if (InformationArea.getText().equals("Write Command >") || InformationArea.getText().equals("Write Command >\n")) {
                InformationArea.setText("");
            }
            if (e.getKeyCode() == 10 && InformationArea.getText().startsWith("/delete")) {
                String Username = InformationArea.getText().substring(8);
                InformationArea.setText("");

                for (int i = 0; i < Main.u.size(); i++) {
                    if (Main.u.get(i).equals(Username)) {
                        Main.u.remove(i);
                        Main.p.remove(i);
                        Main.e.remove(i);
                        Main.a.remove(i);
                        Main.t.remove(i);
                        break;
                    }
                }


                try {
                    FileOutputStream mainFile = new FileOutputStream("File/ADMIN.txt", false);
                    PrintWriter mainWr = new PrintWriter(mainFile);

                    for (int i = 0; i < Main.u.size(); i++) {

                        mainWr.println(Main.u.get(i));
                        mainWr.println(Main.p.get(i));
                        mainWr.println(Main.e.get(i));
                        mainWr.println(Main.a.get(i));
                        mainWr.println(Main.t.get(i));

                    }

                    mainWr.close();

                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }

                File obj = new File("File/" + Username + ".txt");
                if (obj.delete()) {
                    InformationArea.setText("User Baned Successfully");
                } else
                    InformationArea.setText("Sorry,Something Went Wrong");
            }
        }
        if (InformationArea.getText().equals("/list")) {
            if (e.getKeyCode() == 10) {
                if (timer != null && timer.isRunning()) {
                    return;
                }
                timer = new Timer(100, new TimerListener());
                timer.start();
            }
        }
        if (InformationArea.getText().endsWith("/clear")) {
            InformationArea.setText("Write Command >");
        }
        if (InformationArea.getText().endsWith("/seller")) {
            InformationArea.setText("Write Command >");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == InformationArea) {
            if (InformationArea.getText().equals("Write Command >") || InformationArea.getText().equals("Write Command >\n")) {
                InformationArea.setText("");
            }
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
        if (e.getSource() == SeeCommandsLabel) {
            Timer();
            CommandsArea.setVisible(true);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == SeeCommandsLabel) {
            CommandsArea.setVisible(false);
        }
    }

    public void Timer() {
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    private class TimerListener implements ActionListener {

        int counter = 0;

        @Override
        public void actionPerformed(ActionEvent e) {

            if (i % 5 == 0) {
                InformationArea.append("Username : " + Main.u.get(counter) + "   ");
                i++;
            } else if (i % 5 == 1) {
                InformationArea.append("Password : " + Main.p.get(counter) + "   ");
                i++;
            } else if (i % 5 == 2) {
                InformationArea.append("Email Address :" + Main.e.get(counter) + "   ");
                i++;
            } else if (i % 5 == 3) {
                InformationArea.append("Address : " + Main.a.get(counter) + "   ");
                i++;
            } else if (i % 5 == 4) {
                InformationArea.append("Create Date : " + Main.t.get(counter));
                InformationArea.append("\n\n");
                i = 0;
                counter++;
            }

            if (counter >= Main.u.size()) {
                timer.stop();
            }
        }
    }
}

