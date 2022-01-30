package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static ArrayList<String> userA = new ArrayList<>();
    public static ArrayList<String> passA = new ArrayList<>();
    public static ArrayList<String> emailA = new ArrayList<>();
    public static ArrayList<String> addressA = new ArrayList<>();

    static ArrayList<String> foodName = new ArrayList<>();
    static ArrayList<Integer> foodPrice = new ArrayList<>();
    static ArrayList<Integer> foodCode = new ArrayList<>();

    static ArrayList<String> inCartFood = new ArrayList<>();
    static ArrayList<String> inCartPrice = new ArrayList<>();

    public static ArrayList<String> u = new ArrayList<>();
    public static ArrayList<String> p = new ArrayList<>();
    public static ArrayList<String> e = new ArrayList<>();
    public static ArrayList<String> a = new ArrayList<>();
    public static ArrayList<String> t = new ArrayList<>();
    public static ArrayList<Integer> numberOfUsers = new ArrayList<>();

    public static void main(String[] args) throws IOException {


        int fn;
        String line;
        BufferedReader nameReader = new BufferedReader(new FileReader("Data/FoodName.txt"));
        while ((line = nameReader.readLine()) != null) {
            foodName.add(line);
        }


        String price;
        BufferedReader priceReader = new BufferedReader(new FileReader("Data/FoodPrice.txt"));
        while ((price = priceReader.readLine()) != null) {
            foodPrice.add(Integer.valueOf(price));
        }

        String code;
        BufferedReader codeReader = new BufferedReader(new FileReader("Data/FoodCode.txt"));
        while ((code = codeReader.readLine()) != null) {
            foodCode.add(Integer.valueOf(code));
        }

        try {
            BufferedReader read = new BufferedReader(new FileReader("File/ADMIN.txt"));
            String text = read.readLine();
            while (text != null) {
                u.add(text);
                text = read.readLine();
                p.add(text);
                text = read.readLine();
                e.add(text);
                text = read.readLine();
                a.add(text);
                text = read.readLine();
                t.add(text);
                text = read.readLine();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        HomeClass homeClass = new HomeClass();


//        LoginPage loginPage = new LoginPage();
//        System.out.println(userA);
//        System.out.println(passA);
//        System.out.println(emailA);
//        System.out.println(addressA);

//        BufferedReader read = new BufferedReader(new FileReader("ParsaChavoshi.txt"));
//        int lineIndex = 1;
//        int intendedLine = 2;
//        String ln = read.readLine();
//        while (ln != null) {
//            if (lineIndex == intendedLine) {
//                System.out.println(ln);
//                break;
//            }
//            ln = read.readLine();
//            lineIndex++;
//        }

    }

}
