package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class HomeClass implements MouseListener,ActionListener, KeyListener {
        static int selectedCategory = 0;
        static int refNum = 0 ;
        int defNum = 0 ;
        /*
    public static JButton removeBtn(int x, int y, int i, JLabel userLabel, JLabel emailLabel, JLabel addressLabel, JTextArea cartAreaN, JTextArea cartAreaP, JTextArea totalP) {

        JButton remove = new JButton();
        remove.setBounds(x, y, 24, 24);
        remove.setFocusable(false);
        remove.setBackground(new Color(234 , 72 , 64));
//        remove.setForeground(new Color(0xFFFFFF));
//        remove.setFont(new Font("", Font.BOLD, 4));
        remove.addActionListener(e -> {
            try {

                Main.inCartFood.remove(i - 1);
                Main.inCartPrice.remove(i - 1);

                File file = new File("File/"+Main.userA.get(0) + ".txt");

                FileWriter wr = new FileWriter(file, false);
                wr.write(Main.passA.get(0));
                wr.write("\n" + Main.emailA.get(0));
                wr.write("\n" + Main.addressA.get(0));

                for (int j = 0; j < Main.inCartFood.size(); j++) {

                    wr.write("\n" + Main.inCartFood.get(j));
                    wr.write("\n" + Main.inCartPrice.get(j));

                }

                wr.write("\n");
                wr.close();

                Main.inCartFood.clear();
                Main.inCartPrice.clear();


                userLabel.setText(Main.userA.get(0));
                emailLabel.setText(Main.emailA.get(0));
                addressLabel.setText(Main.addressA.get(0));

                BufferedReader read = new BufferedReader(new FileReader("File/"+Main.userA.get(0) + ".txt"));

                int total = 0;

                cartAreaN.setText("");
                cartAreaP.setText("");

                String P = read.readLine();
                String E = read.readLine();
                String A = read.readLine();
                while (A != null) {

                    A = read.readLine();
                    if (A != null) {
                        cartAreaN.append(A + "\n");
                        Main.inCartFood.add(A);
                    }
                    A = read.readLine();
                    if (A != null) {
                        cartAreaP.append(A + " $" + "\n");
                        total = total + Integer.parseInt(A);
                        Main.inCartPrice.add(A);
                    }
                }
                totalP.setText("Total purchase : " + total + " $");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            } catch (IOException ioException) {
                ioException.printStackTrace();
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            }

        });

        return remove;

    }

         */

    public static void refresh(JTextArea cartAreaN, JTextArea cartAreaP, JTextArea totalP) {

        Main.inCartFood.clear();
        Main.inCartPrice.clear();

        try {

            BufferedReader read = new BufferedReader(new FileReader("File/"+Main.userA.get(0) + ".txt"));

            int total = 0;

            cartAreaN.setText("");
            cartAreaP.setText("");

            String P = read.readLine();
            String E = read.readLine();
            String A = read.readLine();
            while (A != null) {

                A = read.readLine();
                if (A != null) {
                    cartAreaN.append(A + "\n");
                    Main.inCartFood.add(A);
                }
                A = read.readLine();
                if (A != null) {
                    cartAreaP.append(A + " $" + "\n");
                    total = total + Integer.parseInt(A);
                    Main.inCartPrice.add(A);
                }
            }
            totalP.setText("Total purchase : " + total + " $");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "We do not have any thing in this line");
        } catch (IOException ioException) {
            ioException.printStackTrace();
            JOptionPane.showMessageDialog(null, "We do not have any thing in this line");
        }

    }

    //______________________________________________________MainFrame_______________________________________________________
    JFrame mainFrame = new JFrame("Restaurant");
    JPanel mainPanel = new JPanel();

    //______________________________________________________AboutUsFrame____________________________________________________
    JFrame aboutUsFrame = new JFrame("About Us");

    //______________________________________________________RightLabel______________________________________________________
    JLabel homeIcon = new JLabel();
    JLabel categoryIcon = new JLabel();
    JLabel heartIcon = new JLabel();
    JLabel aboutUsIcon = new JLabel();
    JLabel exitIcon = new JLabel();

    //______________________________________________________TopLabel________________________________________________________
    JLabel searchIcon = new JLabel();
    JTextArea searchText = new JTextArea("Search");
    JLabel account = new JLabel();

    //______________________________________________________TopLabel________________________________________________________
    JLabel TopLabel = new JLabel();
    JLabel BoyLabel = new JLabel();
    JLabel CocaLabel = new JLabel();
    JTextArea GiftMassage = new JTextArea();

    //______________________________________________________DefineImages____________________________________________________
    ImageIcon mainBackGround = new ImageIcon("Image/BackGround.png");

    ImageIcon homeIcon1 = new ImageIcon("Image/HomeIcon1.png");
    ImageIcon categoryIcon1 = new ImageIcon("Image/CategoryIcon1.png");
    ImageIcon heartIcon1 = new ImageIcon("Image/HeartIcon1.png");
    ImageIcon aboutUsIcon1 = new ImageIcon("Image/AboutUsIcon1.png");
    ImageIcon exitIcon1 = new ImageIcon("Image/ExitIcon1.png");

    ImageIcon homeIcon2 = new ImageIcon("Image/HomeIcon2.png");
    ImageIcon categoryIcon2 = new ImageIcon("Image/CategoryIcon2.png");
    ImageIcon heartIcon2 = new ImageIcon("Image/HeartIcon2.png");
    ImageIcon aboutUsIcon2 = new ImageIcon("Image/AboutUsIcon2.png");
    ImageIcon exitIcon2 = new ImageIcon("Image/ExitIcon2.png");

    ImageIcon searchIcon1 = new ImageIcon("Image/SearchIcon1.png");
    ImageIcon searchIcon2 = new ImageIcon("Image/SearchIcon2.png");

    ImageIcon BoyIcon = new ImageIcon("Image/Boy.png");
    ImageIcon CocaIcon = new ImageIcon("Image/Coca.png");


    //______________________________________________________SlidePanel________________________________________________________

    JLabel leftPointer;
    JLabel rightPointer;

    ImageIcon rightArrow;
    ImageIcon leftArrow;
    ImageIcon rightArrowB;
    ImageIcon leftArrowB;

    ImageIcon offP;

    JLabel pp;
    ImageIcon pepperoniB;
    ImageIcon pepperoni;
    JLabel offBox1;
    JLabel offText1;
    JLabel foodName1;
    JLabel foodPrice1;
    JLabel foodRate1;

    JLabel cs;
    ImageIcon cesar;
    ImageIcon cesarB;
    JLabel offBox2;
    JLabel offText2;
    JLabel foodName2;
    JLabel foodPrice2;
    JLabel foodRate2;


    JLabel fa;
    ImageIcon cheeseBurger;
    ImageIcon cheeseBurgerB;
    JLabel offBox3;
    JLabel offText3;
    JLabel foodName3;
    JLabel foodPrice3;
    JLabel foodRate3;

    JLabel h;
    ImageIcon hotdog;
    ImageIcon hotdogB;
    JLabel offBox4;
    JLabel offText4;
    JLabel foodName4;
    JLabel foodPrice4;
    JLabel foodRate4;


    JLabel sp;
    ImageIcon mojito;
    ImageIcon mojitoB;
    JLabel offBox5;
    JLabel offText5;
    JLabel foodName5;
    JLabel foodPrice5;
    JLabel foodRate5;


    JLabel fc;
    ImageIcon friedChicken;
    ImageIcon friedChickenB;
    JLabel offBox6;
    JLabel offText6;
    JLabel foodName6;
    JLabel foodPrice6;
    JLabel foodRate6;

    JLabel sb;
    ImageIcon burger;
    ImageIcon burgerB;
    JLabel offBox7;
    JLabel offText7;
    JLabel foodName7;
    JLabel foodPrice7;
    JLabel foodRate7;


    JLabel s;
    ImageIcon jFoodBox;
    ImageIcon jFoodBoxB;
    JLabel offBox8;
    JLabel offText8;
    JLabel foodName8;
    JLabel foodPrice8;
    JLabel foodRate8;


    JPanel centerPanel;
    JPanel slidePanel1;
    JPanel slidePanel2;
    JPanel slidePanel3;

    JLabel pizzaBg;
    JLabel burgerBg;
    JLabel sandwichBg;
    JLabel chickenBg;
    JLabel drinkBg;
    JLabel saladBg;


    ImageIcon pizzaImg;
    ImageIcon burgerImg;
    ImageIcon sandwichImg;
    ImageIcon chickenImg;
    ImageIcon drinkImg;
    ImageIcon saladImg;

    ImageIcon ctg1;
    ImageIcon ctg2;
    JPanel CategoryPanel;


    JPanel foodPanel;

    int active = 0;
    int page = 1;

    static SimpleDateFormat TimeFormat;
    static SimpleDateFormat DayFormat;
    static SimpleDateFormat DateFormat;
    static BufferedWriter writer2;

    //    JTextArea numberArea = new JTextArea();

    JLabel userLabel = new JLabel();
    JLabel emailLabel = new JLabel();
    JLabel addressLabel = new JLabel();
    static JButton payment = new JButton();
    int Index = 0;
    int CartIndex = 0;
    static BufferedWriter writer;

    static {
        try {
            writer = new BufferedWriter(new FileWriter("File/SELLER.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    JLabel text = new JLabel();
    JLabel price = new JLabel();
    JPanel resultLabel = new JPanel();

    int i = 1;
    int height = 200;

    HomeClass() throws IOException {
        text.setPreferredSize(new Dimension(180 , 30));
        text.setFont(new Font("GT America" , Font.BOLD , 18));

        price.setPreferredSize(new Dimension(80 , 30));
        price.setFont(new Font("GT America" , Font.BOLD , 18));

        resultLabel.setBounds(160, 70, 300, 30);
        resultLabel.setLayout(new FlowLayout(FlowLayout.CENTER , 20 , 0));
        resultLabel.setFont(new Font("century gothic", Font.PLAIN, 20));
        resultLabel.setBackground(new Color(0x6e5ed4));
        resultLabel.setForeground(Color.black);
        resultLabel.addMouseListener(this);
        resultLabel.setVisible(false);
        resultLabel.setOpaque(true);
        resultLabel.add(text);
        resultLabel.add(price);

//______________________________________________________FileReader______________________________________________________
        categoryPage.foodName.clear();
            String line;
            BufferedReader nameReader = new BufferedReader(new FileReader("Data/FoodName.txt"));
            while ((line = nameReader.readLine()) != null) {
                categoryPage.foodName.add(line);
            }

        categoryPage.foodPrice.clear();
            String price;
            BufferedReader priceReader = new BufferedReader(new FileReader("Data/FoodPrice.txt"));
            while ((price = priceReader.readLine()) != null) {
                categoryPage.foodPrice.add(Integer.valueOf(price));
            }
        categoryPage.foodCode.clear();
            String code;
            BufferedReader codeReader = new BufferedReader(new FileReader("Data/FoodCode.txt"));
            while ((code = codeReader.readLine()) != null) {
                categoryPage.foodCode.add(Integer.valueOf(code));
            }
        categoryPage.availability.clear();
            String count;
            BufferedReader countReader = new BufferedReader(new FileReader("Data/Availability.txt"));
            while ((count = countReader.readLine()) != null) {
                categoryPage.availability.add(Integer.valueOf(count));
            }
        //---------------------------------------Parsa--added---------------------------------------------


        userLabel.setBounds(1020, -5, 300, 50);
        userLabel.setFont(new Font("Century gothic", Font.BOLD, 28));
        userLabel.setForeground(Color.white);

        emailLabel.setBounds(1020, 35, 300, 40);
        emailLabel.setFont(new Font("Century gothic", Font.BOLD, 15));
        emailLabel.setForeground(Color.white);

        addressLabel.setBounds(1020, 75, 300, 40);
        addressLabel.setFont(new Font("Century gothic", Font.BOLD, 15));
        addressLabel.setForeground(Color.white);

        payment.setText("Pay:        "+categoryPage.total+"$");
        payment.setBounds(1060 , 115 , 180 , 40);
        payment.setFont(new Font("GT America" , Font.BOLD , 15));
        payment.setBorder(new EmptyBorder(0,0,0,0));
        payment.setBackground(Color.white);
        payment.setForeground(new Color(40 , 25 , 132 ));
        payment.setOpaque(true);
        payment.addActionListener(this);
        payment.setVisible(false);

        if(categoryPage.loggedIn == 1){
            userLabel.setText(Main.userA.get(0));
            emailLabel.setText(Main.emailA.get(0));
            addressLabel.setText(Main.addressA.get(0));
            payment.setVisible(true);
        }

        JButton accBtn = new JButton("Account");
        accBtn.setBounds(810, 20, 85, 40);
        accBtn.setFocusable(false);
        accBtn.setOpaque(true);
        accBtn.setBackground(new Color(96 , 76 , 209));
        accBtn.setForeground(Color.white);
        accBtn.setBorder(new EmptyBorder(0,0,0,0));
        accBtn.addActionListener(e -> {
            new LoginPage();
        });

        JButton refBtn = new JButton("Refresh");
        refBtn.setBounds(900, 20, 85, 40);
        refBtn.setOpaque(true);
        refBtn.setFocusable(false);
        refBtn.setBackground(new Color(96 , 77 , 209));
        refBtn.setForeground(Color.white);
        refBtn.setBorder(new EmptyBorder(0,0,0,0));

        refBtn.addActionListener(e -> {

            Main.inCartFood.clear();
            Main.inCartPrice.clear();
            try {

                userLabel.setText(Main.userA.get(0));
                emailLabel.setText(Main.emailA.get(0));
                addressLabel.setText(Main.addressA.get(0));
                payment.setVisible(true);

                categoryPage.userLabel1.setText(Main.userA.get(0));
                categoryPage.emailLabel1.setText(Main.emailA.get(0));
                categoryPage.addressLabel1.setText(Main.addressA.get(0));

                favoriteFood.userLabel2.setText(Main.userA.get(0));
                favoriteFood.emailLabel2.setText(Main.emailA.get(0));
                favoriteFood.addressLabel2.setText(Main.addressA.get(0));

                if(refNum == 0 ){
                BufferedReader read = new BufferedReader(new FileReader("File/"+Main.userA.get(0) + ".txt"));
                String P = read.readLine();
                String E = read.readLine();
                String A = read.readLine();
                for(i = 0 ; i < categoryPage.foodName.size();i++){
                    String N = read.readLine();
                    if(N == null)break;
                    for(int j = 0 ; j < categoryPage.foodName.size();j++) {
                        if (N.equals(categoryPage.foodName.get(j))) {
                            categoryPage.cartIndex.add(categoryPage.foodName.get(j));
                            categoryPage.cartIndex1.add(j);
                            categoryPage.cartPanel.add(categoryPage.cartItem(categoryPage.foodName.get(j), categoryPage.foodPrice.get(j), categoryPage.totalP));
                            categoryPage.total += categoryPage.foodPrice.get(j);
                            categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
                            payment.setText("Pay:        "+categoryPage.total+"$");
                            break;
                            }
                        }
                    }
                refNum++;
                }
            }catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            } catch (IOException ioException) {
                ioException.printStackTrace();
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            }

        });
//        JTextField lineWillRemove = new JTextField();
//        lineWillRemove.setBounds(1145, 620, 40, 40);
//        lineWillRemove.setFont(new Font("", Font.BOLD, 30));
//
//        JButton dLastF = new JButton("remove food");
//        dLastF.setBounds(1020, 620, 120, 40);
//        dLastF.setFocusable(false);
//        dLastF.setBackground(Color.CYAN);
//        dLastF.addActionListener(e -> {
//            try {
//                try {
//                    if (!(lineWillRemove.getText().equals(""))) {
//                        Main.inCartFood.remove(Integer.parseInt(lineWillRemove.getText()) - 1);
//                        Main.inCartPrice.remove(Integer.parseInt(lineWillRemove.getText()) - 1);
//                    } else {
//                        Main.inCartFood.remove(Main.inCartFood.size() - 1);
//                        Main.inCartPrice.remove(Main.inCartPrice.size() - 1);
//                    }
//                } catch (Exception ex1) {
//                    JOptionPane.showMessageDialog(null, "Please type a right number");
//                }
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "First you must add something");
//            }
//            try {
//
//                File file = new File("File/"+Main.userA.get(0) + ".txt");
//
//                FileWriter wr = new FileWriter(file, false);
//                wr.write(Main.passA.get(0));
//                wr.write("\n" + Main.emailA.get(0));
//                wr.write("\n" + Main.addressA.get(0));
//
//                for (int i = 0; i < Main.inCartFood.size(); i++) {
//
//                    wr.write("\n" + Main.inCartFood.get(i));
//                    wr.write("\n" + Main.inCartPrice.get(i));
//
//                }
//
//                wr.write("\n");
//                wr.close();
//
//                Main.inCartFood.clear();
//                Main.inCartPrice.clear();
//
//
//                userLabel.setText(Main.userA.get(0));
//                emailLabel.setText(Main.emailA.get(0));
//                addressLabel.setText(Main.addressA.get(0));
//
//                BufferedReader read = new BufferedReader(new FileReader("File/"+Main.userA.get(0) + ".txt"));
//
//                int total = 0;
//
//                cartAreaN.setText("");
//                cartAreaP.setText("");
//
//                String P = read.readLine();
//                String E = read.readLine();
//                String A = read.readLine();
//                while (A != null) {
//
//                    A = read.readLine();
//                    if (A != null) {
//                        cartAreaN.append(A + "\n");
//                        Main.inCartFood.add(A);
//                    }
//                    A = read.readLine();
//                    if (A != null) {
//                        cartAreaP.append(A + " $" + "\n");
//                        total = total + Integer.parseInt(A);
//                        Main.inCartPrice.add(A);
//                    }
//                }
//                totalP.setText("Total purchase : " + total + " $");
//            } catch (FileNotFoundException ex) {
//                ex.printStackTrace();
//                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
//            } catch (IOException ioException) {
//                ioException.printStackTrace();
//                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
//            }

//        });


        //---------------------------------------Parsa--added---------------------------------------------

//______________________________________________________MainPanel_______________________________________________________
        mainPanel.setBounds(0, 0, 1300, 704);
        mainPanel.setBackground(new Color(255, 255, 255, 150));
        mainPanel.setVisible(false);
        mainFrame.add(mainPanel);

//______________________________________________________TopIcons________________________________________________________
        searchIcon.setBounds(495, 20, 42, 42);
        searchIcon.setIcon(searchIcon1);
        searchIcon.addMouseListener(this);

        searchText.setBounds(160, 30, 300, 26);
        searchText.setFont(new Font("century gothic", Font.PLAIN, 20));
        searchText.setForeground(new Color(0xFF939090));
        searchText.addMouseListener(this);
        searchText.addKeyListener(this);

//______________________________________________________TopLabel________________________________________________________

        BoyLabel.setIcon(BoyIcon);
        BoyLabel.setBounds(800, 95, 100, 100);

        CocaLabel.setIcon(CocaIcon);
        CocaLabel.setBounds(600, 36, 230, 222);

        GiftMassage.setText("Get free one cup \nCoca cola everytime\nyou order over $5");
        GiftMassage.setBounds(160, 120, 450, 110);
        GiftMassage.setBackground(new Color(0xfff2e4));
        GiftMassage.setEditable(false);
        GiftMassage.setFont(new Font("century gothic", Font.ITALIC, 25));

//______________________________________________________LeftLabel_______________________________________________________

        homeIcon.setBounds(15, 80, 45, 45);
        homeIcon.setIcon(homeIcon1);
        homeIcon.addMouseListener(this);

        categoryIcon.setBounds(15, 180, 45, 45);
        categoryIcon.setIcon(categoryIcon2);
        categoryIcon.addMouseListener(this);

        heartIcon.setBounds(15, 280, 45, 45);
        heartIcon.setIcon(heartIcon2);
        heartIcon.addMouseListener(this);

        aboutUsIcon.setBounds(15, 380, 45, 45);
        aboutUsIcon.setIcon(aboutUsIcon2);
        aboutUsIcon.addMouseListener(this);

        exitIcon.setBounds(15, 600, 45, 45);
        exitIcon.setIcon(exitIcon2);
        exitIcon.addMouseListener(this);

//______________________________________________________AboutUsFrame____________________________________________________

//      JFrame aboutUsFrame = new JFrame("About Us");
        aboutUsFrame.setSize(345, 345);
        aboutUsFrame.setResizable(false);
        aboutUsFrame.setLocationRelativeTo(null);

        JTextArea aboutUsText = new JTextArea();
        aboutUsText.setBounds(0, 0, 345, 345);
        aboutUsText.setFont(new Font("Azonix", Font.PLAIN, 16));
        aboutUsText.setEditable(false);
        aboutUsText.setText("\n\n               JFOOD      consists     of\n               three    creative   people\n               who  are  active   in   the\n               field of Java programming.\n\n                    Majid Hosseinzadeh\n                       Alireza Hamedi\n                        Parsa Chavoshi\n\n                      It’s a Whole New\n                       Neighbourhood.\n\n\t  GOOD LUCK ");

        aboutUsFrame.add(aboutUsText);

        /*MainPanel*/
        JPanel mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 1300, 704);
        mainPanel.setLayout(null);

        /*BackGroundLabel*/
        JLabel backGround = new JLabel();
        backGround.setBounds(0, 0, 1350, 720);
        backGround.setIcon(mainBackGround);


        mainPanel.add(accBtn);
        mainPanel.add(refBtn);
//        mainPanel.add(dLastF);
//        mainPanel.add(lineWillRemove);

        mainPanel.add(userLabel);
        mainPanel.add(emailLabel);
        mainPanel.add(addressLabel);

//        mainPanel.add(numberArea);


//______________________________________________________SlidePanel______________________________________________________



        ImageIcon FiveStar = new ImageIcon(new ImageIcon("Image/FiveStar.png").getImage().getScaledInstance(100 , 20 , Image.SCALE_DEFAULT));
        ImageIcon FourStar = new ImageIcon(new ImageIcon("Image/FourStar.png").getImage().getScaledInstance(100 , 20 , Image.SCALE_DEFAULT));
        ImageIcon ThreeStar = new ImageIcon(new ImageIcon("Image/ThreeStar.png").getImage().getScaledInstance(100 , 20 , Image.SCALE_DEFAULT));
        ImageIcon TwoStar = new ImageIcon(new ImageIcon("Image/TwoStar.png").getImage().getScaledInstance(100 , 20 , Image.SCALE_DEFAULT));
        ImageIcon OneStar = new ImageIcon(new ImageIcon("Image/OneStar.png").getImage().getScaledInstance(100 , 20 , Image.SCALE_DEFAULT));





//______________________________________________________PepperoniPizza__________________________________________________

        pepperoni = new ImageIcon(new ImageIcon("Image/pepperoniPizza.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        pepperoniB = new ImageIcon(new ImageIcon("Image/pepperoniPizzaB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        offP = new ImageIcon(new ImageIcon("Image/offBox.png").getImage().getScaledInstance(70 , 30 ,Image.SCALE_DEFAULT));

        offText1 = new JLabel("20% OFF");
        offText1.setFont(new Font("GT America" , Font.BOLD , 10));
        offText1.setBounds(153 , 15 , 60 , 10);

        offBox1 = new JLabel();
        offBox1.setBounds(140 , 5 , 70 , 30);
        offBox1.setIcon(offP);

        pp = new JLabel();
        pp.setBounds(0 , 0 , 220 , 110);
        pp.setIcon(pepperoni);
        pp.addMouseListener(this);


        JLayeredPane PPizza = new JLayeredPane();
        PPizza.setOpaque(true);
        PPizza.setLayout(null);
        PPizza.setPreferredSize(new Dimension(220 , 110));
        PPizza.add(offText1);
        PPizza.add(offBox1);
        PPizza.add(pp);

        foodName1 = new JLabel(categoryPage.foodName.get(0));
        foodName1.setFont(new Font("GT America" , Font.BOLD , 20));
        foodName1.setPreferredSize(new Dimension(165 , 30));
        foodName1.addMouseListener(this);


        foodPrice1 = new JLabel("250g              27$");
        foodPrice1.setFont(new Font("GT America" , Font.BOLD , 13));
        foodPrice1.setForeground(new Color(144 , 143 , 148));
        foodPrice1.setPreferredSize(new Dimension(120 , 20));


        foodRate1 = new JLabel();
        foodRate1.setIcon(FiveStar);
        foodRate1.setPreferredSize(new Dimension(120 , 20));

        JPanel pepperoniPizza = new JPanel();
        pepperoniPizza.setOpaque(true);
        pepperoniPizza.setBackground(new Color(245 , 245 , 254));
        pepperoniPizza.setPreferredSize(new Dimension(220 , 260));
        pepperoniPizza.setLayout(new FlowLayout(FlowLayout.CENTER , 0 , 5));
        pepperoniPizza.add(PPizza);
        pepperoniPizza.add(foodName1);
        pepperoniPizza.add(foodPrice1);
        pepperoniPizza.add(foodRate1);

//______________________________________________________CesarSalad______________________________________________________

        cesar = new ImageIcon(new ImageIcon("Image/CesarSalad.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        cesarB = new ImageIcon(new ImageIcon("Image/CesarSaladB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        offText2 = new JLabel("18% OFF");
        offText2.setFont(new Font("GT America" , Font.BOLD , 10));
        offText2.setBounds(153 , 15 , 60 , 10);

        offBox2 = new JLabel();
        offBox2.setBounds(140 , 5 , 70 , 30);
        offBox2.setIcon(offP);

        cs = new JLabel();
        cs.setBounds(0 , 0 , 220 , 110);
        cs.setIcon(cesar);
        cs.addMouseListener(this);

        JLayeredPane CSalad = new JLayeredPane();
        CSalad.setOpaque(true);
        CSalad.setLayout(null);
        CSalad.setPreferredSize(new Dimension(220 , 110));
        CSalad.add(offText2);
        CSalad.add(offBox2);
        CSalad.add(cs);


        foodName2 = new JLabel(categoryPage.foodName.get(33));
        foodName2.setFont(new Font("GT America" , Font.BOLD , 20));
        foodName2.setPreferredSize(new Dimension(120 , 30));
        foodName2.addMouseListener(this);

        foodPrice2 = new JLabel("250g              15$");
        foodPrice2.setFont(new Font("GT America" , Font.BOLD , 13));
        foodPrice2.setForeground(new Color(144 , 143 , 148));
        foodPrice2.setPreferredSize(new Dimension(101 , 20));


        foodRate2 = new JLabel();
        foodRate2.setIcon(FourStar);
        foodRate2.setPreferredSize(new Dimension(105 , 20));


        JPanel cesarSalad = new JPanel();
        cesarSalad.setOpaque(true);
        cesarSalad.setBackground(new Color(245 , 245 , 254));
        cesarSalad.setPreferredSize(new Dimension(220 , 260));
        cesarSalad.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 5));
        cesarSalad.add(CSalad);
        cesarSalad.add(foodName2);
        cesarSalad.add(foodPrice2);
        cesarSalad.add(foodRate2);


//______________________________________________________FettuccineAlfredo_______________________________________________

        cheeseBurger = new ImageIcon(new ImageIcon("Image/cheeseBurger.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        cheeseBurgerB = new ImageIcon(new ImageIcon("Image/cheeseBurgerB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        offText3 = new JLabel("25% OFF");
        offText3.setFont(new Font("GT America" , Font.BOLD , 10));
        offText3.setBounds(153 , 15 , 60 , 10);

        offBox3 = new JLabel();
        offBox3.setBounds(140 , 5 , 70 , 30);
        offBox3.setIcon(offP);

        fa = new JLabel();
        fa.setBounds(0 , 0 , 220 , 110);
        fa.setIcon(cheeseBurger);
        fa.addMouseListener(this);

        JLayeredPane FAlfredo = new JLayeredPane();
        FAlfredo.setOpaque(true);
        FAlfredo.setLayout(null);
        FAlfredo.setPreferredSize(new Dimension(220 , 110));
        FAlfredo.add(offText3);
        FAlfredo.add(offBox3);
        FAlfredo.add(fa);

        foodName3 = new JLabel(categoryPage.foodName.get(12));
        foodName3.setFont(new Font("GT America" , Font.BOLD , 20));
        foodName3.setPreferredSize(new Dimension(150 , 30));
        foodName3.addMouseListener(this);

        foodPrice3 = new JLabel("250g              23$");
        foodPrice3.setFont(new Font("GT America" , Font.BOLD , 13));
        foodPrice3.setForeground(new Color(144 , 143 , 148));
        foodPrice3.setPreferredSize(new Dimension(101 , 20));


        foodRate3 = new JLabel();
        foodRate3.setIcon(FiveStar);
        foodRate3.setPreferredSize(new Dimension(105 , 20));


        JPanel fettuccineAlfredo = new JPanel();
        fettuccineAlfredo.setOpaque(true);
        fettuccineAlfredo.setBackground(new Color(245 , 245 , 254));
        fettuccineAlfredo.setPreferredSize(new Dimension(220 , 260));
        fettuccineAlfredo.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 5));
        fettuccineAlfredo.add(FAlfredo);
        fettuccineAlfredo.add(foodName3);
        fettuccineAlfredo.add(foodPrice3);
        fettuccineAlfredo.add(foodRate3);









//______________________________________________________HotDog____________________________________________________

        hotdog = new ImageIcon(new ImageIcon("Image/hotdog.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        hotdogB = new ImageIcon(new ImageIcon("Image/hotdogB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        offText4 = new JLabel("20% OFF");
        offText4.setFont(new Font("GT America" , Font.BOLD , 10));
        offText4.setBounds(153 , 15 , 60 , 10);

        offBox4 = new JLabel();
        offBox4.setBounds(140 , 5 , 70 , 30);
        offBox4.setIcon(offP);

        h = new JLabel();
        h.setBounds(0 , 0 , 220 , 110);
        h.setIcon(hotdog);
        h.addMouseListener(this);


        JLayeredPane H = new JLayeredPane();
        H.setOpaque(true);
        H.setLayout(null);
        H.setPreferredSize(new Dimension(220 , 110));
        H.add(offText4);
        H.add(offBox4);
        H.add(h);

        foodName4 = new JLabel(categoryPage.foodName.get(18));
        foodName4.setFont(new Font("GT America" , Font.BOLD , 20));
        foodName4.setPreferredSize(new Dimension(100 , 30));
        foodName4.addMouseListener(this);

        foodPrice4 = new JLabel("250g              20$");
        foodPrice4.setFont(new Font("GT America" , Font.BOLD , 13));
        foodPrice4.setForeground(new Color(144 , 143 , 148));
        foodPrice4.setPreferredSize(new Dimension(101 , 20));


        foodRate4 = new JLabel();
        foodRate4.setIcon(FiveStar);
        foodRate4.setPreferredSize(new Dimension(100 , 20));

        JPanel Hotdog = new JPanel();
        Hotdog.setOpaque(true);
        Hotdog.setBackground(new Color(245 , 245 , 254));
        Hotdog.setPreferredSize(new Dimension(220 , 260));
        Hotdog.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 5));
        Hotdog.add(H);
        Hotdog.add(foodName4);
        Hotdog.add(foodPrice4);
        Hotdog.add(foodRate4);




//______________________________________________________StrawberryPannaCotta____________________________________________

        mojito = new ImageIcon(new ImageIcon("Image/mojito.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        mojitoB = new ImageIcon(new ImageIcon("Image/mojitoB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        offText5 = new JLabel("30% OFF");
        offText5.setFont(new Font("GT America" , Font.BOLD , 10));
        offText5.setBounds(153 , 15 , 60 , 10);

        offBox5 = new JLabel();
        offBox5.setBounds(140 , 5 , 70 , 30);
        offBox5.setIcon(offP);

        sp = new JLabel();
        sp.setBounds(0 , 0 , 220 , 110);
        sp.setIcon(mojito);
        sp.addMouseListener(this);


        JLayeredPane SP = new JLayeredPane();
        SP.setOpaque(true);
        SP.setLayout(null);
        SP.setPreferredSize(new Dimension(220 , 110));
        SP.add(offText5);
        SP.add(offBox5);
        SP.add(sp);

        foodName5 = new JLabel(categoryPage.foodName.get(31));
        foodName5.setFont(new Font("GT America" , Font.BOLD , 20));
        foodName5.setPreferredSize(new Dimension(105 , 30));
        foodName5.addMouseListener(this);

        foodPrice5 = new JLabel("150g              6$");
        foodPrice5.setFont(new Font("GT America" , Font.BOLD , 13));
        foodPrice5.setForeground(new Color(144 , 143 , 148));
        foodPrice5.setPreferredSize(new Dimension(100 , 20));


        foodRate5 = new JLabel();
        foodRate5.setIcon(FiveStar);
        foodRate5.setPreferredSize(new Dimension(101 , 20));

        JPanel Mojito = new JPanel();
        Mojito.setOpaque(true);
        Mojito.setBackground(new Color(245 , 245 , 254));
        Mojito.setPreferredSize(new Dimension(220 , 260));
        Mojito.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 5));
        Mojito.add(SP);
        Mojito.add(foodName5);
        Mojito.add(foodPrice5);
        Mojito.add(foodRate5);





//______________________________________________________FriedChicken____________________________________________________

        friedChicken = new ImageIcon(new ImageIcon("Image/friedChicken.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        friedChickenB = new ImageIcon(new ImageIcon("Image/friedChickenB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        offText6 = new JLabel("32% OFF");
        offText6.setFont(new Font("GT America" , Font.BOLD , 10));
        offText6.setBounds(153 , 15 , 60 , 10);

        offBox6 = new JLabel();
        offBox6.setBounds(140 , 5 , 70 , 30);
        offBox6.setIcon(offP);

        fc = new JLabel();
        fc.setBounds(0 , 0 , 220 , 110);
        fc.setIcon(friedChicken);
        fc.addMouseListener(this);


        JLayeredPane FC = new JLayeredPane();
        FC.setOpaque(true);
        FC.setLayout(null);
        FC.setPreferredSize(new Dimension(220 , 110));
        FC.add(offText6);
        FC.add(offBox6);
        FC.add(fc);

        foodName6 = new JLabel(categoryPage.foodName.get(21));
        foodName6.setFont(new Font("GT America" , Font.BOLD , 20));
        foodName6.setPreferredSize(new Dimension(101 , 30));
        foodName6.addMouseListener(this);

        foodPrice6 = new JLabel("250g              17$");
        foodPrice6.setFont(new Font("GT America" , Font.BOLD , 13));
        foodPrice6.setForeground(new Color(144 , 143 , 148));
        foodPrice6.setPreferredSize(new Dimension(101 , 20));


        foodRate6 = new JLabel();
        foodRate6.setIcon(FiveStar);
        foodRate6.setPreferredSize(new Dimension(100 , 20));

        JPanel FriedChicken = new JPanel();
        FriedChicken.setOpaque(true);
        FriedChicken.setBackground(new Color(245 , 245 , 254));
        FriedChicken.setPreferredSize(new Dimension(220 , 260));
        FriedChicken.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 5));
        FriedChicken.add(FC);
        FriedChicken.add(foodName6);
        FriedChicken.add(foodPrice6);
        FriedChicken.add(foodRate6);



//______________________________________________________SpecialBurger___________________________________________________

        burger = new ImageIcon(new ImageIcon("Image/Burger.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        burgerB = new ImageIcon(new ImageIcon("Image/BurgerB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        offText7 = new JLabel("12% OFF");
        offText7.setFont(new Font("GT America" , Font.BOLD , 10));
        offText7.setBounds(153 , 15 , 60 , 10);

        offBox7 = new JLabel();
        offBox7.setBounds(140 , 5 , 70 , 30);
        offBox7.setIcon(offP);

        sb = new JLabel();
        sb.setBounds(0 , 0 , 220 , 110);
        sb.setIcon(burger);
        sb.addMouseListener(this);


        JLayeredPane SB = new JLayeredPane();
        SB.setOpaque(true);
        SB.setLayout(null);
        SB.setPreferredSize(new Dimension(220 , 110));
        SB.add(offText7);
        SB.add(offBox7);
        SB.add(sb);

        foodName7 = new JLabel(categoryPage.foodName.get(9));
        foodName7.setFont(new Font("GT America" , Font.BOLD , 20));
        foodName7.setPreferredSize(new Dimension(150 , 30));
        foodName7.addMouseListener(this);

        foodPrice7 = new JLabel("250g              25$");
        foodPrice7.setFont(new Font("GT America" , Font.BOLD , 13));
        foodPrice7.setForeground(new Color(144 , 143 , 148));
        foodPrice7.setPreferredSize(new Dimension(101 , 20));


        foodRate7 = new JLabel();
        foodRate7.setIcon(FiveStar);
        foodRate7.setPreferredSize(new Dimension(100 , 20));




        JPanel SpecialBurger = new JPanel();
        SpecialBurger.setOpaque(true);
        SpecialBurger.setBackground(new Color(245 , 245 , 254));
        SpecialBurger.setPreferredSize(new Dimension(220 , 260));
        SpecialBurger.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 5));
        SpecialBurger.add(SB);
        SpecialBurger.add(foodName7);
        SpecialBurger.add(foodPrice7);
        SpecialBurger.add(foodRate7);



//______________________________________________________Sushi___________________________________________________________

        jFoodBox = new ImageIcon(new ImageIcon("Image/jFoodBox.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        jFoodBoxB = new ImageIcon(new ImageIcon("Image/jFoodBoxB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        offText8 = new JLabel("15% OFF");
        offText8.setFont(new Font("GT America" , Font.BOLD , 10));
        offText8.setBounds(153 , 15 , 60 , 10);

        offBox8 = new JLabel();
        offBox8.setBounds(140 , 5 , 70 , 30);
        offBox8.setIcon(offP);

        s = new JLabel();
        s.setBounds(0 , 0 , 220 , 110);
        s.setIcon(jFoodBox);
        s.addMouseListener(this);


        JLayeredPane S = new JLayeredPane();
        S.setOpaque(true);
        S.setLayout(null);
        S.setPreferredSize(new Dimension(220 , 110));
        S.add(offText8);
        S.add(offBox8);
        S.add(s);

        foodName8 = new JLabel(categoryPage.foodName.get(25));
        foodName8.setFont(new Font("GT America" , Font.BOLD , 20));
        foodName8.setPreferredSize(new Dimension(100 , 30));
        foodName8.addMouseListener(this);

        foodPrice8 = new JLabel("250g              40$");
        foodPrice8.setFont(new Font("GT America" , Font.BOLD , 13));
        foodPrice8.setForeground(new Color(144 , 143 , 148));
        foodPrice8.setPreferredSize(new Dimension(101 , 20));


        foodRate8 = new JLabel();
        foodRate8.setIcon(ThreeStar);
        foodRate8.setPreferredSize(new Dimension(100 , 20));

        JPanel Sushi = new JPanel();
        Sushi.setOpaque(true);
        Sushi.setBackground(new Color(245 , 245 , 254));
        Sushi.setPreferredSize(new Dimension(220 , 260));
        Sushi.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 5));
        Sushi.add(S);
        Sushi.add(foodName8);
        Sushi.add(foodPrice8);
        Sushi.add(foodRate8);



        JPanel empty = new JPanel();
        empty.setOpaque(true);
        empty.setBackground(new Color(245 , 245 , 254));
        empty.setPreferredSize(new Dimension(220 , 260));




        JLabel title = new JLabel("   Hot Deals");
        title.setPreferredSize(new Dimension(935 , 40));
        title.setFont(new Font("GT America" , Font.BOLD , 19));
        title.setForeground(Color.BLACK);

        leftArrow = new ImageIcon(new ImageIcon("Image/leftArrow.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        leftArrowB = new ImageIcon(new ImageIcon("Image/leftArrow.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

        leftPointer = new JLabel();
        leftPointer.setPreferredSize(new Dimension(30 , 220));
        leftPointer.setIcon(leftArrow);
        leftPointer.addMouseListener(this);

        rightArrow = new ImageIcon(new ImageIcon("Image/rightArrow.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
        rightArrowB = new ImageIcon(new ImageIcon("Image/rightArrow.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

        rightPointer = new JLabel();
        rightPointer.setPreferredSize(new Dimension(30 , 220));
        rightPointer.setIcon(rightArrow);
        rightPointer.addMouseListener(this);


        slidePanel1 = new JPanel();
        slidePanel1.setLayout(new FlowLayout(FlowLayout.CENTER , 47 , 0));
        slidePanel1.setOpaque(true);
        slidePanel1.setBackground(new Color(245 ,245 , 254));
        slidePanel1.add(pepperoniPizza);
        slidePanel1.add(cesarSalad);
        slidePanel1.add(fettuccineAlfredo);


        slidePanel2 = new JPanel();
        slidePanel2.setLayout(new FlowLayout(FlowLayout.CENTER , 47 , 0));
        slidePanel2.setOpaque(true);
        slidePanel2.setBackground(new Color(245 ,245 , 254));
        slidePanel2.add(Hotdog);
        slidePanel2.add(Mojito);
        slidePanel2.add(FriedChicken);
        slidePanel2.setVisible(false);


        slidePanel3 = new JPanel();
        slidePanel3.setLayout(new FlowLayout(FlowLayout.CENTER , 47 , 0));
        slidePanel3.setOpaque(true);
        slidePanel3.setBackground(new Color(245 ,245 , 254));
        slidePanel3.add(SpecialBurger);
        slidePanel3.add(Sushi);
        slidePanel3.add(empty);
        slidePanel3.setVisible(false);




        centerPanel = new JPanel();
        centerPanel.setBounds(65 , 250 , 935 , 250);
        centerPanel.setOpaque(true);
        centerPanel.setBackground(new Color(245 ,245 , 254));
        centerPanel.setLayout(new FlowLayout(FlowLayout.CENTER , 0 , 0));
        centerPanel.add(title);
        centerPanel.add(leftPointer);
        centerPanel.add(slidePanel1);
        centerPanel.add(slidePanel2);
        centerPanel.add(slidePanel3);
        centerPanel.add(rightPointer);


//______________________________________________________Categories______________________________________________________
        ctg1 = new ImageIcon("Image/CTG1.png");
        ctg2 = new ImageIcon("Image/CTG2.png");

        pizzaImg = new ImageIcon("Image/PizzaImg.png");
        sandwichImg = new ImageIcon("Image/SandwichImg.png");
        burgerImg = new ImageIcon("Image/BurgerImg.png");
        chickenImg = new ImageIcon("Image/ChickenImg.png");
        drinkImg = new ImageIcon("Image/DrinkImg.png");
        saladImg = new ImageIcon("Image/SaladImg.png");


        pizzaBg = new JLabel();
        pizzaBg.setBounds(0, 0, 90, 125);
        pizzaBg.setIcon(ctg1);
        pizzaBg.addMouseListener(this);

        JLabel pizzaI = new JLabel();
        pizzaI.setBounds(18, 38, 48, 48);
        pizzaI.setIcon(pizzaImg);

        JLayeredPane pizzaCtg = new JLayeredPane();
        pizzaCtg.setOpaque(true);
        pizzaCtg.setPreferredSize(new Dimension(90, 125));
        pizzaCtg.setBackground(new Color(245, 245, 254));
        pizzaCtg.setLayout(null);
        pizzaCtg.add(pizzaI);
        pizzaCtg.add(pizzaBg);


        burgerBg = new JLabel();
        burgerBg.setBounds(0, 0, 90, 125);
        burgerBg.setIcon(ctg1);
        burgerBg.addMouseListener(this);

        JLabel burgerI = new JLabel();
        burgerI.setBounds(18, 38, 48, 48);
        burgerI.setIcon(burgerImg);

        JLayeredPane burgerCtg = new JLayeredPane();
        burgerCtg.setOpaque(true);
        burgerCtg.setPreferredSize(new Dimension(90, 125));
        burgerCtg.setBackground(new Color(245, 245, 254));
        burgerCtg.setLayout(null);
        burgerCtg.add(burgerI);
        burgerCtg.add(burgerBg);


        sandwichBg = new JLabel();
        sandwichBg.setBounds(0, 0, 90, 125);
        sandwichBg.setIcon(ctg1);
        sandwichBg.addMouseListener(this);

        JLabel sandwichI = new JLabel();
        sandwichI.setBounds(18, 38, 48, 48);
        sandwichI.setIcon(sandwichImg);

        JLayeredPane sandwichCtg = new JLayeredPane();
        sandwichCtg.setOpaque(true);
        sandwichCtg.setPreferredSize(new Dimension(90, 125));
        sandwichCtg.setBackground(new Color(245, 245, 254));
        sandwichCtg.setLayout(null);
        sandwichCtg.add(sandwichI);
        sandwichCtg.add(sandwichBg);


        chickenBg = new JLabel();
        chickenBg.setBounds(0, 0, 90, 125);
        chickenBg.setIcon(ctg1);
        chickenBg.addMouseListener(this);

        JLabel chickenI = new JLabel();
        chickenI.setBounds(18, 38, 48, 48);
        chickenI.setIcon(chickenImg);

        JLayeredPane chickenCtg = new JLayeredPane();
        chickenCtg.setOpaque(true);
        chickenCtg.setPreferredSize(new Dimension(90, 125));
        chickenCtg.setBackground(new Color(245, 245, 254));
        chickenCtg.setLayout(null);

        chickenCtg.add(chickenI);
        chickenCtg.add(chickenBg);


        drinkBg = new JLabel();
        drinkBg.setBounds(0, 0, 90, 125);
        drinkBg.setIcon(ctg1);
        drinkBg.addMouseListener(this);

        JLabel drinkI = new JLabel();
        drinkI.setBounds(18, 38, 48, 48);
        drinkI.setIcon(drinkImg);

        JLayeredPane drinkCtg = new JLayeredPane();
        drinkCtg.setOpaque(true);
        drinkCtg.setPreferredSize(new Dimension(90, 125));
        drinkCtg.setBackground(new Color(245, 245, 254));
        drinkCtg.setLayout(null);
        drinkCtg.add(drinkI);
        drinkCtg.add(drinkBg);


        saladBg = new JLabel();
        saladBg.setBounds(0, 0, 90, 125);
        saladBg.setIcon(ctg1);
        saladBg.addMouseListener(this);

        JLabel saladI = new JLabel();
        saladI.setBounds(18, 38, 48, 48);
        saladI.setIcon(saladImg);

        JLayeredPane saladCtg = new JLayeredPane();
        saladCtg.setOpaque(true);
        saladCtg.setPreferredSize(new Dimension(90, 125));
        saladCtg.setBackground(new Color(245, 245, 254));
        saladCtg.setLayout(null);
        saladCtg.add(saladI);
        saladCtg.add(saladBg);


        CategoryPanel = new JPanel();
        CategoryPanel.setBounds(65, 500, 935, 135);
        CategoryPanel.setOpaque(true);
        CategoryPanel.setBackground(new Color(245, 245, 254));
        CategoryPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 5));
        CategoryPanel.add(pizzaCtg);
        CategoryPanel.add(burgerCtg);
        CategoryPanel.add(sandwichCtg);
        CategoryPanel.add(chickenCtg);
        CategoryPanel.add(drinkCtg);
        CategoryPanel.add(saladCtg);

        TimeFormat = new SimpleDateFormat("hh:mm:ss a");
        DayFormat = new SimpleDateFormat("EEEE");
        DateFormat = new SimpleDateFormat("dd/ MM/ yyyy");


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

//______________________________________________________Adding__________________________________________________________
        mainPanel.add(itemScroll);
        mainPanel.add(buyPanel);
        mainPanel.add(resultLabel);
        mainPanel.add(payment);
        mainPanel.add(centerPanel);
        mainPanel.add(searchText);
        mainPanel.add(searchIcon);
        mainPanel.add(homeIcon);
        mainPanel.add(categoryIcon);
        mainPanel.add(heartIcon);
        mainPanel.add(aboutUsIcon);
        mainPanel.add(exitIcon);
        mainPanel.add(CocaLabel);
        mainPanel.add(GiftMassage);
        mainPanel.add(TopLabel);
        mainPanel.add(CategoryPanel);

        mainPanel.add(backGround);

//______________________________________________________MainFrame_______________________________________________________
        mainFrame.setSize(1300, 704);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setLayout(null);
        mainFrame.add(mainPanel);
//______________________________________________________SlidePanel______________________________________________________

        mainFrame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//______________________________________________________LeftSideIcons MouseC____________________________________________
        if (e.getSource() == homeIcon) {
            homeIcon.setIcon(homeIcon1);
            categoryIcon.setIcon(categoryIcon2);
            heartIcon.setIcon(heartIcon2);
            aboutUsIcon.setIcon(aboutUsIcon2);
            exitIcon.setIcon(exitIcon2);
        }
        if (e.getSource() == categoryIcon) {
            homeIcon.setIcon(homeIcon2);
            categoryIcon.setIcon(categoryIcon1);
            heartIcon.setIcon(heartIcon2);
            aboutUsIcon.setIcon(aboutUsIcon2);
            exitIcon.setIcon(exitIcon2);
            try {
                new categoryPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            mainFrame.dispose();
        }
        if (e.getSource() == heartIcon) {
            homeIcon.setIcon(homeIcon2);
            categoryIcon.setIcon(categoryIcon2);
            heartIcon.setIcon(heartIcon1);
            aboutUsIcon.setIcon(aboutUsIcon2);
            exitIcon.setIcon(exitIcon2);
            new favoriteFood();
            mainFrame.dispose();
        }
        if (e.getSource() == aboutUsIcon) {
            homeIcon.setIcon(homeIcon2);
            categoryIcon.setIcon(categoryIcon2);
            heartIcon.setIcon(heartIcon2);
            aboutUsIcon.setIcon(aboutUsIcon1);
            exitIcon.setIcon(exitIcon2);
            aboutUsFrame.setVisible(true);
        }
        if (e.getSource() == exitIcon) {
            homeIcon.setIcon(homeIcon2);
            categoryIcon.setIcon(categoryIcon2);
            heartIcon.setIcon(heartIcon2);
            aboutUsIcon.setIcon(aboutUsIcon2);
            exitIcon.setIcon(exitIcon1);
            mainFrame.dispose();
        }
//______________________________________________________SearchField MouseC______________________________________________
        if (e.getSource() == searchText) {
            searchText.setText("");
            searchText.setForeground(Color.DARK_GRAY);

//______________________________________________________Pointers MouseC_________________________________________________

        } else if (e.getSource() == rightPointer) {
            if (page == 1) {
                slidePanel1.setVisible(false);
                slidePanel2.setVisible(true);
                page = 2;
            } else if (page == 2) {
                slidePanel2.setVisible(false);
                slidePanel3.setVisible(true);
                page = 3;
            } else if (page == 3) {
                slidePanel3.setVisible(false);
                slidePanel1.setVisible(true);
                page = 1;
            }
        } else if (e.getSource() == leftPointer) {
            if (page == 1) {
                slidePanel1.setVisible(false);
                slidePanel3.setVisible(true);
                page = 3;
            } else if (page == 2) {
                slidePanel2.setVisible(false);
                slidePanel1.setVisible(true);
                page = 1;
            } else if (page == 3) {
                slidePanel3.setVisible(false);
                slidePanel2.setVisible(true);
                page = 2;
            }
        }

//______________________________________________________Categories MouseC_______________________________________________
        if (e.getSource() == pizzaBg) {

            selectedCategory =1;
            pizzaBg.setIcon(ctg2);
            try {
                new categoryPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            mainFrame.dispose();
        } else if (e.getSource() == sandwichBg) {

            selectedCategory =3;
            sandwichBg.setIcon(ctg2);
            try {
                new categoryPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            mainFrame.dispose();
        } else if (e.getSource() == burgerBg) {

            selectedCategory =2;
            burgerBg.setIcon(ctg2);
            try {
                new categoryPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            mainFrame.dispose();
        } else if (e.getSource() == chickenBg) {

            selectedCategory =4;
            chickenBg.setIcon(ctg2);
            try {
                new categoryPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            mainFrame.dispose();
        } else if (e.getSource() == drinkBg) {

            selectedCategory =5;
            drinkBg.setIcon(ctg2);
            try {
                new categoryPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            mainFrame.dispose();
        } else if (e.getSource() == saladBg) {

            selectedCategory =6;
            saladBg.setIcon(ctg2);
            try {
                new categoryPage();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            mainFrame.dispose();
        }else if(e.getSource() == foodName1){
            if(categoryPage.loggedIn == 1) {
                if(categoryPage.availability.get(0) != 0) {
                    categoryPage.availability.set(0, categoryPage.availability.get(0) - 1);
                    categoryPage.cartPanel.add(categoryPage.cartItem(categoryPage.foodName.get(0), categoryPage.foodPrice.get(0), categoryPage.totalP));
                    categoryPage.cartIndex.add(categoryPage.foodName.get(0));
                    categoryPage.cartIndex1.add(0);
                    categoryPage.total += categoryPage.foodPrice.get(0);
                    categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
                }else{
                    categoryPage.cart1.setIcon( categoryPage.unavailable);
                    categoryPage.cart1.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            }
        }else if(e.getSource() == foodName2){
            if(categoryPage.loggedIn == 1) {
                if(categoryPage.availability.get(33) != 0) {
                    categoryPage.availability.set(33, categoryPage.availability.get(33) - 1);
                    categoryPage.cartPanel.add(categoryPage.cartItem(categoryPage.foodName.get(33), categoryPage.foodPrice.get(33), categoryPage.totalP));
                    categoryPage.cartIndex.add(categoryPage.foodName.get(33));
                    categoryPage.cartIndex1.add(33);
                    categoryPage.total += categoryPage.foodPrice.get(33);
                    categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
                }else{
                    categoryPage.cart34.setIcon( categoryPage.unavailable);
                    categoryPage.cart34.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            }
        }else if(e.getSource() == foodName3){
            if(categoryPage.loggedIn == 1) {
                if(categoryPage.availability.get(12) != 0) {
                    categoryPage.availability.set(12, categoryPage.availability.get(12) - 1);
                    categoryPage.cartPanel.add(categoryPage.cartItem(categoryPage.foodName.get(12), categoryPage.foodPrice.get(12), categoryPage.totalP));
                    categoryPage.cartIndex.add(categoryPage.foodName.get(12));
                    categoryPage.cartIndex1.add(12);
                    categoryPage.total += categoryPage.foodPrice.get(12);
                    categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
                }else{
                    categoryPage.cart13.setIcon( categoryPage.unavailable);
                    categoryPage.cart13.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            }
        }else if(e.getSource() == foodName4){
            if(categoryPage.loggedIn == 1) {
                if(categoryPage.availability.get(18) != 0) {
                    categoryPage.availability.set(18, categoryPage.availability.get(18) - 1);
                    categoryPage.cartPanel.add(categoryPage.cartItem(categoryPage.foodName.get(18), categoryPage.foodPrice.get(18), categoryPage.totalP));
                    categoryPage.cartIndex.add(categoryPage.foodName.get(18));
                    categoryPage.cartIndex1.add(18);
                    categoryPage.total += categoryPage.foodPrice.get(18);
                    categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
                }else{
                    categoryPage.cart19.setIcon( categoryPage.unavailable);
                    categoryPage.cart19.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            }
        }else if(e.getSource() == foodName5){
            if(categoryPage.loggedIn == 1) {
                if(categoryPage.availability.get(31) != 0) {
                    categoryPage.availability.set(31, categoryPage.availability.get(31) - 1);
                    categoryPage.cartPanel.add(categoryPage.cartItem(categoryPage.foodName.get(31), categoryPage.foodPrice.get(31), categoryPage.totalP));
                    categoryPage.cartIndex.add(categoryPage.foodName.get(31));
                    categoryPage.cartIndex1.add(31);
                    categoryPage.total += categoryPage.foodPrice.get(31);
                    categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
                }else{
                    categoryPage.cart32.setIcon( categoryPage.unavailable);
                    categoryPage.cart32.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            }
        }else if(e.getSource() == foodName6){
            if(categoryPage.loggedIn == 1) {
                if(categoryPage.availability.get(21) != 0) {
                    categoryPage.availability.set(21, categoryPage.availability.get(21) - 1);
                    categoryPage.cartPanel.add(categoryPage.cartItem(categoryPage.foodName.get(21), categoryPage.foodPrice.get(21), categoryPage.totalP));
                    categoryPage.cartIndex.add(categoryPage.foodName.get(21));
                    categoryPage.cartIndex1.add(21);
                    categoryPage.total += categoryPage.foodPrice.get(21);
                    categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
                }
                else{
                    categoryPage.cart22.setIcon( categoryPage.unavailable);
                    categoryPage.cart22.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            }
        }else if(e.getSource() == foodName7){
            if(categoryPage.loggedIn == 1) {
                if(categoryPage.availability.get(9) != 0) {
                    categoryPage.availability.set(9, categoryPage.availability.get(9) - 1);
                    categoryPage.cartPanel.add(categoryPage.cartItem(categoryPage.foodName.get(9), categoryPage.foodPrice.get(9), categoryPage.totalP));
                    categoryPage.cartIndex.add(categoryPage.foodName.get(9));
                    categoryPage.cartIndex1.add(9);
                    categoryPage.total += categoryPage.foodPrice.get(9);
                    categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
                }
                else{
                    categoryPage.cart10.setIcon( categoryPage.unavailable);
                    categoryPage.cart10.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            }
        }else if(e.getSource() == foodName8){
            if(categoryPage.loggedIn == 1) {
                if(categoryPage.availability.get(25) != 0) {
                    categoryPage.availability.set(25, categoryPage.availability.get(25) - 1);
                categoryPage.cartPanel.add(categoryPage.cartItem(categoryPage.foodName.get(25), categoryPage.foodPrice.get(25), categoryPage.totalP));
                categoryPage.cartIndex.add(categoryPage.foodName.get(25));
                categoryPage.cartIndex1.add(25);
                categoryPage.total += categoryPage.foodPrice.get(25);
                categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
            }else{
                categoryPage.cart26.setIcon( categoryPage.unavailable);
                categoryPage.cart26.setText("Unavailable");
            }
            }else{
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            }
        }else if (e.getSource() == resultLabel) {
            int foodI =-1;
            if(categoryPage.loggedIn == 1) {
                for (int i = 0; i < categoryPage.foodName.size(); i++) {
                    if (text.getText().equalsIgnoreCase(categoryPage.foodName.get(i))) {
                            foodI = i;
                            break;
                    }
                }
                    if (categoryPage.availability.get(foodI) != 0) {
                        categoryPage.availability.set(foodI, categoryPage.availability.get(foodI) - 1);
                        categoryPage.cartPanel.add(categoryPage.cartItem(categoryPage.foodName.get(foodI), categoryPage.foodPrice.get(foodI), categoryPage.totalP));
                        categoryPage.cartIndex.add(categoryPage.foodName.get(foodI));
                        categoryPage.cartIndex1.add(foodI);
                        categoryPage.total += categoryPage.foodPrice.get(foodI);
                        categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
                    }
            }else{
                JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
            }
            resultLabel.setVisible(false);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
//______________________________________________________SearchIcon MouseP_______________________________________________
        if (e.getSource() == searchIcon) {
            searchIcon.setIcon(searchIcon2);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//______________________________________________________SearchIcon MouseP_______________________________________________

        if (e.getSource() == searchIcon) {
            searchIcon.setIcon(searchIcon1);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
//______________________________________________________SlidePanel ChangingIcons MouseE_________________________________
        if (e.getSource() == pp) {
            pp.setIcon(pepperoniB);
            offBox1.setVisible(false);
            offText1.setVisible(false);

        } else if (e.getSource() == cs) {
            cs.setIcon(cesarB);
            offBox2.setVisible(false);
            offText2.setVisible(false);
        } else if (e.getSource() == fa) {
            fa.setIcon(cheeseBurgerB);
            offBox3.setVisible(false);
            offText3.setVisible(false);
        } else if (e.getSource() == h) {
            h.setIcon(hotdogB);
            offBox4.setVisible(false);
            offText4.setVisible(false);
        } else if (e.getSource() == sp) {
            sp.setIcon(mojitoB);
            offBox5.setVisible(false);
            offText5.setVisible(false);
        } else if (e.getSource() == fc) {
            fc.setIcon(friedChickenB);
            offBox6.setVisible(false);
            offText6.setVisible(false);
        } else if (e.getSource() == sb) {
            sb.setIcon(burgerB);
            offBox7.setVisible(false);
            offText7.setVisible(false);
        } else if (e.getSource() == s) {
            s.setIcon(jFoodBoxB);
            offBox8.setVisible(false);
            offText8.setVisible(false);
        } else if (e.getSource() == leftPointer) {
            leftPointer.setIcon(leftArrowB);
        } else if (e.getSource() == rightPointer) {
            rightPointer.setIcon(rightArrowB);
        }
//______________________________________________________Categories Changing BGIcons_____________________________________

        if (e.getSource() == pizzaBg) {
            pizzaBg.setIcon(ctg2);
        } else if (e.getSource() == sandwichBg) {
            sandwichBg.setIcon(ctg2);
        } else if (e.getSource() == burgerBg) {
            burgerBg.setIcon(ctg2);
        } else if (e.getSource() == chickenBg) {
            chickenBg.setIcon(ctg2);
        } else if (e.getSource() == drinkBg) {
            drinkBg.setIcon(ctg2);
        } else if (e.getSource() == saladBg) {
            saladBg.setIcon(ctg2);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
//______________________________________________________SlidePanel ChangingBackIcons MouseE_____________________________
        if (e.getSource() == pp) {
            pp.setIcon(pepperoni);
            offBox1.setVisible(true);
            offText1.setVisible(true);
        } else if (e.getSource() == cs) {
            cs.setIcon(cesar);
            offBox2.setVisible(true);
            offText2.setVisible(true);
        } else if (e.getSource() == fa) {
            fa.setIcon(cheeseBurger);
            offBox3.setVisible(true);
            offText3.setVisible(true);
        } else if (e.getSource() == h) {
            h.setIcon(hotdog);
            offBox4.setVisible(true);
            offText4.setVisible(true);
        } else if (e.getSource() == sp) {
            sp.setIcon(mojito);
            offBox5.setVisible(true);
            offText5.setVisible(true);
        } else if (e.getSource() == fc) {
            fc.setIcon(friedChicken);
            offBox6.setVisible(true);
            offText6.setVisible(true);
        } else if (e.getSource() == sb) {
            sb.setIcon(burger);
            offBox7.setVisible(true);
            offText7.setVisible(true);
        } else if (e.getSource() == s) {
            s.setIcon(jFoodBox);
            offBox8.setVisible(true);
            offText8.setVisible(true);
        } else if (e.getSource() == leftPointer) {
            leftPointer.setIcon(leftArrow);
        } else if (e.getSource() == rightPointer) {
            rightPointer.setIcon(rightArrow);
        }

//______________________________________________________Categories ChangingBack BGIcons_________________________________

        if (e.getSource() == pizzaBg) {
            if (active != 1)
                pizzaBg.setIcon(ctg1);
        } else if (e.getSource() == sandwichBg) {
            sandwichBg.setIcon(ctg1);
        } else if (e.getSource() == burgerBg) {
            burgerBg.setIcon(ctg1);
        } else if (e.getSource() == chickenBg) {
            chickenBg.setIcon(ctg1);
        } else if (e.getSource() == drinkBg) {
            drinkBg.setIcon(ctg1);
        } else if (e.getSource() == saladBg) {
            saladBg.setIcon(ctg1);
        }
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
                    payment.setText("Pay:        "+categoryPage.total+"$");
                    writer.close();
                }else{
                    JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else if(e.getSource() == payment){
            try {

                writer.append(Main.userA.get(0)).append("\n");
                writer.append(TimeFormat.format(Calendar.getInstance().getTime())).append(" ").append(DayFormat.format(Calendar.getInstance().getTime())).append(" ").append(DateFormat.format(Calendar.getInstance().getTime())).append("\n");
                writer.append(String.valueOf(categoryPage.total)).append("\n");
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
                payment.setText("Pay:        "+categoryPage.total+"$");
                writer.close();
                categoryPage.totalP.setText("Total Price :      " + categoryPage.total + "$");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == searchText) {
            for (Index = 0; Index < categoryPage.foodName.size(); Index++) {
                String a = categoryPage.foodName.get(Index).toLowerCase();
                String b = searchText.getText().toLowerCase();
                if (a.contains(b)) {
                    resultLabel.setVisible(true);
                    text.setText(Main.foodName.get(Index));
                    price.setText(Main.foodPrice.get(Index) + "$");
                    CartIndex = Index;
                }
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
