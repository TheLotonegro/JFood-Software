package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class favoriteFood extends JFrame implements MouseListener, ActionListener {
    JPanel mainFoodPanel;
    ImageIcon mainBackGround = new ImageIcon("Image/BackGround.png");
    JLabel backGround = new JLabel();
    JPanel mainPanel = new JPanel();
    JLabel homeIcon = new JLabel();
    JLabel categoryIcon = new JLabel();
    JLabel heartIcon = new JLabel();
    JLabel aboutUsIcon = new JLabel();
    JLabel exitIcon = new JLabel();

    static JLabel userLabel2 = new JLabel();
    static JLabel emailLabel2 = new JLabel();
    static JLabel addressLabel2 = new JLabel();
    static JButton payment2 = new JButton();

    ImageIcon homeIcon1 = new ImageIcon("Image/HomeIcon1.png");
    ImageIcon categoryIcon1 = new ImageIcon("Image/CategoryIcon1.png");
    ImageIcon heartIcon1 = new ImageIcon("Image/HeartIcon1.png");
    ImageIcon exitIcon1 = new ImageIcon("Image/ExitIcon1.png");

    ImageIcon homeIcon2 = new ImageIcon("Image/HomeIcon2.png");
    ImageIcon categoryIcon2 = new ImageIcon("Image/CategoryIcon2.png");
    ImageIcon heartIcon2 = new ImageIcon("Image/HeartIcon2.png");
    ImageIcon exitIcon2 = new ImageIcon("Image/ExitIcon2.png");

    static ArrayList<JLayeredPane> favorite = new ArrayList<>();

    favoriteFood(){
        backGround.setBounds(0, 0, 1350, 720);
        backGround.setIcon(mainBackGround);

        homeIcon.setBounds(15, 80, 45, 45);
        homeIcon.setIcon(homeIcon2);
        homeIcon.addMouseListener(this);

        categoryIcon.setBounds(15, 180, 45, 45);
        categoryIcon.setIcon(categoryIcon2);
        categoryIcon.addMouseListener(this);

        heartIcon.setBounds(15, 280, 45, 45);
        heartIcon.setIcon(heartIcon1);
        heartIcon.addMouseListener(this);

        exitIcon.setBounds(15, 600, 45, 45);
        exitIcon.setIcon(exitIcon2);
        exitIcon.addMouseListener(this);

        mainPanel.setBounds(0, 0, 1300, 660);
        mainPanel.setLayout(null);
        mainPanel.add(homeIcon);
        mainPanel.add(categoryIcon);
        mainPanel.add(heartIcon);
        mainPanel.add(aboutUsIcon);
        mainPanel.add(exitIcon);


        userLabel2.setPreferredSize(new Dimension(250 , 40));
        userLabel2.setFont(new Font("Century gothic", Font.BOLD, 28));
        userLabel2.setForeground(Color.white);

        emailLabel2.setPreferredSize(new Dimension(250 , 40));
        emailLabel2.setFont(new Font("Century gothic", Font.BOLD, 15));
        emailLabel2.setForeground(Color.white);

        addressLabel2.setPreferredSize(new Dimension(250 , 40));
        addressLabel2.setFont(new Font("Century gothic", Font.BOLD, 15));
        addressLabel2.setForeground(Color.white);

        payment2.setText("Pay:        "+categoryPage.total+"$");
        payment2.setPreferredSize(new Dimension(180 , 40));
        payment2.setOpaque(true);
        payment2.setFont(new Font("GT America" , Font.BOLD , 15));
        payment2.setBorder(new EmptyBorder(0,0,0,0));
        payment2.setBackground(Color.white);
        payment2.setForeground(new Color(40 , 25 , 132 ));
        payment2.addActionListener(this);


        JPanel userInf = new JPanel();
        userInf.setBounds(1010 , -5 , 280 , 160);
        userInf.setLayout(new FlowLayout(FlowLayout.CENTER , 0 , 0));
        userInf.setBackground(new Color(40 , 25 ,132));
        userInf.add(userLabel2);
        userInf.add(emailLabel2);
        userInf.add(addressLabel2);
        userInf.add(payment2);



        JLabel title = new JLabel("Favorite Foods");
        title.setFont(new Font("GT America" , Font.BOLD , 20));
        title.setBounds(100 , 15 , 900 , 200);
        title.setOpaque(true);
        title.setBackground(new Color(245 , 245 , 254));
        mainPanel.add(title);

        mainFoodPanel = new JPanel();
        mainFoodPanel.setLayout(new GridLayout(0 , 3 , 30 , 20));
        mainFoodPanel.setOpaque(true);
        mainFoodPanel.setPreferredSize(new Dimension(935 , 580));
        mainFoodPanel.setBackground(new Color(245 , 245 , 254));

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        centerPanel.setBounds(65 , 215 , 935 , 500);
        centerPanel.add(mainFoodPanel , BorderLayout.CENTER);

        JScrollPane scroll = new JScrollPane(centerPanel , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(65 , 215 , 935 , 500);
        scroll.setBorder(new EmptyBorder(0 , 0 , 0 , 0));



        JPanel cartScroll = new JPanel();
        cartScroll.setLayout(new BorderLayout());
        cartScroll.setBounds(1010 , 200 , 280 , 350);


        categoryPage.cartPanel.setPreferredSize(new Dimension(260 , 1000));
        categoryPage.cartPanel.setOpaque(true);
        categoryPage.cartPanel.setBackground(Color.white);
        cartScroll.add(categoryPage.cartPanel , BorderLayout.CENTER);

        JScrollPane itemScroll = new JScrollPane(cartScroll , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        itemScroll.setBounds(1010 , 200 , 280 , 350);
        itemScroll.setBorder(new EmptyBorder(0 , 0 , 0 , 0));


        categoryPage.totalP.setText("Total Price :      " + categoryPage.total+"$");
        categoryPage.totalP.setForeground(Color.white);
        categoryPage.totalP.setFont(new Font("GT America" , Font.BOLD , 15));

        categoryPage.buy.setPreferredSize(new Dimension(180 , 40 ));
        categoryPage.buy.setBackground(Color.white);
        categoryPage.buy.setFont(new Font("GT America" , Font.BOLD , 15));
        categoryPage.buy.setOpaque(true);
        categoryPage.buy.setForeground(new Color(96 , 76 , 209));
        categoryPage.buy.setBorder(new EmptyBorder( 0 , 0 ,0 , 0));
        categoryPage.buy.addActionListener(this);





        JPanel buyPanel = new JPanel();
        buyPanel.setBounds(1010 , 550 , 260 ,100 );
        buyPanel.setOpaque(true);
        buyPanel.setBackground(new Color(96 , 76 , 209 ));
        buyPanel.setLayout(new FlowLayout(FlowLayout.CENTER , 20 , 10));
        buyPanel.add(categoryPage.totalP);
        buyPanel.add(categoryPage.buy);


        JLabel noFood = new JLabel("         Favorite food is empty");
        noFood.setFont(new Font("GT America" , Font.BOLD , 20));
        noFood.setBounds(350 , 300 , 400 , 100 );
        noFood.setOpaque(true);
        noFood.setBackground(new Color(111 , 93 , 212));
        noFood.setVisible(false);
        mainPanel.add(noFood);

        if(favorite.size() == 0 ){
            noFood.setVisible(true);
        }else{
            if(favorite.size() > 6 && favorite.size() < 10){
                mainFoodPanel.setPreferredSize(new Dimension(935 , 800));
            }else if(favorite.size() > 9 && favorite.size() < 13){
                mainFoodPanel.setPreferredSize(new Dimension(935 , 1180));
            }
            for(int i = 0 ; i < favorite.size() ; i++){
                mainFoodPanel.add(favorite.get(i));
            }
        }
        mainPanel.add(userInf);
        mainPanel.add(itemScroll);
        mainPanel.add(buyPanel);
        mainPanel.add(scroll);
        mainPanel.add(backGround);
        this.add(mainPanel);
        this.setSize( 1300, 704);
        this.setResizable(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == homeIcon) {
            homeIcon.setIcon(homeIcon1);
            categoryIcon.setIcon(categoryIcon2);
            heartIcon.setIcon(heartIcon2);
            exitIcon.setIcon(exitIcon2);
            try {
                HomeClass hc = new HomeClass();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            this.dispose();
        }
        if (e.getSource() == categoryIcon) {
            homeIcon.setIcon(homeIcon2);
            categoryIcon.setIcon(categoryIcon1);
            heartIcon.setIcon(heartIcon2);
            exitIcon.setIcon(exitIcon2);
            try {
                categoryPage food = new categoryPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            this.dispose();
        }
        if (e.getSource() == heartIcon) {
            homeIcon.setIcon(homeIcon2);
            categoryIcon.setIcon(categoryIcon2);
            heartIcon.setIcon(heartIcon1);
            exitIcon.setIcon(exitIcon2);

        }
        if (e.getSource() == exitIcon) {
            homeIcon.setIcon(homeIcon2);
            categoryIcon.setIcon(categoryIcon2);
            heartIcon.setIcon(heartIcon2);
            exitIcon.setIcon(exitIcon1);
            this.dispose();
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

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == categoryPage.buy){
            try {
                if(categoryPage.loggedIn == 1) {
                    File file = new File("File/" + Main.userA.get(0) + ".txt");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(Main.passA.get(0)+"\n");
                    writer.write(Main.emailA.get(0)+"\n");
                    writer.write(Main.addressA.get(0)+"\n");
                    for(int i = 0 ; i < categoryPage.cartIndex1.size(); i++){
                        writer.write(categoryPage.foodName.get(categoryPage.cartIndex1.get(i))+"\n");
                    }
                    payment2.setText("Pay:        "+categoryPage.total+"$");
                    writer.close();
                }else{
                    JOptionPane.showMessageDialog(null, "First You must login");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else if(e.getSource() == payment2){
            try {

                HomeClass.writer.append(Main.userA.get(0)).append("\n");
                HomeClass.writer.append(HomeClass.TimeFormat.format(Calendar.getInstance().getTime())).append(" ").append(HomeClass.DayFormat.format(Calendar.getInstance().getTime())).append(" ").append(HomeClass.DateFormat.format(Calendar.getInstance().getTime())).append("\n");
                HomeClass.writer.append(String.valueOf(categoryPage.total)).append("\n");
                categoryPage.cartPanel.removeAll();
                categoryPage.cartPanel.revalidate();
                categoryPage.cartPanel.repaint();
                categoryPage.total = 0;
                categoryPage.cartIndex.clear();
                categoryPage.cartIndex1.clear();
                File file = new File("File/" + Main.userA.get(0) + ".txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(Main.passA.get(0)+"\n");
                writer.write(Main.emailA.get(0)+"\n");
                writer.write(Main.addressA.get(0)+"\n");
                for(int i = 0 ; i < categoryPage.cartIndex1.size(); i++){
                    writer.write(categoryPage.foodName.get(categoryPage.cartIndex1.get(i))+"\n");
                }
                payment2.setText("Pay:        "+categoryPage.total+"$");
                writer.close();
                categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
