import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;


public class Main {
/*
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter a number : ");
                int num = scanner.nextInt();
                System.out.println("You entered: " + num);

                for(int i = num; i > 0; i--) {
                    System.out.println("@".repeat(i));
*/


//        int age = 10, count = 0, countOfStudents = 10;
//        // integers for the above, don't have to put int before 'count' or 'countOfStudents
//        int sum = 5 + 10;
//        int multiplication = 2 * 10;
//        int total = sum + multiplication;
//
//        float age1 = 23.1f;
//        double age2 = 43.2d;
//        System.out.println("age1 " + age1);
//
//        age = 5;
//        System.out.println(age);
//        System.out.println(count);
//        System.out.println(countOfStudents);
//        System.out.println(sum);
//        System.out.println(multiplication);
//        System.out.println(total);

//=============================================================================================

    //youtube lesson

        /*System.out.print("I love pizza!\n");
//        \ = escape \n = next line
        System.out.println("It is yummy!\n");
//        println + \n = additional empty line
        System.out.println("It is delicious!");
        System.out.println("\tIt is incredibly delicious!");
//        \t = tab
        System.out.println("\"I like eating sushi too!\"");
//        to put "", need to add \"
        System.out.println("\\I like eating sushi too!\\");
//        to put a \, need to add double \\, because one \ = escape;

        int x; //declaration
        x = 123; //assignment
        System.out.println(x);

        int y = 123; //initialization
        System.out.println("My number is : " + x);

       long z = 1498294044575675L; //use for large number
        System.out.println(z);

        float a = 3.1456546465f; //only 7 decimal places
        System.out.println(a);

        double b = 3.14458782949289346; //only 16 decimal places
        System.out.println(b);

        boolean c = true;
        System.out.println(c);

        char symbol = '@'; // character use single quote
        System.out.println(symbol);

        String firstName  = "Nova"; //string is a reference type, need to use capitalisation for String
        System.out.println(firstName);
        System.out.println("My name is  " +firstName +"!");
//==========================================================================================
        //to switch variables using temp

        String d = "water";
        String e = "orange juice";
        String temp; //null = without any values
        temp = d;
        d = e;
        e = temp;

        System.out.println(d);
        System.out.println(e);
        *//*switching two variables d & e with temp ,
        pouring water(d) into temp, pour OJ (e) into the glass who was filled with water (d)
        in the end, put the temp(water) to the glass who was filled with oj (e)*//*

//        ===============================================================
     //scanner -Reading User Input
        Scanner scanner = new Scanner (System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();

//        scanner.nextLine(); after nextInt, we need to add this, so all questions could print out

        System.out.println("What is your favourite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " +name);
        System.out.println("I am " +age+ " years old.");
        System.out.println("My favourite food is " +food+ ".");*/
//    =====================================================================
    //integers

//      int friends = 10;

//      friends = friends + 1;

//        friends++; //short cut
//        friends--;
//        System.out.println(friends);
//
//        double enemies = 20; //for decimal places
//        enemies = enemies / 3;
//        System.out.println(enemies);
////=====================================================================
//        //GUI
///*
//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null,"Hello " +name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null,"You are " +age+ " years old.");
//
//        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
//        JOptionPane.showMessageDialog(null,"You are " +height+ " cm.");*/
//
////        ================================================
//      //Maths
///*
//       double x = 9;
//       double y = -10;
//
//       double z = Math.max(x, y); //find the max number
//      System.out.println(z);
//
//      double a = Math.abs(y); //find the absolute value -means to remove any negative sign in front of a number
//      System.out.println(a);
//
//      double b = Math.sqrt(x); //square root function
//      System.out.println(b);
//
//      double c = 3.1543;
//      double d = Math.round(c); //round up the number
//      System.out.println(d);
//
//      //Math.ceil - go to 126, Math.floor - go to 125
//      System.out.println(Math.ceil(125.9));
//      System.out.println(Math.floor(125.9));*/
//
//      //find the hypotenuse
//
////      double x;
////      double y;
////      double z; //hypotenuse
////
////      Scanner scanner = new Scanner(System.in);
////
////      System.out.print("Enter side x : "); //if you want the value show in one line, use print, not println
////      x = scanner.nextDouble(); //nextDouble means decimal place, without decimal = nextInt
////      System.out.print("Enter side y : ");
////      y = scanner.nextDouble();
////
////      z= Math.sqrt((x*x) + (y*y));
////
////      System.out.print("The hypotenuse is :" +z);
//
////      ===============================================================================
//        // to get a random number
//   /*  Random random = new Random();
//
//      int x = random.nextInt();//this will generate a big number
//      System.out.println(x);
//
//      int y = random.nextInt(6); // to put an integer inside, this will generate 0-5
//      System.out.println(y);
//
//      int z = random.nextInt(6)+1; // +1, will skip zero, cause it starts from 1, so 1-6
//      System.out.println(z);
//
//      double a = random.nextDouble();
//      System.out.println(a);
//
//      boolean b = random.nextBoolean();
//      System.out.println(b);*/
//
////      =======================================================
//     //If statement = performs a block of code if its condition evaluates to be true
//
//        /*int age = 12;
//
//        if(age>=60) {
//            System.out.println("You are an elderly.");
//        }
//        else if(age>=18){
//            System.out.println("You are an adult.");
//        }else if(age>=13){
//            System.out.println("You are a teenager.");
//        }
//        else {
//            System.out.println("You are a kid.");
//        }*/
////        =========================================
//        // A switch statement allows a variable to be tested for equality against a list of values.
//
//        String day = "Tuesday";
//
//        /*switch(day){
//            case "Sunday": System.out.println("It is Sunday!");
//            break;
//            case "Monday": System.out.println("It is Monday!");
//            break;
//            case "Tuesday": System.out.println("It is Tuesday!");
//            break;
//            case "Wednesday": System.out.println("It is Wednesday!");
//            break;
//            case "Thursday": System.out.println("It is Thursday!");
//            break;
//            case "Friday": System.out.println("It is Friday!");
//            break;
//            case "Saturday": System.out.println("It is Saturday!");
//            break;
//        }*/
//
//        //logical operators = used to connect two or more expressions
//
///*
//        int temp = 35;
//
//        if(temp>25) {*/
///**//*
//
//            System.out.println("It is warm!");
//        }
//            else if (temp>=15 && temp<=25 ) {  //for &&, both conditions have to be true
//            System.out.println("It is comfortable!");
//        } else {
//            System.out.println("It is cold.");
//        }
//        //|| OR, one of the conditions has to be true
////*/     Scanner scanner = new Scanner(System.in);
//       /* System.out.println("You are playing the game, press q or Q to quit");
//        String response = scanner.next();
//
//        if(response.equals("q")|| response.equals("Q")) {
//            System.out.println("You quit the game!");
//        } else {
//            System.out.println("You are still playing the game!");
//        }*/
//
//       // ! = (Not)
//        //!(x && y) is same as !x || !y
//        //!(x || y) is same as !x && !y
//
//        System.out.println("You are playing the game, press q or Q to quit");
//        String response = scanner.next();
//
//        if (!response.equals("Q") && !response.equals("q")){
//                System.out.println("You are still playing the game!");
//            } else {
//                System.out.println("You quit the game!");
//            }

}