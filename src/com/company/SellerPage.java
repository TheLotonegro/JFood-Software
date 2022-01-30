package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class SellerPage implements ActionListener, MouseListener {

    int finalTotal = 0;
    int Clients = 0;

    JFrame SellerFrame = new JFrame();
    JPanel SellerPanel = new JPanel();
    JPanel AddFoodPanel = new JPanel();
    JLabel SellerBackground = new JLabel();
    JPanel OrderPanel = new JPanel();
    JTextArea centerArea = new JTextArea();
    JLabel AddFoodBackground = new JLabel();
    JLabel AddFoodLabel = new JLabel();
    JLabel PerformanceLabel = new JLabel("Performance");
    JLabel IncomeBGLabel = new JLabel();
    JLabel IncomeTextLabel = new JLabel();
    JLabel IncomeTextFromFile = new JLabel();
    JLabel ClientsBGLabel = new JLabel();
    JLabel ClientsTextLabel = new JLabel();
    JLabel ClientsTextFromFile = new JLabel();
    JLabel OrdersBGLabel = new JLabel();
    JLabel OrdersTextLabel = new JLabel();
    JLabel OrdersTextFromFile = new JLabel();
    JLabel HomeLabel = new JLabel();
    JLabel FoodNameLabel = new JLabel("Food Name", JLabel.CENTER);
    JLabel FoodPriceLabel = new JLabel("Food Price", JLabel.CENTER);
    JLabel ImageLabel = new JLabel();
    JLabel WowLabel = new JLabel("WOW! What A Good News  :O", JLabel.CENTER);
    JLabel JustTellMeLabel = new JLabel("What Do You Want To Add ? Just Tell Me", JLabel.CENTER);
    JLabel ErrLabel = new JLabel("", JLabel.CENTER);
    JButton ChooseImageButton = new JButton("Choose Food Image");
    JButton DoItButton = new JButton("Do It !");
    JTextField FoodNameField = new JTextField();
    JTextField FoodPriceField = new JTextField();
    JTextArea HomeText = new JTextArea("Home");
    JTextArea AddFoodText = new JTextArea("Add Food");
    JTextArea SettingText = new JTextArea("Setting");
    JLabel TimeLabel;
    JLabel DayLabel;
    JLabel DateLabel;
    SimpleDateFormat TimeFormat;
    SimpleDateFormat DayFormat;
    SimpleDateFormat DateFormat;
    String Time;
    String Day;
    String Date;
    ImageIcon LeftSelected = new ImageIcon("Image/LeftSelected.png");
    ImageIcon LeftUnSelected = new ImageIcon("Image/LeftUnSelected.png");
    ImageIcon InformationBG = new ImageIcon("Image/InformationBG.png");
    Color C1 = new Color(0xff0035);
    public Timer timer;

    SellerPage() {

        SellerPanel.setSize(1300, 680);
        SellerPanel.setBounds(0, 0, 1300, 720);
        SellerPanel.setLayout(null);
        ImageIcon SellerBG = new ImageIcon("Image/SellerBG.png");
        SellerBackground.setBounds(0, 0, 1300, 680);
        SellerBackground.setIcon(SellerBG);

        HomeText.setBounds(5, 62, 50, 25);
        HomeText.setFont(new Font("Century Gothic", Font.BOLD, 15));
        HomeText.setForeground(Color.black);
        HomeText.setOpaque(false);
        HomeText.setEditable(false);
        HomeLabel.setBounds(0, 50, 180, 50);
        HomeLabel.setIcon(LeftSelected);
        HomeLabel.addMouseListener(this);

        AddFoodText.setBounds(5, 162, 72, 25);
        AddFoodText.setFont(new Font("Century Gothic", Font.BOLD, 15));
        AddFoodText.setForeground(Color.black);
        AddFoodText.setOpaque(false);
        AddFoodText.setEditable(false);
        AddFoodLabel.setBounds(0, 150, 180, 50);
        AddFoodLabel.setIcon(LeftUnSelected);
        AddFoodLabel.addMouseListener(this);

        TimeFormat = new SimpleDateFormat("hh:mm:ss a");
        DayFormat = new SimpleDateFormat("EEEE");
        DateFormat = new SimpleDateFormat("dd/ MM/ yyyy");

        TimeLabel = new JLabel();
        TimeLabel.setBounds(320, 2, 120, 50);
        TimeLabel.setFont(new Font("Century Gothic", Font.BOLD, 18));
        TimeLabel.setBackground(Color.WHITE);
        TimeLabel.setOpaque(true);

        DayLabel = new JLabel();
        DayLabel.setBounds(450, 2, 80, 50);
        DayLabel.setFont(new Font("Century Gothic", Font.BOLD, 18));
        DayLabel.setBackground(Color.WHITE);
        DayLabel.setOpaque(true);

        DateLabel = new JLabel();
        DateLabel.setBounds(550, 2, 150, 50);
        DateLabel.setFont(new Font("Century Gothic", Font.BOLD, 18));
        DateLabel.setBackground(Color.WHITE);
        DateLabel.setOpaque(true);

        if (timer != null && timer.isRunning()) {
            return;
        }
        timer = new Timer(1000, new TimerListener());
        timer.start();

        PerformanceLabel.setBounds(1020, 15, 150, 30);
        PerformanceLabel.setBackground(new Color(0xf8c75d));
        PerformanceLabel.setFont(new Font("Century Gothic", Font.BOLD, 18));
        PerformanceLabel.setOpaque(true);

        OrderPanel.setLayout(new GridLayout(0, 3, 30, 20));
        OrderPanel.setOpaque(true);
        OrderPanel.setPreferredSize(new Dimension(800, 3300));
        OrderPanel.setBackground(new Color(245, 245, 254));

        JButton Refresh = new JButton("Refresh");
        Refresh.setBounds(756, 15, 120, 30);
        Refresh.setFocusable(false);
        Refresh.setBackground(C1);
        Refresh.setOpaque(true);
        Refresh.addActionListener(e -> {
            try {
                HomeClass.writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            centerArea.setText("");
            OrdersTextFromFile.setText("");
            ClientsTextFromFile.setText("");
            IncomeTextFromFile.setText("");

            finalTotal = 0;
            Clients = 0;

            try {
                BufferedReader read = new BufferedReader(new FileReader("File/SELLER.txt"));
                String text = read.readLine();
                while (text != null) {
                    centerArea.append("Buyer Uesername :    " + text + "\n");
                    text = read.readLine();
                    centerArea.append("Time :   " + text + "\n");
                    text = read.readLine();
                    centerArea.append("Total purchase :    " + text + " $" + "\n\n");
                    finalTotal = Integer.parseInt(text) + finalTotal;
                    text = read.readLine();
                    Clients++;
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            int index = 1;
            File mf = new File("File/ADMIN.txt");
            try {
                Scanner read = new Scanner(mf);
                while (read.hasNextLine()) {
                    String a = read.nextLine();
                    index++;
                }
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            index = index / 5;

            Main.numberOfUsers.add(index);

            OrdersTextFromFile.setText(String.valueOf(Clients));

            IncomeTextFromFile.setText(String.valueOf(finalTotal));

            ClientsTextFromFile.setText(String.valueOf(Main.numberOfUsers.get(0)));

        });

//        centerArea.setLayout(new BorderLayout());
        centerArea.setBounds(200, 60, 677, 620);
        centerArea.setText("Please Refresh to see information");
        centerArea.setFont(new Font("Century Gothic", Font.BOLD, 24));
        centerArea.setBackground(new Color(0xB2B2B2));
        centerArea.setEditable(false);
//        centerArea.add(OrderPanel , BorderLayout.CENTER);


        JScrollPane scroll = new JScrollPane(centerArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(200, 60, 677, 620);
        scroll.setBorder(new EmptyBorder(0, 0, 0, 0));


        IncomeBGLabel.setBounds(927, 100, 305, 115);
        IncomeBGLabel.setIcon(InformationBG);
        IncomeTextLabel.setBounds(940, 127, 150, 50);
        IncomeTextLabel.setText("Total Income       $");
        IncomeTextLabel.setFont(new Font("GT America", Font.PLAIN, 18));
        IncomeTextFromFile.setBounds(1100, 127, 140, 50);
        IncomeTextFromFile.setText("0");
        IncomeTextFromFile.setFont(new Font("GT America", Font.BOLD, 18));

        ClientsBGLabel.setBounds(927, 250, 305, 115);
        ClientsBGLabel.setIcon(InformationBG);
        ClientsTextLabel.setBounds(940, 277, 150, 50);
        ClientsTextLabel.setText("Number Of Clients");
        ClientsTextLabel.setFont(new Font("GT America", Font.PLAIN, 18));
        ClientsTextFromFile.setBounds(1100, 277, 140, 50);
        ClientsTextFromFile.setText("0");
        ClientsTextFromFile.setFont(new Font("GT America", Font.BOLD, 18));

        OrdersBGLabel.setBounds(927, 400, 305, 115);
        OrdersBGLabel.setIcon(InformationBG);
        OrdersTextLabel.setBounds(940, 427, 150, 50);
        OrdersTextLabel.setText("Current Orders");
        OrdersTextLabel.setFont(new Font("GT America", Font.PLAIN, 18));
        OrdersTextFromFile.setBounds(1100, 427, 140, 50);
        OrdersTextFromFile.setText("0");
        OrdersTextFromFile.setFont(new Font("GT America", Font.BOLD, 18));

        AddFoodPanel.setSize(1300, 680);
        AddFoodPanel.setBounds(0, 0, 1300, 720);
        AddFoodPanel.setLayout(null);
        AddFoodPanel.setVisible(false);
        ImageIcon AddFoodBG = new ImageIcon("Image/AddFoodBG.png");
        AddFoodBackground.setBounds(0, 0, 1300, 680);
        AddFoodBackground.setIcon(AddFoodBG);

        WowLabel.setBounds(425, 0, 650, 60);
        WowLabel.setFont(new Font("Century Gothic", Font.PLAIN, 30));
        JustTellMeLabel.setBounds(425, 60, 650, 60);
        JustTellMeLabel.setFont(new Font("Century Gothic", Font.PLAIN, 30));

        FoodNameLabel.setBounds(300, 150, 125, 40);
        FoodNameLabel.setFont(new Font("century gothic", Font.BOLD, 15));
        FoodNameLabel.setBackground(C1);
        FoodNameLabel.setOpaque(true);
        FoodNameField.setBounds(425, 150, 250, 40);
        FoodNameField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        FoodNameField.setBorder(new LineBorder(C1, 2, false));
        FoodNameField.setOpaque(true);

        FoodPriceLabel.setBounds(300, 300, 125, 40);
        FoodPriceLabel.setFont(new Font("century gothic", Font.BOLD, 15));
        FoodPriceLabel.setBackground(C1);
        FoodPriceLabel.setOpaque(true);
        FoodPriceField.setBounds(425, 300, 250, 40);
        FoodPriceField.setFont(new Font("Helvetica", Font.PLAIN, 20));
        FoodPriceField.setBorder(new LineBorder(C1, 2, false));
        FoodPriceField.setOpaque(true);

        ChooseImageButton.setBounds(300, 450, 375, 40);
        ChooseImageButton.setFont(new Font("century gothic", Font.BOLD, 15));
        ChooseImageButton.setBackground(C1);
        ChooseImageButton.setFocusable(false);
        ChooseImageButton.setOpaque(true);
        ChooseImageButton.addActionListener(this);

        DoItButton.setBounds(630, 600, 200, 75);
        DoItButton.setFont(new Font("century gothic", Font.BOLD, 20));
        DoItButton.setBackground(C1);
        DoItButton.setFocusable(false);
        DoItButton.setOpaque(true);
        DoItButton.addActionListener(this);

        ErrLabel.setBounds(200, 510, 1090, 75);
        ErrLabel.setFont(new Font("century gothic", Font.BOLD, 30));
        ErrLabel.setForeground(new Color(0x0e131f));
        ErrLabel.setBackground(new Color(0x6e5ed4));
        ErrLabel.setText("Please Make Sure That Food Information Is Correct  :P");
        ErrLabel.setOpaque(true);

        ImageLabel.setBounds(700, 150, 570, 340);
        ImageLabel.setFont(new Font("century gothic", Font.BOLD, 15));
        ImageLabel.setOpaque(true);

        SellerFrame.add(HomeText);
        SellerFrame.add(HomeLabel);
        SellerFrame.add(AddFoodText);
        SellerFrame.add(AddFoodLabel);
        SellerFrame.add(SettingText);

        SellerPanel.add(Refresh);
        SellerPanel.add(scroll);
        SellerPanel.add(TimeLabel);
        SellerPanel.add(DayLabel);
        SellerPanel.add(DateLabel);
        SellerPanel.add(IncomeTextLabel);
        SellerPanel.add(IncomeTextFromFile);
        SellerPanel.add(IncomeBGLabel);
        SellerPanel.add(ClientsTextLabel);
        SellerPanel.add(ClientsTextFromFile);
        SellerPanel.add(ClientsBGLabel);
        SellerPanel.add(OrdersTextLabel);
        SellerPanel.add(OrdersTextFromFile);
        SellerPanel.add(OrdersBGLabel);
        SellerPanel.add(PerformanceLabel);
        SellerPanel.add(SellerBackground);



        AddFoodPanel.add(WowLabel);
        AddFoodPanel.add(JustTellMeLabel);
        AddFoodPanel.add(FoodNameLabel);
        AddFoodPanel.add(FoodNameField);
        AddFoodPanel.add(FoodPriceLabel);
        AddFoodPanel.add(FoodPriceField);
        AddFoodPanel.add(ChooseImageButton);
        AddFoodPanel.add(DoItButton);
        AddFoodPanel.add(ErrLabel);
        AddFoodPanel.add(ImageLabel);
        AddFoodPanel.add(AddFoodBackground);


        SellerFrame.add(SellerPanel);
        SellerFrame.add(AddFoodPanel);
        SellerFrame.setLayout(null);
        SellerFrame.setSize(1300, 720);
        SellerFrame.setResizable(false);
        SellerFrame.setLocationRelativeTo(null);
        SellerFrame.setVisible(true);
        //setTime();
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ChooseImageButton) {
            JFileChooser FoodImgChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("png files", "png");
            FoodImgChooser.addChoosableFileFilter(filter);
            FoodImgChooser.setAcceptAllFileFilterUsed(false);
            FoodImgChooser.setCurrentDirectory(new File("."));

            int X = FoodImgChooser.showOpenDialog(null);
            if (X == JFileChooser.APPROVE_OPTION) {
                ImageIcon icon = new ImageIcon(new ImageIcon((FoodImgChooser.getSelectedFile().getPath())).getImage().getScaledInstance(570, 340, Image.SCALE_DEFAULT));
                ImageLabel.setIcon(icon);
                ImageLabel.setOpaque(false);
            }
        }
        if (e.getSource() == DoItButton) {
            if (FoodNameField.getText().equals("")) {
                ErrLabel.setText("Oops! Name Field Is Empty");
            } else if (FoodPriceField.getText().equals("")) {
                ErrLabel.setText("Enter Food Price");
            } else if (ImageLabel.getIcon() == null) {
                ErrLabel.setText("First Select An Image");
            } else if (true) {
                try {
                    Integer.parseInt(FoodPriceField.getText());
                } catch (NumberFormatException numberFormatException) {
                    ErrLabel.setText("Please Enter A Number Instead Of Letters");
                    numberFormatException.printStackTrace();
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == HomeLabel) {
            HomeLabel.setIcon(LeftSelected);
            AddFoodLabel.setIcon(LeftUnSelected);
            AddFoodPanel.setVisible(false);
            SellerPanel.setVisible(true);

        }
        if (e.getSource() == AddFoodLabel) {
            AddFoodLabel.setIcon(LeftSelected);
            HomeLabel.setIcon(LeftUnSelected);
            SellerPanel.setVisible(false);
            AddFoodPanel.setVisible(true);

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
    private class TimerListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            Time = TimeFormat.format(Calendar.getInstance().getTime());
            TimeLabel.setText(Time);

            Day = DayFormat.format(Calendar.getInstance().getTime());
            DayLabel.setText(Day);

            Date = DateFormat.format(Calendar.getInstance().getTime());
            DateLabel.setText(Date);
        }
    }
}

