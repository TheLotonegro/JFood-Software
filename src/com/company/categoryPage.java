package com.company;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;

public class categoryPage implements ActionListener , MouseListener {
    JFrame frame = new JFrame();
    ImageIcon mainBackGround = new ImageIcon("Image/BackGround.png");
    JLabel backGround = new JLabel();
    JPanel mainPanel = new JPanel();
    JLabel homeIcon = new JLabel();
    JLabel categoryIcon = new JLabel();
    JLabel heartIcon = new JLabel();
    JLabel aboutUsIcon = new JLabel();
    JLabel exitIcon = new JLabel();

    ImageIcon homeIcon1 = new ImageIcon("Image/HomeIcon1.png");
    ImageIcon categoryIcon1 = new ImageIcon("Image/CategoryIcon1.png");
    ImageIcon heartIcon1 = new ImageIcon("Image/HeartIcon1.png");
    ImageIcon exitIcon1 = new ImageIcon("Image/ExitIcon1.png");

    ImageIcon homeIcon2 = new ImageIcon("Image/HomeIcon2.png");
    ImageIcon categoryIcon2 = new ImageIcon("Image/CategoryIcon2.png");
    ImageIcon heartIcon2 = new ImageIcon("Image/HeartIcon2.png");
    ImageIcon exitIcon2 = new ImageIcon("Image/ExitIcon2.png");



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
    JPanel topPanel;


    ImageIcon pepperoni;
    ImageIcon pepperoniB;

    ImageIcon pizzaMargherita;
    ImageIcon pizzaMargheritaB;

    ImageIcon pizzaPhiladelphia;
    ImageIcon pizzaPhiladelphiaB;

    ImageIcon pizzaPesto;
    ImageIcon pizzaPestoB;

    ImageIcon  pizzaVegetariana;
    ImageIcon  pizzaVegetarianaB;

    ImageIcon pizzaChicago;
    ImageIcon pizzaChicagoB;

    ImageIcon pizzaMafiosa;
    ImageIcon pizzaMafiosaB;

    ImageIcon pizzaSpecial;
    ImageIcon pizzaSpecialB;

    ImageIcon pizzaMix;
    ImageIcon pizzaMixB;

    ImageIcon doubleBurger;
    ImageIcon doubleBurgerB;

    ImageIcon zingerBurger;
    ImageIcon zingerBurgerB;

    ImageIcon chickenGrillBurger;
    ImageIcon chickenGrillBurgerB;

    ImageIcon cheeseBurger;
    ImageIcon cheeseBurgerB;

    ImageIcon royalBurger;
    ImageIcon royalBurgerB;

    ImageIcon eggBurger;
    ImageIcon eggBurgerB;

    ImageIcon roastBeef;
    ImageIcon roastBeefB;

    ImageIcon supreme;
    ImageIcon supremeB;

    ImageIcon panini;
    ImageIcon paniniB;

    ImageIcon hotdog;
    ImageIcon hotdogB;

    ImageIcon gammon;
    ImageIcon gammonB;


    ImageIcon specialSandwich;
    ImageIcon specialSandwichB;

    ImageIcon chicken;
    ImageIcon chickenB;

    ImageIcon kentucky;
    ImageIcon kentuckyB;

    ImageIcon crispy;
    ImageIcon crispyB;

    ImageIcon familyBox;
    ImageIcon familyBoxB;

    ImageIcon jFoodBox;
    ImageIcon jFoodBoxB;

    ImageIcon water;
    ImageIcon waterB;

    ImageIcon cocaCola;
    ImageIcon cocaColaB;

    ImageIcon cocaColaZero;
    ImageIcon cocaColaZeroB;

    ImageIcon sprite;
    ImageIcon spriteB;


    ImageIcon dough;
    ImageIcon doughB;

    ImageIcon mojito;
    ImageIcon mojitoB;

    ImageIcon redMojito;
    ImageIcon redMojitoB;

    ImageIcon cesar;
    ImageIcon cesarB;

    ImageIcon chefsSalad;
    ImageIcon chefsSaladB;

    ImageIcon italianSalad;
    ImageIcon italianSaladB;



    ImageIcon offP;
    ImageIcon cart;
    static ImageIcon unavailable;
    ImageIcon like;
    ImageIcon unlike;
    ImageIcon foodBackground;
    ImageIcon foodBackgroundB;


    JPanel mainFoodPanel;
    static JPanel cartPanel = new JPanel();

    static ArrayList<String> foodName = new ArrayList<>();
    static ArrayList<Integer> foodPrice = new ArrayList<>();
    static ArrayList<Integer> foodCode = new ArrayList<>();
    static ArrayList<Integer> availability = new ArrayList<>();


    JLayeredPane food1,food2, food3, food4, food5, food6, food7, food8, food9, food10, food11, food12, food13, food14, food15, food16, food17, food18, food19, food20, food21, food22, food23, food24, food25, food26, food27, food28, food29, food30, food31, food32, food33, food34, food35, food36 ;
    static JLabel cart1 , cart2 ,  cart3 , cart4 , cart5 , cart6 , cart7 , cart8 , cart9 , cart10, cart11, cart12, cart13, cart14, cart15, cart16, cart17, cart18, cart19, cart20, cart21, cart22, cart23, cart24, cart25, cart26, cart27, cart28, cart29, cart30, cart31, cart32, cart33, cart34, cart35, cart36;
    int likeActive1 , likeActive2 , likeActive3 , likeActive4 , likeActive5 , likeActive6 , likeActive7 , likeActive8 , likeActive9 , likeActive10 , likeActive11 , likeActive12 , likeActive13 , likeActive14 , likeActive15 , likeActive16 , likeActive17 , likeActive18 , likeActive19 , likeActive20 , likeActive21 , likeActive22 , likeActive23 , likeActive24 , likeActive25 , likeActive26 , likeActive27 , likeActive28 , likeActive29 , likeActive30 , likeActive31 , likeActive32 , likeActive33 , likeActive34 , likeActive35 , likeActive36 = 0 ;
    int flag = 0;
    int active1 , active2 , active3 , active4 , active5 , active6 = 0;
    static int total = 0;
    static int loggedIn = 0 ;
    static JLabel totalP = new JLabel();
    static JButton buy = new JButton("Final List");
    static ArrayList<String> cartIndex = new ArrayList<>();
    static ArrayList<Integer> cartIndex1 = new ArrayList<>();

    static JLabel userLabel1 = new JLabel();
    static JLabel emailLabel1 = new JLabel();
    static JLabel addressLabel1 = new JLabel();
    static JButton payment1 = new JButton();

    JLabel favorite1 = new JLabel();
    JLabel favorite2 = new JLabel();
    JLabel favorite3 = new JLabel();
    JLabel favorite4 = new JLabel();
    JLabel favorite5 = new JLabel();
    JLabel favorite6 = new JLabel();
    JLabel favorite7 = new JLabel();
    JLabel favorite8 = new JLabel();
    JLabel favorite9 = new JLabel();
    JLabel favorite10 = new JLabel();
    JLabel favorite11 = new JLabel();
    JLabel favorite12 = new JLabel();
    JLabel favorite13 = new JLabel();
    JLabel favorite14 = new JLabel();
    JLabel favorite15 = new JLabel();
    JLabel favorite16= new JLabel();
    JLabel favorite17 = new JLabel();
    JLabel favorite18 = new JLabel();
    JLabel favorite19= new JLabel();
    JLabel favorite20 = new JLabel();
    JLabel favorite21 = new JLabel();
    JLabel favorite22 = new JLabel();
    JLabel favorite23 = new JLabel();
    JLabel favorite24 = new JLabel();
    JLabel favorite25 = new JLabel();
    JLabel favorite26 = new JLabel();
    JLabel favorite27 = new JLabel();
    JLabel favorite28 = new JLabel();
    JLabel favorite29 = new JLabel();
    JLabel favorite30 = new JLabel();
    JLabel favorite31 = new JLabel();
    JLabel favorite32 = new JLabel();
    JLabel favorite33 = new JLabel();
    JLabel favorite34 = new JLabel();
    JLabel favorite35 = new JLabel();
    JLabel favorite36 = new JLabel();

    JLabel img1 = new JLabel();
    JLabel img2 = new JLabel();
    JLabel img3 = new JLabel();
    JLabel img4 = new JLabel();
    JLabel img5 = new JLabel();
    JLabel img6 = new JLabel();
    JLabel img7 = new JLabel();
    JLabel img8 = new JLabel();
    JLabel img9 = new JLabel();
    JLabel img10 = new JLabel();
    JLabel img11 = new JLabel();
    JLabel img12 = new JLabel();
    JLabel img13 = new JLabel();
    JLabel img14 = new JLabel();
    JLabel img15 = new JLabel();
    JLabel img16= new JLabel();
    JLabel img17 = new JLabel();
    JLabel img18 = new JLabel();
    JLabel img19= new JLabel();
    JLabel img20 = new JLabel();
    JLabel img21 = new JLabel();
    JLabel img22 = new JLabel();
    JLabel img23 = new JLabel();
    JLabel img24 = new JLabel();
    JLabel img25 = new JLabel();
    JLabel img26 = new JLabel();
    JLabel img27 = new JLabel();
    JLabel img28 = new JLabel();
    JLabel img29 = new JLabel();
    JLabel img30 = new JLabel();
    JLabel img31 = new JLabel();
    JLabel img32 = new JLabel();
    JLabel img33 = new JLabel();
    JLabel img34 = new JLabel();
    JLabel img35 = new JLabel();
    JLabel img36 = new JLabel();


    categoryPage() throws IOException {


        like = new ImageIcon(new ImageIcon("Image/like.png").getImage().getScaledInstance(30 , 30 ,Image.SCALE_DEFAULT));
        unlike = new ImageIcon(new ImageIcon("Image/unlike.png").getImage().getScaledInstance(30 , 30 ,Image.SCALE_DEFAULT));
        offP = new ImageIcon(new ImageIcon("Image/offBox.png").getImage().getScaledInstance(70 , 30 ,Image.SCALE_DEFAULT));
        cart = new ImageIcon(new ImageIcon("Image/addToCart.png").getImage().getScaledInstance(90 , 40 ,Image.SCALE_DEFAULT));
        unavailable = new ImageIcon(new ImageIcon("Image/unavailable.png").getImage().getScaledInstance(90 , 40 ,Image.SCALE_DEFAULT));

        pepperoni = new ImageIcon(new ImageIcon("Image/pepperoniPizza.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        pepperoniB = new ImageIcon(new ImageIcon("Image/pepperoniPizzaB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        pizzaMargherita = new ImageIcon(new ImageIcon("Image/pizzaMargherita.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        pizzaMargheritaB = new ImageIcon(new ImageIcon("Image/pizzaMargheritaB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        pizzaPhiladelphia= new ImageIcon(new ImageIcon("Image/pizzaPhiladelphia.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        pizzaPhiladelphiaB = new ImageIcon(new ImageIcon("Image/pizzaPhiladelphiaB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        pizzaPesto= new ImageIcon(new ImageIcon("Image/pizzaPesto.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        pizzaPestoB = new ImageIcon(new ImageIcon("Image/pizzaPestoB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        pizzaVegetariana= new ImageIcon(new ImageIcon("Image/pizzaVegetariana.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        pizzaVegetarianaB = new ImageIcon(new ImageIcon("Image/pizzaVegetarianaB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        pizzaChicago= new ImageIcon(new ImageIcon("Image/pizzaChicago.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        pizzaChicagoB = new ImageIcon(new ImageIcon("Image/pizzaChicagoB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        pizzaMafiosa= new ImageIcon(new ImageIcon("Image/pizzaMafiosa.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        pizzaMafiosaB = new ImageIcon(new ImageIcon("Image/pizzaMafiosaB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        pizzaSpecial= new ImageIcon(new ImageIcon("Image/pizzaSpecial.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        pizzaSpecialB = new ImageIcon(new ImageIcon("Image/pizzaSpecialB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        pizzaMix= new ImageIcon(new ImageIcon("Image/pizzaMix.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        pizzaMixB = new ImageIcon(new ImageIcon("Image/pizzaMixB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        doubleBurger = new ImageIcon(new ImageIcon("Image/Burger.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        doubleBurgerB = new ImageIcon(new ImageIcon("Image/BurgerB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        zingerBurger = new ImageIcon(new ImageIcon("Image/zingerBurger.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        zingerBurgerB = new ImageIcon(new ImageIcon("Image/zingerBurgerB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        chickenGrillBurger = new ImageIcon(new ImageIcon("Image/chickenGrillBurger.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        chickenGrillBurgerB = new ImageIcon(new ImageIcon("Image/chickenGrillBurgerB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        cheeseBurger = new ImageIcon(new ImageIcon("Image/cheeseBurger.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        cheeseBurgerB = new ImageIcon(new ImageIcon("Image/cheeseBurgerB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        royalBurger = new ImageIcon(new ImageIcon("Image/royalBurger.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        royalBurgerB = new ImageIcon(new ImageIcon("Image/royalBurgerB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        eggBurger = new ImageIcon(new ImageIcon("Image/eggBurger.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        eggBurgerB = new ImageIcon(new ImageIcon("Image/eggBurgerB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        roastBeef = new ImageIcon(new ImageIcon("Image/roastBeef.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        roastBeefB = new ImageIcon(new ImageIcon("Image/roastBeefB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        supreme = new ImageIcon(new ImageIcon("Image/supreme.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        supremeB = new ImageIcon(new ImageIcon("Image/supremeB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        panini = new ImageIcon(new ImageIcon("Image/panini.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        paniniB = new ImageIcon(new ImageIcon("Image/paniniB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        hotdog = new ImageIcon(new ImageIcon("Image/hotdog.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        hotdogB = new ImageIcon(new ImageIcon("Image/hotdogB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        gammon = new ImageIcon(new ImageIcon("Image/gammon.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        gammonB = new ImageIcon(new ImageIcon("Image/gammonB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        specialSandwich = new ImageIcon(new ImageIcon("Image/specialSandwich.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        specialSandwichB = new ImageIcon(new ImageIcon("Image/specialSandwichB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        chicken = new ImageIcon(new ImageIcon("Image/friedChicken.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        chickenB = new ImageIcon(new ImageIcon("Image/friedChickenB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        kentucky = new ImageIcon(new ImageIcon("Image/kentucky.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        kentuckyB = new ImageIcon(new ImageIcon("Image/kentuckyB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        crispy = new ImageIcon(new ImageIcon("Image/crispy.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        crispyB = new ImageIcon(new ImageIcon("Image/crispyB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        familyBox = new ImageIcon(new ImageIcon("Image/familyBox.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        familyBoxB = new ImageIcon(new ImageIcon("Image/familyBoxB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        jFoodBox = new ImageIcon(new ImageIcon("Image/jFoodBox.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        jFoodBoxB = new ImageIcon(new ImageIcon("Image/jFoodBoxB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        crispy = new ImageIcon(new ImageIcon("Image/crispy.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        crispyB = new ImageIcon(new ImageIcon("Image/crispyB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        water = new ImageIcon(new ImageIcon("Image/water.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        waterB = new ImageIcon(new ImageIcon("Image/waterB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        cocaCola = new ImageIcon(new ImageIcon("Image/cocaCola.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        cocaColaB = new ImageIcon(new ImageIcon("Image/cocaColaB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        cocaColaZero = new ImageIcon(new ImageIcon("Image/cocaColaZero.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        cocaColaZeroB = new ImageIcon(new ImageIcon("Image/cocaColaZeroB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        sprite = new ImageIcon(new ImageIcon("Image/sprite.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        spriteB = new ImageIcon(new ImageIcon("Image/spriteB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        dough = new ImageIcon(new ImageIcon("Image/dough.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        doughB = new ImageIcon(new ImageIcon("Image/doughB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        mojito = new ImageIcon(new ImageIcon("Image/mojito.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        mojitoB = new ImageIcon(new ImageIcon("Image/mojitoB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        redMojito = new ImageIcon(new ImageIcon("Image/redMojito.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        redMojitoB = new ImageIcon(new ImageIcon("Image/redMojitoB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        cesar = new ImageIcon(new ImageIcon("Image/cesarSalad.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        cesarB = new ImageIcon(new ImageIcon("Image/cesarSaladB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        chefsSalad = new ImageIcon(new ImageIcon("Image/chefsSalad.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        chefsSaladB = new ImageIcon(new ImageIcon("Image/chefsSaladB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        italianSalad = new ImageIcon(new ImageIcon("Image/italianSalad.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));
        italianSaladB = new ImageIcon(new ImageIcon("Image/italianSaladB.png").getImage().getScaledInstance(220 , 110 ,Image.SCALE_DEFAULT));

        cart1 = new JLabel(cart);
        cart2 = new JLabel(cart);
        cart3 = new JLabel(cart);
        cart4 = new JLabel(cart);
        cart5 = new JLabel(cart);
        cart6 = new JLabel(cart);
        cart7 = new JLabel(cart);
        cart8 = new JLabel(cart);
        cart9 = new JLabel(cart);
        cart10 = new JLabel(cart);
        cart11 = new JLabel(cart);
        cart12 = new JLabel(cart);
        cart13 = new JLabel(cart);
        cart14 = new JLabel(cart);
        cart15 = new JLabel(cart);
        cart16 = new JLabel(cart);
        cart17 = new JLabel(cart);
        cart18= new JLabel(cart);
        cart19= new JLabel(cart);
        cart20= new JLabel(cart);
        cart21= new JLabel(cart);
        cart22= new JLabel(cart);
        cart23= new JLabel(cart);
        cart24= new JLabel(cart);
        cart25= new JLabel(cart);
        cart26= new JLabel(cart);
        cart27= new JLabel(cart);
        cart28= new JLabel(cart);
        cart29= new JLabel(cart);
        cart30= new JLabel(cart);
        cart31= new JLabel(cart);
        cart32= new JLabel(cart);
        cart33= new JLabel(cart);
        cart34= new JLabel(cart);
        cart35= new JLabel(cart);
        cart36= new JLabel(cart);
        





        food1 = foodList(pepperoni ,img1,favorite1 ,cart1, foodName.get(0) , foodPrice.get(0));
        food2 = foodList(pizzaMargherita ,img2 ,favorite2 ,cart2,  foodName.get(1) , foodPrice.get(1));
        food3 = foodList(pizzaPhiladelphia ,img3 ,favorite3 ,cart3,  foodName.get(2) , foodPrice.get(2));
        food4 = foodList(pizzaPesto ,img4 , favorite4 ,cart4, foodName.get(3) , foodPrice.get(3));
        food5 = foodList(pizzaVegetariana ,img5 ,favorite5 ,cart5,  foodName.get(4) , foodPrice.get(4));
        food6 = foodList(pizzaChicago ,img6 ,favorite6 ,cart6,  foodName.get(5) , foodPrice.get(5));
        food7 = foodList(pizzaMafiosa ,img7 , favorite7 ,cart7, foodName.get(6) , foodPrice.get(6));
        food8 = foodList(pizzaSpecial ,img8 , favorite8 ,cart8, foodName.get(7) , foodPrice.get(7));
        food9 = foodList(pizzaMix ,img9 ,favorite9 ,cart9,  foodName.get(8) , foodPrice.get(8));
        food10 = foodList(doubleBurger ,img10 ,favorite10 ,cart10,  foodName.get(9) , foodPrice.get(9));
        food11 = foodList(zingerBurger ,img11 ,favorite11 ,cart11,  foodName.get(10) , foodPrice.get(10));
        food12 = foodList(chickenGrillBurger ,img12 ,favorite12 ,cart12,  foodName.get(11) , foodPrice.get(11));
        food13 = foodList(cheeseBurger ,img13 , favorite13 ,cart13, foodName.get(12) , foodPrice.get(12));
        food14 = foodList(royalBurger ,img14 , favorite14 ,cart14, foodName.get(13) , foodPrice.get(13));
        food15 = foodList(eggBurger ,img15 , favorite15 ,cart15, foodName.get(14) , foodPrice.get(14));
        food16 = foodList(roastBeef ,img16 , favorite16 ,cart16, foodName.get(15) , foodPrice.get(15));
        food17 = foodList(supreme ,img17 , favorite17 ,cart17, foodName.get(16) , foodPrice.get(16));
        food18 = foodList(panini ,img18 , favorite18 ,cart18, foodName.get(17) , foodPrice.get(17));
        food19 = foodList(hotdog ,img19 , favorite19 ,cart19, foodName.get(18) , foodPrice.get(18));
        food20 = foodList(gammon ,img20 , favorite20 ,cart20, foodName.get(19) , foodPrice.get(19));
        food21 = foodList(specialSandwich ,img21 ,favorite21,cart21,  foodName.get(20) , foodPrice.get(20));
        food22 = foodList(chicken ,img22 , favorite22 ,cart22, foodName.get(21) , foodPrice.get(21));
        food23 = foodList(kentucky ,img23 , favorite23 ,cart23, foodName.get(22) , foodPrice.get(22));
        food24 = foodList(crispy ,img24 , favorite24 ,cart24, foodName.get(23) , foodPrice.get(23));
        food25 = foodList(familyBox ,img25 , favorite25 ,cart25, foodName.get(24) , foodPrice.get(24));
        food26 = foodList(jFoodBox ,img26 , favorite26 ,cart26, foodName.get(25) , foodPrice.get(25));
        food27 = foodList(water ,img27 ,favorite27 ,cart27,  foodName.get(26) , foodPrice.get(26));
        food28 = foodList(cocaCola ,img28 , favorite28 ,cart28, foodName.get(27) , foodPrice.get(27));
        food29 = foodList(cocaColaZero ,img29 ,favorite29 ,cart29,  foodName.get(28) , foodPrice.get(28));
        food30 = foodList(sprite ,img30 , favorite30 ,cart30, foodName.get(29) , foodPrice.get(29));
        food31 = foodList(dough ,img31 , favorite31 ,cart31, foodName.get(30) , foodPrice.get(30));
        food32 = foodList(mojito ,img32 , favorite32 ,cart32, foodName.get(31) , foodPrice.get(31));
        food33 = foodList(redMojito ,img33 , favorite33 ,cart33, foodName.get(32) , foodPrice.get(32));
        food34 = foodList(cesar ,img34 , favorite34 ,cart34, foodName.get(33) , foodPrice.get(33));
        food35 = foodList(chefsSalad ,img35 , favorite35 ,cart35, foodName.get(34) , foodPrice.get(34));
        food36 = foodList(italianSalad ,img36 , favorite36 ,cart36, foodName.get(35) , foodPrice.get(35));

        food1.addMouseListener(this);

        backGround.setBounds(0, 0, 1350, 720);
        backGround.setIcon(mainBackGround);

        homeIcon.setBounds(15, 80, 45, 45);
        homeIcon.setIcon(homeIcon2);
        homeIcon.addMouseListener(this);

        categoryIcon.setBounds(15, 180, 45, 45);
        categoryIcon.setIcon(categoryIcon1);
        categoryIcon.addMouseListener(this);

        heartIcon.setBounds(15, 280, 45, 45);
        heartIcon.setIcon(heartIcon2);
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

        userLabel1.setPreferredSize(new Dimension(250 , 40));
        userLabel1.setFont(new Font("Century gothic", Font.BOLD, 28));
        userLabel1.setForeground(Color.white);

        emailLabel1.setPreferredSize(new Dimension(250 , 40));
        emailLabel1.setFont(new Font("Century gothic", Font.BOLD, 15));
        emailLabel1.setForeground(Color.white);

        addressLabel1.setPreferredSize(new Dimension(250 , 40));
        addressLabel1.setFont(new Font("Century gothic", Font.BOLD, 15));
        addressLabel1.setForeground(Color.white);

        payment1.setText("Pay:        "+categoryPage.total+"$");
        payment1.setPreferredSize(new Dimension(180 , 40));
        payment1.setOpaque(true);
        payment1.setFont(new Font("GT America" , Font.BOLD , 15));
        payment1.setBorder(new EmptyBorder(0,0,0,0));
        payment1.setBackground(Color.white);
        payment1.setForeground(new Color(40 , 25 , 132 ));
        payment1.addActionListener(this);


        JPanel userInf = new JPanel();
        userInf.setBounds(1010 , -5 , 280 , 160);
        userInf.setLayout(new FlowLayout(FlowLayout.CENTER , 0 , 0));
        userInf.setBackground(new Color(40 , 25 ,132));
        userInf.add(userLabel1);
        userInf.add(emailLabel1);
        userInf.add(addressLabel1);
        userInf.add(payment1);




        ctg1 = new ImageIcon("Image/CTG1.png");
        ctg2 = new ImageIcon("Image/CTG2.png");

        pizzaImg = new ImageIcon("Image/PizzaImg.png");
        sandwichImg = new ImageIcon("Image/SandwichImg.png");
        burgerImg = new ImageIcon("Image/BurgerImg.png");
        chickenImg = new ImageIcon("Image/ChickenImg.png");
        drinkImg = new ImageIcon("Image/DrinkImg.png");
        saladImg = new ImageIcon("Image/SaladImg.png");




        pizzaBg = new JLabel();
        pizzaBg.setBounds(0, 0 , 90 , 125);
        pizzaBg.setIcon(ctg1);
        pizzaBg.addMouseListener(this);

        JLabel pizzaI = new JLabel();
        pizzaI.setBounds(18 , 38 , 48 , 48);
        pizzaI.setIcon(pizzaImg);

        JLayeredPane pizzaCtg = new JLayeredPane();
        pizzaCtg.setOpaque(true);
        pizzaCtg.setPreferredSize(new Dimension(90 , 125));
        pizzaCtg.setBackground(new Color(245 , 245 , 254));
        pizzaCtg.setLayout(null);
        pizzaCtg.add(pizzaI);
        pizzaCtg.add(pizzaBg);



        burgerBg = new JLabel();
        burgerBg.setBounds(0, 0 , 90 , 125);
        burgerBg.setIcon(ctg1);
        burgerBg.addMouseListener(this);

        JLabel burgerI = new JLabel();
        burgerI.setBounds(18 , 38 , 48 , 48);
        burgerI.setIcon(burgerImg);

        JLayeredPane burgerCtg = new JLayeredPane();
        burgerCtg.setOpaque(true);
        burgerCtg.setPreferredSize(new Dimension(90 , 125));
        burgerCtg.setBackground(new Color(245 , 245 , 254));
        burgerCtg.setLayout(null);
        burgerCtg.add(burgerI);
        burgerCtg.add(burgerBg);




        sandwichBg = new JLabel();
        sandwichBg.setBounds(0, 0 , 90 , 125);
        sandwichBg.setIcon(ctg1);
        sandwichBg.addMouseListener(this);

        JLabel sandwichI = new JLabel();
        sandwichI.setBounds(18 , 38 , 48 , 48);
        sandwichI.setIcon(sandwichImg);

        JLayeredPane sandwichCtg = new JLayeredPane();
        sandwichCtg.setOpaque(true);
        sandwichCtg.setPreferredSize(new Dimension(90 , 125));
        sandwichCtg.setBackground(new Color(245 , 245 , 254));
        sandwichCtg.setLayout(null);
        sandwichCtg.add(sandwichI);
        sandwichCtg.add(sandwichBg);


        chickenBg = new JLabel();
        chickenBg.setBounds(0, 0 , 90 , 125);
        chickenBg.setIcon(ctg1);
        chickenBg.addMouseListener(this);

        JLabel chickenI = new JLabel();
        chickenI.setBounds(18 , 38 , 48 , 48);
        chickenI.setIcon(chickenImg);

        JLayeredPane chickenCtg = new JLayeredPane();
        chickenCtg.setOpaque(true);
        chickenCtg.setPreferredSize(new Dimension(90 , 125));
        chickenCtg.setBackground(new Color(245 , 245 , 254));
        chickenCtg.setLayout(null);

        chickenCtg.add(chickenI);
        chickenCtg.add(chickenBg);


        drinkBg = new JLabel();
        drinkBg.setBounds(0, 0 , 90 , 125);
        drinkBg.setIcon(ctg1);
        drinkBg.addMouseListener(this);

        JLabel drinkI = new JLabel();
        drinkI.setBounds(18 , 38 , 48 , 48);
        drinkI.setIcon(drinkImg);

        JLayeredPane drinkCtg = new JLayeredPane();
        drinkCtg.setOpaque(true);
        drinkCtg.setPreferredSize(new Dimension(90 , 125));
        drinkCtg.setBackground(new Color(245 , 245 , 254));
        drinkCtg.setLayout(null);
        drinkCtg.add(drinkI);
        drinkCtg.add(drinkBg);


        saladBg = new JLabel();
        saladBg.setBounds(0, 0 , 90 , 125);
        saladBg.setIcon(ctg1);
        saladBg.addMouseListener(this);

        JLabel saladI = new JLabel();
        saladI.setBounds(18 , 38 , 48 , 48);
        saladI.setIcon(saladImg);

        JLayeredPane saladCtg = new JLayeredPane();
        saladCtg.setOpaque(true);
        saladCtg.setPreferredSize(new Dimension(90 , 125));
        saladCtg.setBackground(new Color(245 , 245 , 254));
        saladCtg.setLayout(null);
        saladCtg.add(saladI);
        saladCtg.add(saladBg);



        topPanel = new JPanel();
        topPanel.setBounds(65 , 15 , 935 , 155);
        topPanel.setOpaque(true);
        topPanel.setBackground(new Color(245 , 245 , 254));
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER , 40 , 5 ));
        topPanel.add(pizzaCtg);
        topPanel.add(burgerCtg);
        topPanel.add(sandwichCtg);
        topPanel.add(chickenCtg);
        topPanel.add(drinkCtg);
        topPanel.add(saladCtg);





        mainFoodPanel = new JPanel();
        mainFoodPanel.setLayout(new GridLayout(0 , 3 , 30 , 20));
        mainFoodPanel.setOpaque(true);
        mainFoodPanel.setPreferredSize(new Dimension(935 , 3300));
        mainFoodPanel.setBackground(new Color(245 , 245 , 254));
        if(HomeClass.selectedCategory == 0) {
            mainFoodPanel.add(food1);
            mainFoodPanel.add(food2);
            mainFoodPanel.add(food3);
            mainFoodPanel.add(food4);
            mainFoodPanel.add(food5);
            mainFoodPanel.add(food6);
            mainFoodPanel.add(food7);
            mainFoodPanel.add(food8);
            mainFoodPanel.add(food9);
            mainFoodPanel.add(food10);
            mainFoodPanel.add(food11);
            mainFoodPanel.add(food12);
            mainFoodPanel.add(food13);
            mainFoodPanel.add(food14);
            mainFoodPanel.add(food15);
            mainFoodPanel.add(food16);
            mainFoodPanel.add(food17);
            mainFoodPanel.add(food18);
            mainFoodPanel.add(food19);
            mainFoodPanel.add(food20);
            mainFoodPanel.add(food21);
            mainFoodPanel.add(food22);
            mainFoodPanel.add(food23);
            mainFoodPanel.add(food24);
            mainFoodPanel.add(food25);
            mainFoodPanel.add(food26);
            mainFoodPanel.add(food27);
            mainFoodPanel.add(food28);
            mainFoodPanel.add(food29);
            mainFoodPanel.add(food30);
            mainFoodPanel.add(food31);
            mainFoodPanel.add(food32);
            mainFoodPanel.add(food33);
            mainFoodPanel.add(food34);
            mainFoodPanel.add(food35);
            mainFoodPanel.add(food36);
        }else if(HomeClass.selectedCategory == 1){
            mainFoodPanel.add(food1);
            mainFoodPanel.add(food2);
            mainFoodPanel.add(food3);
            mainFoodPanel.add(food4);
            mainFoodPanel.add(food5);
            mainFoodPanel.add(food6);
            mainFoodPanel.add(food7);
            mainFoodPanel.add(food8);
            mainFoodPanel.add(food9);
            active1 = 1;
            pizzaBg.setIcon(ctg2);
            mainFoodPanel.setPreferredSize(new Dimension(935 , 800));
        }else if(HomeClass.selectedCategory == 2){
            mainFoodPanel.add(food10);
            mainFoodPanel.add(food11);
            mainFoodPanel.add(food12);
            mainFoodPanel.add(food13);
            mainFoodPanel.add(food14);
            mainFoodPanel.add(food15);
            active2 = 1;
            burgerBg.setIcon(ctg2);
            mainFoodPanel.setPreferredSize(new Dimension(935 , 580));
        }else if(HomeClass.selectedCategory == 3){
            mainFoodPanel.add(food16);
            mainFoodPanel.add(food17);
            mainFoodPanel.add(food18);
            mainFoodPanel.add(food19);
            mainFoodPanel.add(food20);
            mainFoodPanel.add(food21);
            active3 = 1;
            sandwichBg.setIcon(ctg2);
            mainFoodPanel.setPreferredSize(new Dimension(935 , 580));
        }else if(HomeClass.selectedCategory == 4){
            mainFoodPanel.add(food22);
            mainFoodPanel.add(food23);
            mainFoodPanel.add(food24);
            mainFoodPanel.add(food25);
            mainFoodPanel.add(food26);
            active4 = 1;
            chickenBg.setIcon(ctg2);
            mainFoodPanel.setPreferredSize(new Dimension(935 , 580));
        }else if(HomeClass.selectedCategory == 5){
            mainFoodPanel.add(food27);
            mainFoodPanel.add(food28);
            mainFoodPanel.add(food29);
            mainFoodPanel.add(food30);
            mainFoodPanel.add(food31);
            mainFoodPanel.add(food32);
            mainFoodPanel.add(food33);
            active5 = 1;
            drinkBg.setIcon(ctg2);
            mainFoodPanel.setPreferredSize(new Dimension(935 , 800));
        }else if(HomeClass.selectedCategory == 6){
            mainFoodPanel.add(food34);
            mainFoodPanel.add(food35);
            mainFoodPanel.add(food36);
            active6 = 1;
            saladBg.setIcon(ctg2);
            mainFoodPanel.setPreferredSize(new Dimension(935 , 580));
        }



        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        centerPanel.setBounds(65 , 170 , 935 , 510);
        centerPanel.add(mainFoodPanel , BorderLayout.CENTER);


        JScrollPane scroll = new JScrollPane(centerPanel , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBounds(65 , 170 , 935 , 510);
        scroll.setBorder(new EmptyBorder(0 , 0 , 0 , 0));


        JPanel cartScroll = new JPanel();
        cartScroll.setLayout(new BorderLayout());
        cartScroll.setBounds(1010 , 200 , 280 , 350);
        cartScroll.setOpaque(true);
        cartScroll.setBackground(Color.white);

        cartPanel.setPreferredSize(new Dimension(260 , 1000));
        cartPanel.setOpaque(true);
        cartPanel.setBackground(Color.white);
        cartScroll.add(cartPanel , BorderLayout.CENTER);

        JScrollPane itemScroll = new JScrollPane(cartScroll , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        itemScroll.setBounds(1010 , 200 , 280 , 350);
        itemScroll.setBorder(new EmptyBorder(0 , 0 , 0 , 0));
        itemScroll.setOpaque(true);
        itemScroll.setBackground(Color.white);


        totalP.setText("Total Price :      " + total+"$");
        totalP.setForeground(Color.white);
        totalP.setFont(new Font("GT America" , Font.BOLD , 15));

        buy.setPreferredSize(new Dimension(180 , 40 ));
        buy.setBackground(Color.white);
        buy.setFont(new Font("GT America" , Font.BOLD , 15));
        buy.setOpaque(true);
        buy.setForeground(new Color(96 , 76 , 209));
        buy.setBorder(new EmptyBorder( 0 , 0 ,0 , 0));
        buy.addActionListener(this);


        JPanel buyPanel = new JPanel();
        buyPanel.setBounds(1010 , 550 , 260 ,100 );
        buyPanel.setOpaque(true);
        buyPanel.setBackground(new Color(96 , 76 , 209 ));
        buyPanel.setLayout(new FlowLayout(FlowLayout.CENTER , 20 , 10));
        buyPanel.add(totalP);
        buyPanel.add(buy);

        mainPanel.add(buyPanel);
        mainPanel.add(scroll);
        mainPanel.add(itemScroll);
        mainPanel.add(userInf);
        mainPanel.add(topPanel);
        mainPanel.add(backGround);


        frame.add(mainPanel);
        frame.setSize( 1300, 704);
        frame.setResizable(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JLayeredPane foodList( ImageIcon image, JLabel foodImage ,JLabel favorite , JLabel cartBack, String foodName , int foodPrice ){

        foodBackground = new ImageIcon(new ImageIcon("Image/foodBack.png").getImage().getScaledInstance(240 , 175 , Image.SCALE_DEFAULT));
        foodBackgroundB = new ImageIcon(new ImageIcon("Image/foodBackB.png").getImage().getScaledInstance(240 , 175 , Image.SCALE_DEFAULT));

        JLabel foodBack = new JLabel();
        foodBack.setIcon(foodBackground);
        foodBack.setBounds(0 , 55 , 240 , 175);


        foodImage.setBounds(10 , 0 , 220 , 110);
        foodImage.setIcon(image);
        foodImage.addMouseListener(this);

        JLabel name = new JLabel(foodName);
        name.setFont(new Font("GT America" , Font.BOLD , 19));


        favorite.setIcon(unlike);
        favorite.setPreferredSize(new Dimension(30 , 30 ));
        favorite.addMouseListener(this);

        JLabel price = new JLabel("       "+(foodPrice)+"$");
        price.setPreferredSize(new Dimension(120 , 30));
        price.setFont(new Font("GT America" , Font.BOLD , 15));

        cartBack.setBounds(0 , 0 , 90 , 40);
        cartBack.addMouseListener(this);
        JLabel cartText = new JLabel("Add to Cart");
        cartText.setForeground(Color.WHITE);
        cartText.setFont(new Font("GT America" , Font.BOLD , 12));
        cartText.setBounds(10 , 10 , 70 , 20);

        if(availability.get(flag) == 0){
            cartBack.setIcon(unavailable);
            cartText.setText("Unavailable");
        }

        JLayeredPane addCart = new JLayeredPane();
        addCart.setLayout(null);
        addCart.setPreferredSize(new Dimension(100 , 40 ));
        addCart.add(cartText);
        addCart.add(cartBack);

        JLayeredPane textBox = new JLayeredPane();
        textBox.setBounds(0 , 110 , 240 , 150);
        textBox.setBackground(null);
        textBox.setLayout(new FlowLayout(FlowLayout.CENTER , 10 , 15));
        textBox.add(name);
        textBox.add(favorite);
        textBox.add(price);
        textBox.add(addCart);

        JLayeredPane foodPanel = new JLayeredPane();
        foodPanel.add(foodImage);
        foodPanel.add(textBox);
        foodPanel.add(foodBack);


        flag++;
        return foodPanel;
    }

    public static JLayeredPane cartItem(String foodN , int foodP , JLabel totalP){
        ImageIcon remove= new ImageIcon(new ImageIcon("Image/remove.png").getImage().getScaledInstance(21 , 25 , Image.SCALE_DEFAULT));
        JLabel foodname = new JLabel(foodN);
        foodname.setFont(new Font("GT America" , Font.BOLD , 15));
        foodname.setPreferredSize(new Dimension(150 , 40));

        JLabel foodprice = new JLabel((foodP)+"$");
        foodprice.setFont(new Font("GT America" , Font.BOLD , 15));
        foodprice.setPreferredSize(new Dimension(40 , 40));

        JButton removeItem = new JButton(remove);
        removeItem.setPreferredSize(new Dimension(21 , 40));
        removeItem.setFocusable(false);
        removeItem.setBorder(new EmptyBorder(0 , 0,0 ,0));

        JLayeredPane foodItem = new JLayeredPane();
        foodItem.setLayout(new FlowLayout(FlowLayout.CENTER , 0 , 0));
        foodItem.setPreferredSize(new Dimension(280 , 40));
        foodItem.add(foodname);
        foodItem.add(foodprice);
        foodItem.add(removeItem);
        removeItem.addActionListener(e -> {foodItem.setVisible(false);
            total -=foodP;
            totalP.setText("Total Price :      " + total+"$");
            for(int i = 0 ; i < foodName.size();i++){
                if(foodN.equals(cartIndex.get(i))){
                    cartIndex.remove(i);
                    cartIndex1.remove(i);
                    break;
                }
            }
        });
        return foodItem;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buy){
            try {
                if(loggedIn == 1) {
                    File file = new File("File/" + Main.userA.get(0) + ".txt");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.write(Main.passA.get(0)+"\n");
                    writer.write(Main.emailA.get(0)+"\n");
                    writer.write(Main.addressA.get(0)+"\n");
                    for(int i = 0 ; i < cartIndex1.size(); i++){
                        writer.write(foodName.get(cartIndex1.get(i))+"\n");
                    }
                    payment1.setText("Pay:        "+categoryPage.total+"$");
                    writer.close();
                }else{
                    JOptionPane.showMessageDialog(null, "First You must sign up/in your account");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else if(e.getSource() == payment1){
            try {

                HomeClass.writer.append(Main.userA.get(0)).append("\n");
                HomeClass.writer.append(HomeClass.TimeFormat.format(Calendar.getInstance().getTime())).append(" ").append(HomeClass.DayFormat.format(Calendar.getInstance().getTime())).append(" ").append(HomeClass.DateFormat.format(Calendar.getInstance().getTime())).append("\n");
                HomeClass.writer.append(String.valueOf(categoryPage.total)).append("\n");
                cartPanel.removeAll();
                cartPanel.revalidate();
                cartPanel.repaint();
                total = 0;
                cartIndex.clear();
                cartIndex1.clear();
                File file = new File("File/" + Main.userA.get(0) + ".txt");
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(Main.passA.get(0)+"\n");
                writer.write(Main.emailA.get(0)+"\n");
                writer.write(Main.addressA.get(0)+"\n");
                for(int i = 0 ; i < cartIndex1.size(); i++){
                    writer.write(foodName.get(cartIndex1.get(i))+"\n");
                }
                payment1.setText("Pay:        "+total+"$");
                writer.close();
                totalP.setText("Total Price :      " + total + "$");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == homeIcon) {
            homeIcon.setIcon(homeIcon1);
            categoryIcon.setIcon(categoryIcon2);
            heartIcon.setIcon(heartIcon2);
            exitIcon.setIcon(exitIcon2);
            try {
                new HomeClass();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            frame.dispose();
        }
        if (e.getSource() == categoryIcon) {
            homeIcon.setIcon(homeIcon2);
            categoryIcon.setIcon(categoryIcon1);
            heartIcon.setIcon(heartIcon2);
            exitIcon.setIcon(exitIcon2);
        }
        if (e.getSource() == heartIcon) {
            homeIcon.setIcon(homeIcon2);
            categoryIcon.setIcon(categoryIcon2);
            heartIcon.setIcon(heartIcon1);
            exitIcon.setIcon(exitIcon2);
            new favoriteFood();
            frame.dispose();
        }
        if (e.getSource() == exitIcon) {
            homeIcon.setIcon(homeIcon2);
            categoryIcon.setIcon(categoryIcon2);
            heartIcon.setIcon(heartIcon2);
            exitIcon.setIcon(exitIcon1);
            frame.dispose();
        }else if(e.getSource() == pizzaBg){
            if(active1 == 0){
                pizzaBg.setIcon(ctg2);
                active1 = 1;
                mainFoodPanel.remove(food10);
                mainFoodPanel.remove(food11);
                mainFoodPanel.remove(food12);
                mainFoodPanel.remove(food13);
                mainFoodPanel.remove(food14);
                mainFoodPanel.remove(food15);
                mainFoodPanel.remove(food16);
                mainFoodPanel.remove(food17);
                mainFoodPanel.remove(food18);
                mainFoodPanel.remove(food19);
                mainFoodPanel.remove(food20);
                mainFoodPanel.remove(food21);
                mainFoodPanel.remove(food22);
                mainFoodPanel.remove(food23);
                mainFoodPanel.remove(food24);
                mainFoodPanel.remove(food25);
                mainFoodPanel.remove(food26);
                mainFoodPanel.remove(food27);
                mainFoodPanel.remove(food28);
                mainFoodPanel.remove(food29);
                mainFoodPanel.remove(food30);
                mainFoodPanel.remove(food31);
                mainFoodPanel.remove(food32);
                mainFoodPanel.remove(food33);
                mainFoodPanel.remove(food34);
                mainFoodPanel.remove(food35);
                mainFoodPanel.remove(food36);
                mainFoodPanel.setPreferredSize(new Dimension(935 , 800));
            }else{
                pizzaBg.setIcon(ctg1);
                active1 = 0;
                mainFoodPanel.add(food10);
                mainFoodPanel.add(food11);
                mainFoodPanel.add(food12);
                mainFoodPanel.add(food13);
                mainFoodPanel.add(food14);
                mainFoodPanel.add(food15);
                mainFoodPanel.add(food16);
                mainFoodPanel.add(food17);
                mainFoodPanel.add(food18);
                mainFoodPanel.add(food19);
                mainFoodPanel.add(food20);
                mainFoodPanel.add(food21);
                mainFoodPanel.add(food22);
                mainFoodPanel.add(food23);
                mainFoodPanel.add(food24);
                mainFoodPanel.add(food25);
                mainFoodPanel.add(food26);
                mainFoodPanel.add(food27);
                mainFoodPanel.add(food28);
                mainFoodPanel.add(food29);
                mainFoodPanel.add(food30);
                mainFoodPanel.add(food31);
                mainFoodPanel.add(food32);
                mainFoodPanel.add(food33);
                mainFoodPanel.add(food34);
                mainFoodPanel.add(food35);
                mainFoodPanel.add(food36);

                mainFoodPanel.setPreferredSize(new Dimension(935 , 3300));
            }
        }else if(e.getSource() == burgerBg){
            if(active2 == 0) {
                burgerBg.setIcon(ctg2);
                active2 = 1;
                mainFoodPanel.remove(food1);
                mainFoodPanel.remove(food2);
                mainFoodPanel.remove(food3);
                mainFoodPanel.remove(food4);
                mainFoodPanel.remove(food5);
                mainFoodPanel.remove(food6);
                mainFoodPanel.remove(food7);
                mainFoodPanel.remove(food8);
                mainFoodPanel.remove(food9);
                mainFoodPanel.remove(food16);
                mainFoodPanel.remove(food17);
                mainFoodPanel.remove(food18);
                mainFoodPanel.remove(food19);
                mainFoodPanel.remove(food20);
                mainFoodPanel.remove(food21);
                mainFoodPanel.remove(food22);
                mainFoodPanel.remove(food23);
                mainFoodPanel.remove(food24);
                mainFoodPanel.remove(food25);
                mainFoodPanel.remove(food26);
                mainFoodPanel.remove(food27);
                mainFoodPanel.remove(food28);
                mainFoodPanel.remove(food29);
                mainFoodPanel.remove(food30);
                mainFoodPanel.remove(food31);
                mainFoodPanel.remove(food32);
                mainFoodPanel.remove(food33);
                mainFoodPanel.remove(food34);
                mainFoodPanel.remove(food35);
                mainFoodPanel.remove(food36);
                mainFoodPanel.setPreferredSize(new Dimension(935 , 600));
            }else{
                burgerBg.setIcon(ctg1);
                active2 = 0;
                mainFoodPanel.remove(food10);
                mainFoodPanel.remove(food11);
                mainFoodPanel.remove(food12);
                mainFoodPanel.remove(food13);
                mainFoodPanel.remove(food14);
                mainFoodPanel.remove(food15);
                mainFoodPanel.add(food1);
                mainFoodPanel.add(food2);
                mainFoodPanel.add(food3);
                mainFoodPanel.add(food4);
                mainFoodPanel.add(food5);
                mainFoodPanel.add(food6);
                mainFoodPanel.add(food7);
                mainFoodPanel.add(food8);
                mainFoodPanel.add(food9);
                mainFoodPanel.add(food10);
                mainFoodPanel.add(food11);
                mainFoodPanel.add(food12);
                mainFoodPanel.add(food13);
                mainFoodPanel.add(food14);
                mainFoodPanel.add(food15);
                mainFoodPanel.add(food16);
                mainFoodPanel.add(food17);
                mainFoodPanel.add(food18);
                mainFoodPanel.add(food19);
                mainFoodPanel.add(food20);
                mainFoodPanel.add(food21);
                mainFoodPanel.add(food22);
                mainFoodPanel.add(food23);
                mainFoodPanel.add(food24);
                mainFoodPanel.add(food25);
                mainFoodPanel.add(food26);
                mainFoodPanel.add(food27);
                mainFoodPanel.add(food28);
                mainFoodPanel.add(food29);
                mainFoodPanel.add(food30);
                mainFoodPanel.add(food31);
                mainFoodPanel.add(food32);
                mainFoodPanel.add(food33);
                mainFoodPanel.add(food34);
                mainFoodPanel.add(food35);
                mainFoodPanel.add(food36);
                mainFoodPanel.setPreferredSize(new Dimension(935 , 3300));
            }

        }else if(e.getSource() == sandwichBg){
            if(active3 == 0) {
                sandwichBg.setIcon(ctg2);
                active3 = 1;
                mainFoodPanel.remove(food1);
                mainFoodPanel.remove(food2);
                mainFoodPanel.remove(food3);
                mainFoodPanel.remove(food4);
                mainFoodPanel.remove(food5);
                mainFoodPanel.remove(food6);
                mainFoodPanel.remove(food7);
                mainFoodPanel.remove(food8);
                mainFoodPanel.remove(food9);
                mainFoodPanel.remove(food10);
                mainFoodPanel.remove(food11);
                mainFoodPanel.remove(food12);
                mainFoodPanel.remove(food13);
                mainFoodPanel.remove(food14);
                mainFoodPanel.remove(food15);
                mainFoodPanel.remove(food22);
                mainFoodPanel.remove(food23);
                mainFoodPanel.remove(food24);
                mainFoodPanel.remove(food25);
                mainFoodPanel.remove(food26);
                mainFoodPanel.remove(food27);
                mainFoodPanel.remove(food28);
                mainFoodPanel.remove(food29);
                mainFoodPanel.remove(food30);
                mainFoodPanel.remove(food31);
                mainFoodPanel.remove(food32);
                mainFoodPanel.remove(food33);
                mainFoodPanel.remove(food34);
                mainFoodPanel.remove(food35);
                mainFoodPanel.remove(food36);
                mainFoodPanel.setPreferredSize(new Dimension(935 , 600));
            }else{
                sandwichBg.setIcon(ctg1);
                active3 = 0;
                mainFoodPanel.remove(food16);
                mainFoodPanel.remove(food17);
                mainFoodPanel.remove(food18);
                mainFoodPanel.remove(food19);
                mainFoodPanel.remove(food20);
                mainFoodPanel.remove(food21);
                mainFoodPanel.add(food1);
                mainFoodPanel.add(food2);
                mainFoodPanel.add(food3);
                mainFoodPanel.add(food4);
                mainFoodPanel.add(food5);
                mainFoodPanel.add(food6);
                mainFoodPanel.add(food7);
                mainFoodPanel.add(food8);
                mainFoodPanel.add(food9);
                mainFoodPanel.add(food10);
                mainFoodPanel.add(food11);
                mainFoodPanel.add(food12);
                mainFoodPanel.add(food13);
                mainFoodPanel.add(food14);
                mainFoodPanel.add(food15);
                mainFoodPanel.add(food16);
                mainFoodPanel.add(food17);
                mainFoodPanel.add(food18);
                mainFoodPanel.add(food19);
                mainFoodPanel.add(food20);
                mainFoodPanel.add(food21);
                mainFoodPanel.add(food22);
                mainFoodPanel.add(food23);
                mainFoodPanel.add(food24);
                mainFoodPanel.add(food25);
                mainFoodPanel.add(food26);
                mainFoodPanel.add(food27);
                mainFoodPanel.add(food28);
                mainFoodPanel.add(food29);
                mainFoodPanel.add(food30);
                mainFoodPanel.add(food31);
                mainFoodPanel.add(food32);
                mainFoodPanel.add(food33);
                mainFoodPanel.add(food34);
                mainFoodPanel.add(food35);
                mainFoodPanel.add(food36);
                mainFoodPanel.setPreferredSize(new Dimension(935 , 3300));
            }

        }else if(e.getSource() == chickenBg){

            if(active4 == 0) {
                chickenBg.setIcon(ctg2);
                active4 = 1;
                mainFoodPanel.remove(food1);
                mainFoodPanel.remove(food2);
                mainFoodPanel.remove(food3);
                mainFoodPanel.remove(food4);
                mainFoodPanel.remove(food5);
                mainFoodPanel.remove(food6);
                mainFoodPanel.remove(food7);
                mainFoodPanel.remove(food8);
                mainFoodPanel.remove(food9);
                mainFoodPanel.remove(food10);
                mainFoodPanel.remove(food11);
                mainFoodPanel.remove(food12);
                mainFoodPanel.remove(food13);
                mainFoodPanel.remove(food14);
                mainFoodPanel.remove(food15);
                mainFoodPanel.remove(food16);
                mainFoodPanel.remove(food17);
                mainFoodPanel.remove(food18);
                mainFoodPanel.remove(food19);
                mainFoodPanel.remove(food20);
                mainFoodPanel.remove(food21);
                mainFoodPanel.remove(food27);
                mainFoodPanel.remove(food28);
                mainFoodPanel.remove(food29);
                mainFoodPanel.remove(food30);
                mainFoodPanel.remove(food31);
                mainFoodPanel.remove(food32);
                mainFoodPanel.remove(food33);
                mainFoodPanel.remove(food34);
                mainFoodPanel.remove(food35);
                mainFoodPanel.remove(food36);
                mainFoodPanel.setPreferredSize(new Dimension(935 , 600));
            }else{
                chickenBg.setIcon(ctg1);
                active4 = 0;

                mainFoodPanel.remove(food22);
                mainFoodPanel.remove(food23);
                mainFoodPanel.remove(food24);
                mainFoodPanel.remove(food25);
                mainFoodPanel.remove(food26);
                mainFoodPanel.add(food1);
                mainFoodPanel.add(food2);
                mainFoodPanel.add(food3);
                mainFoodPanel.add(food4);
                mainFoodPanel.add(food5);
                mainFoodPanel.add(food6);
                mainFoodPanel.add(food7);
                mainFoodPanel.add(food8);
                mainFoodPanel.add(food9);
                mainFoodPanel.add(food10);
                mainFoodPanel.add(food11);
                mainFoodPanel.add(food12);
                mainFoodPanel.add(food13);
                mainFoodPanel.add(food14);
                mainFoodPanel.add(food15);
                mainFoodPanel.add(food16);
                mainFoodPanel.add(food17);
                mainFoodPanel.add(food18);
                mainFoodPanel.add(food19);
                mainFoodPanel.add(food20);
                mainFoodPanel.add(food21);
                mainFoodPanel.add(food22);
                mainFoodPanel.add(food23);
                mainFoodPanel.add(food24);
                mainFoodPanel.add(food25);
                mainFoodPanel.add(food26);
                mainFoodPanel.add(food27);
                mainFoodPanel.add(food28);
                mainFoodPanel.add(food29);
                mainFoodPanel.add(food30);
                mainFoodPanel.add(food31);
                mainFoodPanel.add(food32);
                mainFoodPanel.add(food33);
                mainFoodPanel.add(food34);
                mainFoodPanel.add(food35);
                mainFoodPanel.add(food36);
                mainFoodPanel.setPreferredSize(new Dimension(935 , 3300));
            }


        }else if(e.getSource() == drinkBg){


            if(active5 == 0) {
                drinkBg.setIcon(ctg2);
                active5 = 1;
                mainFoodPanel.remove(food1);
                mainFoodPanel.remove(food2);
                mainFoodPanel.remove(food3);
                mainFoodPanel.remove(food4);
                mainFoodPanel.remove(food5);
                mainFoodPanel.remove(food6);
                mainFoodPanel.remove(food7);
                mainFoodPanel.remove(food8);
                mainFoodPanel.remove(food9);
                mainFoodPanel.remove(food10);
                mainFoodPanel.remove(food11);
                mainFoodPanel.remove(food12);
                mainFoodPanel.remove(food13);
                mainFoodPanel.remove(food14);
                mainFoodPanel.remove(food15);
                mainFoodPanel.remove(food16);
                mainFoodPanel.remove(food17);
                mainFoodPanel.remove(food18);
                mainFoodPanel.remove(food19);
                mainFoodPanel.remove(food20);
                mainFoodPanel.remove(food21);
                mainFoodPanel.remove(food22);
                mainFoodPanel.remove(food23);
                mainFoodPanel.remove(food24);
                mainFoodPanel.remove(food25);
                mainFoodPanel.remove(food26);
                mainFoodPanel.remove(food34);
                mainFoodPanel.remove(food35);
                mainFoodPanel.remove(food36);
                mainFoodPanel.setPreferredSize(new Dimension(935 , 800));
            }else{
                drinkBg.setIcon(ctg1);
                active5 = 0;
                mainFoodPanel.remove(food27);
                mainFoodPanel.remove(food28);
                mainFoodPanel.remove(food29);
                mainFoodPanel.remove(food30);
                mainFoodPanel.remove(food31);
                mainFoodPanel.remove(food32);
                mainFoodPanel.remove(food33);
                mainFoodPanel.add(food1);
                mainFoodPanel.add(food2);
                mainFoodPanel.add(food3);
                mainFoodPanel.add(food4);
                mainFoodPanel.add(food5);
                mainFoodPanel.add(food6);
                mainFoodPanel.add(food7);
                mainFoodPanel.add(food8);
                mainFoodPanel.add(food9);
                mainFoodPanel.add(food10);
                mainFoodPanel.add(food11);
                mainFoodPanel.add(food12);
                mainFoodPanel.add(food13);
                mainFoodPanel.add(food14);
                mainFoodPanel.add(food15);
                mainFoodPanel.add(food16);
                mainFoodPanel.add(food17);
                mainFoodPanel.add(food18);
                mainFoodPanel.add(food19);
                mainFoodPanel.add(food20);
                mainFoodPanel.add(food21);
                mainFoodPanel.add(food22);
                mainFoodPanel.add(food23);
                mainFoodPanel.add(food24);
                mainFoodPanel.add(food25);
                mainFoodPanel.add(food26);
                mainFoodPanel.add(food27);
                mainFoodPanel.add(food28);
                mainFoodPanel.add(food29);
                mainFoodPanel.add(food30);
                mainFoodPanel.add(food31);
                mainFoodPanel.add(food32);
                mainFoodPanel.add(food33);
                mainFoodPanel.add(food34);
                mainFoodPanel.add(food35);
                mainFoodPanel.add(food36);
                mainFoodPanel.setPreferredSize(new Dimension(935 , 3300));
            }


        }else if(e.getSource() == saladBg){

            if(active6 == 0) {
                saladBg.setIcon(ctg2);
                active6 = 1;
                mainFoodPanel.remove(food1);
                mainFoodPanel.remove(food2);
                mainFoodPanel.remove(food3);
                mainFoodPanel.remove(food4);
                mainFoodPanel.remove(food5);
                mainFoodPanel.remove(food6);
                mainFoodPanel.remove(food7);
                mainFoodPanel.remove(food8);
                mainFoodPanel.remove(food9);
                mainFoodPanel.remove(food10);
                mainFoodPanel.remove(food11);
                mainFoodPanel.remove(food12);
                mainFoodPanel.remove(food13);
                mainFoodPanel.remove(food14);
                mainFoodPanel.remove(food15);
                mainFoodPanel.remove(food16);
                mainFoodPanel.remove(food17);
                mainFoodPanel.remove(food18);
                mainFoodPanel.remove(food19);
                mainFoodPanel.remove(food20);
                mainFoodPanel.remove(food21);
                mainFoodPanel.remove(food22);
                mainFoodPanel.remove(food23);
                mainFoodPanel.remove(food24);
                mainFoodPanel.remove(food25);
                mainFoodPanel.remove(food26);
                mainFoodPanel.remove(food27);
                mainFoodPanel.remove(food28);
                mainFoodPanel.remove(food29);
                mainFoodPanel.remove(food30);
                mainFoodPanel.remove(food31);
                mainFoodPanel.remove(food32);
                mainFoodPanel.remove(food33);
                mainFoodPanel.setPreferredSize(new Dimension(935 , 500));

            }else{
                saladBg.setIcon(ctg1);
                active6 = 0;
                mainFoodPanel.remove(food34);
                mainFoodPanel.remove(food35);
                mainFoodPanel.remove(food36);
                mainFoodPanel.add(food1);
                mainFoodPanel.add(food2);
                mainFoodPanel.add(food3);
                mainFoodPanel.add(food4);
                mainFoodPanel.add(food5);
                mainFoodPanel.add(food6);
                mainFoodPanel.add(food7);
                mainFoodPanel.add(food8);
                mainFoodPanel.add(food9);
                mainFoodPanel.add(food10);
                mainFoodPanel.add(food11);
                mainFoodPanel.add(food12);
                mainFoodPanel.add(food13);
                mainFoodPanel.add(food14);
                mainFoodPanel.add(food15);
                mainFoodPanel.add(food16);
                mainFoodPanel.add(food17);
                mainFoodPanel.add(food18);
                mainFoodPanel.add(food19);
                mainFoodPanel.add(food20);
                mainFoodPanel.add(food21);
                mainFoodPanel.add(food22);
                mainFoodPanel.add(food23);
                mainFoodPanel.add(food24);
                mainFoodPanel.add(food25);
                mainFoodPanel.add(food26);
                mainFoodPanel.add(food27);
                mainFoodPanel.add(food28);
                mainFoodPanel.add(food29);
                mainFoodPanel.add(food30);
                mainFoodPanel.add(food31);
                mainFoodPanel.add(food32);
                mainFoodPanel.add(food33);
                mainFoodPanel.add(food34);
                mainFoodPanel.add(food35);
                mainFoodPanel.add(food36);
                mainFoodPanel.setPreferredSize(new Dimension(935 , 3300));
            }

        }else if(e.getSource() == favorite1){
            if(likeActive1 == 0){
                favorite1.setIcon(like);
                likeActive1 =1;
                favoriteFood.favorite.add(food1);
            }else{
                favorite1.setIcon(unlike);
                likeActive1 = 0;
                favoriteFood.favorite.remove(food1);
            }
        }else if(e.getSource() == favorite2){
            if(likeActive2 == 0){
                favorite2.setIcon(like);
                likeActive2 =1;
                favoriteFood.favorite.add(food2);
            }else{
                favorite2.setIcon(unlike);
                likeActive2 = 0;
                favoriteFood.favorite.remove(food2);
            }
        }else if(e.getSource() == favorite3){
            if(likeActive3 == 0){
                favorite3.setIcon(like);
                likeActive3 =1;
                favoriteFood.favorite.add(food3);
            }else{
                favorite3.setIcon(unlike);
                likeActive3 = 0;
                favoriteFood.favorite.remove(food3);
            }
        }else if(e.getSource() == favorite4){
            if(likeActive4 == 0){
                favorite4.setIcon(like);
                likeActive4 =1;
                favoriteFood.favorite.add(food4);
            }else{
                favorite4.setIcon(unlike);
                likeActive4 = 0;
                favoriteFood.favorite.remove(food4);
            }
        }else if(e.getSource() == favorite5){
            if(likeActive5 == 0){
                favorite5.setIcon(like);
                likeActive5 =1;
                favoriteFood.favorite.add(food5);
            }else{
                favorite5.setIcon(unlike);
                likeActive5 = 0;
                favoriteFood.favorite.remove(food5);
            }
        }else if(e.getSource() == favorite6){
            if(likeActive6 == 0){
                favorite6.setIcon(like);
                likeActive6 =1;
                favoriteFood.favorite.add(food6);
            }else{
                favorite6.setIcon(unlike);
                likeActive6 = 0;
                favoriteFood.favorite.remove(food6);
            }

        }else if(e.getSource() == favorite7){
            if(likeActive7 == 0){
                favorite7.setIcon(like);
                likeActive7 =1;
                favoriteFood.favorite.add(food7);
            }else{
                favorite7.setIcon(unlike);
                likeActive7 = 0;
                favoriteFood.favorite.remove(food7);
            }

        }else if(e.getSource() == favorite8){
            if(likeActive8 == 0){
                favorite8.setIcon(like);
                likeActive8 =1;
                favoriteFood.favorite.add(food8);
            }else{
                favorite8.setIcon(unlike);
                likeActive8 = 0;
                favoriteFood.favorite.remove(food8);
            }
        }else if(e.getSource() == favorite9){
            if(likeActive9 == 0){
                favorite9.setIcon(like);
                likeActive9 =1;
                favoriteFood.favorite.add(food9);
            }else{
                favorite9.setIcon(unlike);
                favoriteFood.favorite.remove(food9);
                likeActive9 = 0;
            }
        }else if(e.getSource() == favorite10){
            if(likeActive10 == 0){
                favorite10.setIcon(like);
                likeActive10 =1;
                favoriteFood.favorite.add(food10);
            }else{
                favorite10.setIcon(unlike);
                likeActive10 = 0;
                favoriteFood.favorite.remove(food10);
            }
        }else if(e.getSource() == favorite11){
            if(likeActive11 == 0){
                favorite11.setIcon(like);
                likeActive11 =1;
                favoriteFood.favorite.add(food11);
            }else{
                favorite11.setIcon(unlike);
                likeActive11 = 0;
                favoriteFood.favorite.remove(food11);
            }
        }else if(e.getSource() == favorite12){
            if(likeActive12 == 0){
                favorite12.setIcon(like);
                likeActive12 =1;
                favoriteFood.favorite.add(food12);
            }else{
                favorite12.setIcon(unlike);
                likeActive12 = 0;
                favoriteFood.favorite.remove(food12);
            }
        }else if(e.getSource() == favorite13){
            if(likeActive13 == 0){
                favorite13.setIcon(like);
                likeActive13 =1;
                favoriteFood.favorite.add(food13);
            }else{
                favorite13.setIcon(unlike);
                likeActive13 = 0;
                favoriteFood.favorite.remove(food13);
            }
        }else if(e.getSource() == favorite14){
            if(likeActive14 == 0){
                favorite14.setIcon(like);
                likeActive14 =1;
                favoriteFood.favorite.add(food14);
            }else{
                favorite14.setIcon(unlike);
                likeActive14 = 0;
                favoriteFood.favorite.remove(food14);
            }
        }else if(e.getSource() == favorite15){
            if(likeActive15 == 0){
                favorite15.setIcon(like);
                likeActive15 =1;
                favoriteFood.favorite.add(food15);
            }else{
                favorite15.setIcon(unlike);
                likeActive15 = 0;
                favoriteFood.favorite.remove(food15);
            }
        }else if(e.getSource() == favorite16){
            if(likeActive16 == 0){
                favorite16.setIcon(like);
                likeActive16 =1;
                favoriteFood.favorite.add(food16);
            }else{
                favorite16.setIcon(unlike);
                likeActive16 = 0;
                favoriteFood.favorite.remove(food16);
            }
        }else if(e.getSource() == favorite17){
            if(likeActive17 == 0){
                favorite17.setIcon(like);
                likeActive17 =1;
                favoriteFood.favorite.add(food17);
            }else{
                favorite17.setIcon(unlike);
                likeActive17 = 0;
                favoriteFood.favorite.remove(food17);
            }
        }else if(e.getSource() == favorite18){
            if(likeActive18 == 0){
                favorite18.setIcon(like);
                likeActive18 =1;
                favoriteFood.favorite.add(food18);
            }else{
                favorite18.setIcon(unlike);
                likeActive18 = 0;
                favoriteFood.favorite.remove(food18);
            }
        }else if(e.getSource() == favorite19){
            if(likeActive19 == 0){
                favorite19.setIcon(like);
                likeActive19 =1;
                favoriteFood.favorite.add(food19);
            }else{
                favorite19.setIcon(unlike);
                likeActive10 = 0;
                favoriteFood.favorite.remove(food19);
            }
        }else if(e.getSource() == favorite20){
            if(likeActive20 == 0){
                favorite20.setIcon(like);
                likeActive20 =1;
                favoriteFood.favorite.add(food20);
            }else{
                favorite20.setIcon(unlike);
                likeActive20 = 0;
                favoriteFood.favorite.remove(food20);
            }
        }else if(e.getSource() == favorite21){
            if(likeActive21 == 0){
                favorite21.setIcon(like);
                likeActive21 =1;
                favoriteFood.favorite.add(food21);
            }else{
                favorite21.setIcon(unlike);
                likeActive21 = 0;
                favoriteFood.favorite.remove(food21);
            }
        }else if(e.getSource() == favorite22){
            if(likeActive22 == 0){
                favorite22.setIcon(like);
                likeActive22 =1;
                favoriteFood.favorite.add(food22);
            }else{
                favorite22.setIcon(unlike);
                likeActive22 = 0;
                favoriteFood.favorite.remove(food22);
            }
        }else if(e.getSource() == favorite23){
            if(likeActive23== 0){
                favorite23.setIcon(like);
                likeActive23 =1;
                favoriteFood.favorite.add(food23);
            }else{
                favorite23.setIcon(unlike);
                likeActive23 = 0;
                favoriteFood.favorite.remove(food23);
            }
        }else if(e.getSource() == favorite24){
            if(likeActive24 == 0){
                favorite24.setIcon(like);
                likeActive24 =1;
                favoriteFood.favorite.add(food24);
            }else{
                favorite24.setIcon(unlike);
                likeActive24 = 0;
                favoriteFood.favorite.remove(food24);
            }
        }else if(e.getSource() == favorite25){
            if(likeActive25 == 0){
                favorite25.setIcon(like);
                likeActive25 =1;
                favoriteFood.favorite.add(food25);
            }else{
                favorite25.setIcon(unlike);
                likeActive25 = 0;
                favoriteFood.favorite.remove(food25);
            }
        }else if(e.getSource() == favorite26){
            if(likeActive26 == 0){
                favorite26.setIcon(like);
                likeActive26 =1;
                favoriteFood.favorite.add(food26);
            }else{
                favorite26.setIcon(unlike);
                likeActive26 = 0;
                favoriteFood.favorite.remove(food26);
            }
        }else if(e.getSource() == favorite27){
            if(likeActive27 == 0){
                favorite27.setIcon(like);
                likeActive27 =1;
                favoriteFood.favorite.add(food27);
            }else{
                favorite27.setIcon(unlike);
                likeActive27 = 0;
                favoriteFood.favorite.remove(food27);
            }
        }else if(e.getSource() == favorite28){
            if(likeActive28 == 0){
                favorite28.setIcon(like);
                likeActive28 =1;
                favoriteFood.favorite.add(food28);
            }else{
                favorite28.setIcon(unlike);
                likeActive28 = 0;
                favoriteFood.favorite.remove(food28);
            }
        }else if(e.getSource() == favorite29){
            if(likeActive29 == 0){
                favorite29.setIcon(like);
                likeActive29 =1;
                favoriteFood.favorite.add(food29);
            }else{
                favorite29.setIcon(unlike);
                likeActive29 = 0;
                favoriteFood.favorite.remove(food29);
            }
        }else if(e.getSource() == favorite30){
            if(likeActive30 == 0){
                favorite30.setIcon(like);
                likeActive30 =1;
                favoriteFood.favorite.add(food30);
            }else{
                favorite30.setIcon(unlike);
                likeActive30 = 0;
                favoriteFood.favorite.remove(food30);
            }
        }else if(e.getSource() == favorite31){
            if(likeActive31 == 0){
                favorite31.setIcon(like);
                likeActive31 =1;
                favoriteFood.favorite.add(food31);
            }else{
                favorite31.setIcon(unlike);
                likeActive31 = 0;
                favoriteFood.favorite.remove(food31);
            }
        }else if(e.getSource() == favorite32){
            if(likeActive32 == 0){
                favorite32.setIcon(like);
                likeActive32 =1;
                favoriteFood.favorite.add(food32);
            }else{
                favorite32.setIcon(unlike);
                likeActive32 = 0;
                favoriteFood.favorite.remove(food32);
            }
        }else if(e.getSource() == favorite33){
            if(likeActive33 == 0){
                favorite33.setIcon(like);
                likeActive33 =1;
                favoriteFood.favorite.add(food33);
            }else{
                favorite33.setIcon(unlike);
                likeActive33 = 0;
                favoriteFood.favorite.remove(food33);
            }
        }else if(e.getSource() == favorite34){
            if(likeActive34 == 0){
                favorite34.setIcon(like);
                likeActive34 =1;
                favoriteFood.favorite.add(food34);
            }else{
                favorite34.setIcon(unlike);
                likeActive34 = 0;
                favoriteFood.favorite.remove(food34);
            }
        }else if(e.getSource() == favorite35){
            if(likeActive35 == 0){
                favorite35.setIcon(like);
                likeActive35 =1;
                favoriteFood.favorite.add(food35);
            }else{
                favorite35.setIcon(unlike);
                likeActive35 = 0;
                favoriteFood.favorite.remove(food35);
            }
        }else if(e.getSource() == favorite36){
            if(likeActive36 == 0){
                favorite36.setIcon(like);
                likeActive36 =1;
                favoriteFood.favorite.add(food36);
            }else{
                favorite36.setIcon(unlike);
                likeActive36 = 0;
                favoriteFood.favorite.remove(food36);
            }
        }else if(e.getSource() == cart1){
            if(loggedIn == 1) {
                if(availability.get(0) != 0) {
                    availability.set(0, availability.get(0) - 1);
                    cartPanel.add(cartItem(foodName.get(0), foodPrice.get(0), totalP));
                    cartIndex.add(foodName.get(0));
                    cartIndex1.add(0);
                    total += foodPrice.get(0);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart1.setIcon(unavailable);
                    cart1.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart2){
            if(loggedIn == 1) {
                if(availability.get(1) != 0) {
                    availability.set(1, availability.get(1) - 1);
                    cartPanel.add(cartItem(foodName.get(1), foodPrice.get(1), totalP));
                    cartIndex.add(foodName.get(1));
                    cartIndex1.add(1);
                    total += foodPrice.get(1);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart2.setIcon(unavailable);
                    cart2.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart3){
            if(loggedIn == 1) {
                if(availability.get(2) != 0) {
                    availability.set(2, availability.get(2) - 1);
                    cartPanel.add(cartItem(foodName.get(2), foodPrice.get(2), totalP));
                    cartIndex.add(foodName.get(2));
                    cartIndex1.add(2);
                    total += foodPrice.get(2);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart3.setIcon(unavailable);
                    cart3.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart4){
            if(loggedIn == 1) {
                if(availability.get(3) != 0) {
                    availability.set(3, availability.get(3) - 1);
                    cartPanel.add(cartItem(foodName.get(3), foodPrice.get(3), totalP));
                    cartIndex.add(foodName.get(3));
                    cartIndex1.add(3);
                    total += foodPrice.get(3);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart4.setIcon(unavailable);
                    cart4.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart5){
            if(loggedIn == 1) {
                if(availability.get(4) != 0) {
                    availability.set(4, availability.get(4) - 1);
                    cartPanel.add(cartItem(foodName.get(4), foodPrice.get(4), totalP));
                    cartIndex.add(foodName.get(4));
                    cartIndex1.add(4);
                    total += foodPrice.get(4);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart5.setIcon(unavailable);
                    cart5.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart6){
            if(loggedIn == 1) {
                if(availability.get(5) != 0) {
                    availability.set(5, availability.get(5) - 1);
                    cartPanel.add(cartItem(foodName.get(5), foodPrice.get(5), totalP));
                    cartIndex.add(foodName.get(5));
                    cartIndex1.add(5);
                    total += foodPrice.get(5);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart6.setIcon(unavailable);
                    cart6.setText("Unavailable");
                }
        }else{
            JOptionPane.showMessageDialog(null, "First You Must Login");
        }
        }else if(e.getSource() == cart7){
            if(loggedIn == 1) {
                if(availability.get(6) != 0) {
                    availability.set(6, availability.get(6) - 1);
                    cartPanel.add(cartItem(foodName.get(6), foodPrice.get(6), totalP));
                    cartIndex.add(foodName.get(6));
                    cartIndex1.add(6);
                    total += foodPrice.get(6);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart7.setIcon(unavailable);
                    cart7.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart8){
            if(loggedIn == 1) {
                if(availability.get(7) != 0) {
                    availability.set(7, availability.get(7) - 1);
                    cartPanel.add(cartItem(foodName.get(7), foodPrice.get(7), totalP));
                    cartIndex.add(foodName.get(7));
                    cartIndex1.add(7);
                    total += foodPrice.get(7);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart8.setIcon(unavailable);
                    cart8.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart9){
            if(loggedIn == 1) {
                if(availability.get(8) != 0) {
                    availability.set(8, availability.get(8) - 1);
                    cartPanel.add(cartItem(foodName.get(8), foodPrice.get(8), totalP));
                    cartIndex.add(foodName.get(8));
                    cartIndex1.add(8);
                    total += foodPrice.get(8);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart9.setIcon(unavailable);
                    cart9.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart10){
            if(loggedIn == 1) {
                if(availability.get(9) != 0) {
                    availability.set(9, availability.get(9) - 1);
                    cartPanel.add(cartItem(foodName.get(9), foodPrice.get(9), totalP));
                    cartIndex.add(foodName.get(9));
                    cartIndex1.add(9);
                    total += foodPrice.get(9);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart10.setIcon(unavailable);
                    cart10.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart11){
            if(loggedIn == 1) {
                if(availability.get(10) != 0) {
                    availability.set(10, availability.get(10) - 1);
                    cartPanel.add(cartItem(foodName.get(10), foodPrice.get(10), totalP));
                    cartIndex.add(foodName.get(10));
                    cartIndex1.add(10);
                    total += foodPrice.get(10);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart11.setIcon(unavailable);
                    cart11.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart12){
            if(loggedIn == 1) {
                if(availability.get(11) != 0) {
                    availability.set(11, availability.get(11) - 1);
                    cartPanel.add(cartItem(foodName.get(11), foodPrice.get(11), totalP));
                    cartIndex.add(foodName.get(11));
                    cartIndex1.add(11);
                    total += foodPrice.get(11);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart12.setIcon(unavailable);
                    cart12.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart13){
            if(loggedIn == 1) {
                if(availability.get(12) != 0) {
                    availability.set(12, availability.get(12) - 1);
                    cartPanel.add(cartItem(foodName.get(12), foodPrice.get(12), totalP));
                    cartIndex.add(foodName.get(12));
                    cartIndex1.add(12);
                    total += foodPrice.get(12);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart13.setIcon(unavailable);
                    cart13.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart14){
            if(loggedIn == 1) {
                if(availability.get(13) != 0) {
                    availability.set(13, availability.get(13) - 1);
                    cartPanel.add(cartItem(foodName.get(13), foodPrice.get(13), totalP));
                    cartIndex.add(foodName.get(13));
                    cartIndex1.add(13);
                    total += foodPrice.get(13);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart14.setIcon(unavailable);
                    cart14.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart15){
            if(loggedIn == 1) {
                if(availability.get(14) != 0) {
                    availability.set(14, availability.get(14) - 1);
                    cartPanel.add(cartItem(foodName.get(14), foodPrice.get(14), totalP));
                    cartIndex.add(foodName.get(14));
                    cartIndex1.add(14);
                    total += foodPrice.get(14);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart15.setIcon(unavailable);
                    cart15.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart16){
            if(loggedIn == 1) {
                if(availability.get(15) != 0) {
                    availability.set(15, availability.get(15) - 1);
                    cartPanel.add(cartItem(foodName.get(15), foodPrice.get(15), totalP));
                    cartIndex.add(foodName.get(15));
                    cartIndex1.add(15);
                    total += foodPrice.get(15);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart16.setIcon(unavailable);
                    cart16.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart17){
            if(loggedIn == 1) {
                if(availability.get(16) != 0) {
                    availability.set(16, availability.get(16) - 1);
                    cartPanel.add(cartItem(foodName.get(16), foodPrice.get(16), totalP));
                    cartIndex.add(foodName.get(16));
                    cartIndex1.add(16);
                    total += foodPrice.get(16);
                }else{
                    cart17.setIcon(unavailable);
                    cart17.setText("Unavailable");
                }
            totalP.setText("Total Price :      " + total+"$");
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart18){
            if(loggedIn == 1) {
                if(availability.get(17) != 0) {
                    availability.set(17, availability.get(17) - 1);
                    cartPanel.add(cartItem(foodName.get(17), foodPrice.get(17), totalP));
                    cartIndex.add(foodName.get(17));
                    cartIndex1.add(17);
                    total += foodPrice.get(17);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart18.setIcon(unavailable);
                    cart18.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart19){
            if(loggedIn == 1) {
                if(availability.get(18) != 0) {
                    availability.set(18, availability.get(18) - 1);
                    cartPanel.add(cartItem(foodName.get(18), foodPrice.get(18), totalP));
                    cartIndex.add(foodName.get(18));
                    cartIndex1.add(18);
                    total += foodPrice.get(18);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart19.setIcon(unavailable);
                    cart19.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart20){
            if(loggedIn == 1) {
                if(availability.get(19) != 0) {
                    availability.set(19, availability.get(19) - 1);
                    cartPanel.add(cartItem(foodName.get(19), foodPrice.get(19), totalP));
                    cartIndex.add(foodName.get(19));
                    cartIndex1.add(19);
                    total += foodPrice.get(19);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart20.setIcon(unavailable);
                    cart20.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart21){
            if(loggedIn == 1) {
                if(availability.get(20) != 0) {
                    availability.set(20, availability.get(20) - 1);
                    cartPanel.add(cartItem(foodName.get(20), foodPrice.get(20), totalP));
                    cartIndex.add(foodName.get(20));
                    cartIndex1.add(20);
                    total += foodPrice.get(20);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart21.setIcon(unavailable);
                    cart21.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart22){
            if(loggedIn == 1) {
                if(availability.get(21) != 0) {
                    availability.set(21, availability.get(21) - 1);
                    cartPanel.add(cartItem(foodName.get(21), foodPrice.get(21), totalP));
                    cartIndex.add(foodName.get(21));
                    cartIndex1.add(21);
                    total += foodPrice.get(21);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart22.setIcon(unavailable);
                    cart22.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart23){
            if(loggedIn == 1) {
                if(availability.get(22) != 0) {
                    availability.set(22, availability.get(22) - 1);
                    cartPanel.add(cartItem(foodName.get(22), foodPrice.get(22), totalP));
                    cartIndex.add(foodName.get(22));
                    cartIndex1.add(22);
                    total += foodPrice.get(22);

                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart23.setIcon(unavailable);
                    cart23.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart24){
            if(loggedIn == 1) {
                if(availability.get(23) != 0) {
                    availability.set(23, availability.get(23) - 1);
                    cartPanel.add(cartItem(foodName.get(23), foodPrice.get(23), totalP));
                    cartIndex.add(foodName.get(23));
                    cartIndex1.add(23);
                    total += foodPrice.get(23);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart24.setIcon(unavailable);
                    cart24.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart25){
            if(loggedIn == 1) {
                    if(availability.get(24) != 0) {
                        availability.set(24, availability.get(24) - 1);
                        cartPanel.add(cartItem(foodName.get(24), foodPrice.get(24), totalP));
                        cartIndex.add(foodName.get(24));
                        cartIndex1.add(24);
                        total += foodPrice.get(24);
                        totalP.setText("Total Price :      " + total + "$");
                    }else{
                        cart25.setIcon(unavailable);
                        cart25.setText("Unavailable");
                    }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart26){
            if(loggedIn == 1) {
                if(availability.get(25) != 0) {
                    availability.set(25, availability.get(25) - 1);
                    cartPanel.add(cartItem(foodName.get(25), foodPrice.get(25), totalP));
                    cartIndex.add(foodName.get(25));
                    cartIndex1.add(25);
                    total += foodPrice.get(25);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart26.setIcon(unavailable);
                    cart26.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart27){
            if(loggedIn == 1) {
                if(availability.get(26) != 0) {
                    availability.set(26, availability.get(26) - 1);
                    cartPanel.add(cartItem(foodName.get(26), foodPrice.get(26), totalP));
                    cartIndex.add(foodName.get(26));
                    cartIndex1.add(26);
                    total += foodPrice.get(26);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart27.setIcon(unavailable);
                    cart27.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart28){
            if(loggedIn == 1) {
                if(availability.get(27) != 0) {
                    availability.set(27, availability.get(27) - 1);
                    cartPanel.add(cartItem(foodName.get(27), foodPrice.get(27), totalP));
                    cartIndex.add(foodName.get(27));
                    cartIndex1.add(27);
                    total += foodPrice.get(27);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart28.setIcon(unavailable);
                    cart28.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart29){
            if(loggedIn == 1) {
                if(availability.get(28) != 0) {
                    availability.set(28, availability.get(28) - 1);
                    cartPanel.add(cartItem(foodName.get(28), foodPrice.get(28), totalP));
                    cartIndex.add(foodName.get(28));
                    cartIndex1.add(28);
                    total += foodPrice.get(28);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart29.setIcon(unavailable);
                    cart29.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart30){
            if(loggedIn == 1) {
                if(availability.get(29) != 0) {
                    availability.set(29, availability.get(29) - 1);
                    cartPanel.add(cartItem(foodName.get(29), foodPrice.get(29), totalP));
                    cartIndex.add(foodName.get(29));
                    cartIndex1.add(29);
                    total += foodPrice.get(29);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart30.setIcon(unavailable);
                    cart30.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart31){
            if(loggedIn == 1) {
                if(availability.get(30) != 0) {
                    availability.set(30, availability.get(30) - 1);
                    cartPanel.add(cartItem(foodName.get(30), foodPrice.get(30), totalP));
                    cartIndex.add(foodName.get(30));
                    cartIndex1.add(30);
                    total += foodPrice.get(30);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart31.setIcon(unavailable);
                    cart31.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart32){
            if(loggedIn == 1) {
                if(availability.get(31) != 0) {
                    availability.set(31, availability.get(31) - 1);
                    cartPanel.add(cartItem(foodName.get(31), foodPrice.get(31), totalP));
                    cartIndex.add(foodName.get(31));
                    cartIndex1.add(31);
                    total += foodPrice.get(31);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart32.setIcon(unavailable);
                    cart32.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart33){
            if(loggedIn == 1) {
                if(availability.get(32) != 0) {
                    availability.set(32, availability.get(32) - 1);
                    cartPanel.add(cartItem(foodName.get(32), foodPrice.get(32), totalP));
                    cartIndex.add(foodName.get(32));
                    cartIndex1.add(32);
                    total += foodPrice.get(32);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart33.setIcon(unavailable);
                    cart33.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart34){
            if(loggedIn == 1) {
                if(availability.get(33) != 0) {
                    availability.set(33, availability.get(33) - 1);
                    cartPanel.add(cartItem(foodName.get(33), foodPrice.get(33), totalP));
                    cartIndex.add(foodName.get(33));
                    cartIndex1.add(33);
                    total += foodPrice.get(33);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart34.setIcon(unavailable);
                    cart34.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart35){
            if(loggedIn == 1) {
                if(availability.get(34) != 0) {
                    availability.set(34, availability.get(34) - 1);
                    cartPanel.add(cartItem(foodName.get(34), foodPrice.get(34), totalP));
                    cartIndex.add(foodName.get(34));
                    cartIndex1.add(34);
                    total += foodPrice.get(34);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart35.setIcon(unavailable);
                    cart35.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
            }
        }else if(e.getSource() == cart36){
            if(loggedIn == 1) {
                if(availability.get(35) != 0) {
                    availability.set(35, availability.get(35) - 1);
                    cartPanel.add(cartItem(foodName.get(35), foodPrice.get(35), totalP));
                    cartIndex.add(foodName.get(35));
                    cartIndex1.add(35);
                    total += foodPrice.get(35);
                    totalP.setText("Total Price :      " + total + "$");
                }else{
                    cart36.setIcon(unavailable);
                    cart36.setText("Unavailable");
                }
            }else{
                JOptionPane.showMessageDialog(null, "First You Must Login");
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
        if(e.getSource() == pizzaBg){
            pizzaBg.setIcon(ctg2);
        }else if(e.getSource() == sandwichBg){
            sandwichBg.setIcon(ctg2);
        }else if(e.getSource() == burgerBg){
            burgerBg.setIcon(ctg2);
        }else if(e.getSource() == chickenBg){
            chickenBg.setIcon(ctg2);
        }else if(e.getSource() == drinkBg){
            drinkBg.setIcon(ctg2);
        }else if(e.getSource() == saladBg){
            saladBg.setIcon(ctg2);
        }else if(e.getSource() == img1){
            img1.setIcon(pepperoniB);
        }else if(e.getSource() == img2){
            img2.setIcon(pizzaMargheritaB);
        }else if(e.getSource() == img3){
            img3.setIcon(pizzaPhiladelphiaB);
        }else if(e.getSource() == img4){
            img4.setIcon(pizzaPestoB);
        }else if(e.getSource() == img5){
            img5.setIcon(pizzaVegetarianaB);
        }else if(e.getSource() == img6){
            img6.setIcon(pizzaChicagoB);
        }else if(e.getSource() == img7){
            img7.setIcon(pizzaMafiosaB);
        }else if(e.getSource() == img8){
            img8.setIcon(pizzaSpecialB);
        }else if(e.getSource() == img9){
            img9.setIcon(pizzaMixB);
        }else if(e.getSource() == img10){
            img10.setIcon(doubleBurgerB);
        }else if(e.getSource() == img11){
            img11.setIcon(zingerBurgerB);
        }else if(e.getSource() == img12){
            img12.setIcon(chickenGrillBurgerB);
        }else if(e.getSource() == img13){
            img13.setIcon(cheeseBurgerB);
        }else if(e.getSource() == img14){
            img14.setIcon(royalBurgerB);
        }else if(e.getSource() == img15){
            img15.setIcon(eggBurgerB);
        }else if(e.getSource() == img16){
            img16.setIcon(roastBeefB);
        }else if(e.getSource() == img17){
            img17.setIcon(supremeB);
        }else if(e.getSource() == img18){
            img18.setIcon(paniniB);
        }else if(e.getSource() == img19){
            img19.setIcon(hotdogB);
        }else if(e.getSource() == img20){
            img20.setIcon(gammonB);
        }else if(e.getSource() == img21){
            img21.setIcon(specialSandwichB);
        }else if(e.getSource() == img22){
            img22.setIcon(chickenB);
        }else if(e.getSource() == img23){
            img23.setIcon(kentuckyB);
        }else if(e.getSource() == img24){
            img24.setIcon(crispyB);
        }else if(e.getSource() == img25){
            img25.setIcon(familyBoxB);
        }else if(e.getSource() == img26){
            img26.setIcon(jFoodBoxB);
        }else if(e.getSource() == img27){
            img27.setIcon(waterB);
        }else if(e.getSource() == img28){
            img28.setIcon(cocaColaB);
        }else if(e.getSource() == img29){
            img29.setIcon(cocaColaZeroB);
        }else if(e.getSource() == img30){
            img30.setIcon(spriteB);
        }else if(e.getSource() == img31){
            img31.setIcon(doughB);
        }else if(e.getSource() == img32){
            img32.setIcon(mojitoB);
        }else if(e.getSource() == img33){
            img33.setIcon(redMojitoB);
        }else if(e.getSource() == img34){
            img34.setIcon(cesarB);
        }else if(e.getSource() == img35){
            img35.setIcon(chefsSaladB);
        }else if(e.getSource() == img36){
            img36.setIcon(italianSaladB);
        }
    }
    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == pizzaBg){
            if(active1 != 1)
            pizzaBg.setIcon(ctg1);
        }else if(e.getSource() == burgerBg){
            if(active2 != 1)
            burgerBg.setIcon(ctg1);
        }else if(e.getSource() == sandwichBg){
            if(active3 != 1)
                sandwichBg.setIcon(ctg1);
        }else if(e.getSource() == chickenBg){
            if(active4 != 1)
            chickenBg.setIcon(ctg1);
        }else if(e.getSource() == drinkBg){
            if(active5 != 1)
            drinkBg.setIcon(ctg1);
        }else if(e.getSource() == saladBg){
            if(active6 != 1)
            saladBg.setIcon(ctg1);
        }else if(e.getSource() == img1){
            img1.setIcon(pepperoni);
        }else if(e.getSource() == img2){
            img2.setIcon(pizzaMargherita);
        }else if(e.getSource() == img3){
            img3.setIcon(pizzaPhiladelphia);
        }else if(e.getSource() == img4){
            img4.setIcon(pizzaPesto);
        }else if(e.getSource() == img5){
            img5.setIcon(pizzaVegetariana);
        }else if(e.getSource() == img6){
            img6.setIcon(pizzaChicago);
        }else if(e.getSource() == img7){
            img7.setIcon(pizzaMafiosa);
        }else if(e.getSource() == img8){
            img8.setIcon(pizzaSpecial);
        }else if(e.getSource() == img9){
            img9.setIcon(pizzaMix);
        }else if(e.getSource() == img10){
            img10.setIcon(doubleBurger);
        }else if(e.getSource() == img11){
            img11.setIcon(zingerBurger);
        }else if(e.getSource() == img12){
            img12.setIcon(chickenGrillBurger);
        }else if(e.getSource() == img13){
            img13.setIcon(cheeseBurger);
        }else if(e.getSource() == img14){
            img14.setIcon(royalBurger);
        }else if(e.getSource() == img15){
            img15.setIcon(eggBurger);
        }else if(e.getSource() == img16){
            img16.setIcon(roastBeef);
        }else if(e.getSource() == img17){
            img17.setIcon(supreme);
        }else if(e.getSource() == img18){
            img18.setIcon(panini);
        }else if(e.getSource() == img19){
            img19.setIcon(hotdog);
        }else if(e.getSource() == img20){
            img20.setIcon(gammon);
        }else if(e.getSource() == img21){
            img21.setIcon(specialSandwich);
        }else if(e.getSource() == img22){
            img22.setIcon(chicken);
        }else if(e.getSource() == img23){
            img23.setIcon(kentucky);
        }else if(e.getSource() == img24){
            img24.setIcon(crispy);
        }else if(e.getSource() == img25){
            img25.setIcon(familyBox);
        }else if(e.getSource() == img26){
            img26.setIcon(jFoodBox);
        }else if(e.getSource() == img27){
            img27.setIcon(water);
        }else if(e.getSource() == img28){
            img28.setIcon(cocaCola);
        }else if(e.getSource() == img29){
            img29.setIcon(cocaColaZero);
        }else if(e.getSource() == img30){
            img30.setIcon(sprite);
        }else if(e.getSource() == img31){
            img31.setIcon(dough);
        }else if(e.getSource() == img32){
            img32.setIcon(mojito);
        }else if(e.getSource() == img33){
            img33.setIcon(redMojito);
        }else if(e.getSource() == img34){
            img34.setIcon(cesar);
        }else if(e.getSource() == img35){
            img35.setIcon(chefsSalad);
        }else if(e.getSource() == img36){
            img36.setIcon(italianSalad);
        }
    }
}
