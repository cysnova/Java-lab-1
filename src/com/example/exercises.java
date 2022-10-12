package com.example;

import java.util.*;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

public class exercises {
    public static void main(String[] args) {
//        int a = 15;
//        int b = 25;
//        if (( a < b) || ( a = 5 ) > 15) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);


//        Scanner scanner = new Scanner(System.in);

//    String name = "";
//    while(name.isBlank()) {
//        System.out.print("Enter your name: ");
//        name = scanner.nextLine();
//    }
//        System.out.println("Hello" + name);
// --------------------------------------------------------
//    String str = " I love Hong Kong!";
//     char word = str.charAt(4);
//     char word1 = str.charAt(5);
//        System.out.println( word + word1); // will give out a number (Adding the ascii value)
//        System.out.println("" + word + word1); // will give out the concatenation of two letters)
//        System.out.println("The word is : " + word + word1); // will do the same as above*/

        //substring
//      String word2 = "GummyBear";
//      String partOfTheWord = word2.substring(0,5); //print out Gummy, 0-4
//        System.out.println(partOfTheWord);
//      String partOfTheWord2 = word2.substring(6);//not ending index , will assume the last one is the ending
//        System.out.println(partOfTheWord2);

        //print formatting
//        double num = 10.1254;
//        System.out.printf("%f%n",num); //if no precision is given, default to 6 decimal places = 10.123400
//        System.out.printf("%.2f%n",num);//remember to add . And it will round up

//while loop = executes a block of code as long as the condition remains true

//        Scanner scanner = new Scanner(System.in);
//    String name = "";
//
//    while(name.isBlank()) { //if the condition is true(blank), it will ask you enter your name
//        System.out.print("Enter your name : ");
//        name = scanner.nextLine();
//    }
//    System.out.println("Hello " + name);
//      //if you have typed your name(not blank/ the condition is false, then the console will appear Hello plus your name//

        //for loop = executes a block of code in a limited times.
//        int i;
//        for (i = 10; i >= 0; i-=2) {
//            System.out.println(i);
//        }
//        System.out.println("Happy New Year");

        Scanner scanner = new Scanner(System.in);

//using arrays
/*
        String[] cars = {"Benz", "Audi", "BMW"};

        cars[0] = "Tesla";

        System.out.println(cars[0]);*/

//        String[] cars = new String[3];
//
//        cars[0] = "Tesla";
//        cars[1] = "BMW";
//        cars[2] = "Benz";
//
//        for(int i=0; i<cars.length; i++){
//            System.out.print(cars[i] + " ");

        //2D array
//        String[][]cars = new String[3][3]; //three rows + three columns
//        cars[0][0] = "BMW";
//        cars[0][1] = "Benz";
//        cars[0][2] = "Tesla";
//
//        cars[1][0] = "Mustang";
//        cars[1][1] = "MiniCooper";
//        cars[1][2] = "Ranger";
//
//        cars[2][0] = "Lambo";
//        cars[2][1] = "Ferrari";
//        cars[2][2] = "Kia";
//
//        for(int i=0; i<cars.length; i++){
//            System.out.println();
//            for(int j=0; j<cars[i].length; j++ )
//                System.out.print(cars[i][j] + " ");

//        }
        //array list<>- store reference type like string, if you want to add primitive values(use wrapper class0

//        ArrayList<String> food = new ArrayList<String>();
//
//        food.add("pizza");
//        food.add("hamburger");
//        food.add("hotdog");
//
//        food.set(0,"sushi"); //replace the string
//        food.remove(1); //remove the string
//        food.clear(); //remove everything
//
//        for(int i=0; i<food.size(); i++){  //.size means length
//            System.out.println(food.get(i)); //get=return

        //2D ArrayList
//
//        ArrayList< ArrayList<String>> groceryList = new ArrayList();
//
//        ArrayList<String> bakeryList = new ArrayList();
//        bakeryList.add("bread");
//        bakeryList.add("egg tart");
//        bakeryList.add("donut");
//
//        ArrayList<String>produceList = new ArrayList();
//        produceList.add("sugar");
//        produceList.add("salt");
//        produceList.add("pepper");
//
//        ArrayList<String>drinkList = new ArrayList();
//        drinkList.add("coffee");
//        drinkList.add("soda");
//
//
//        groceryList.add(bakeryList);
//        groceryList.add(produceList);
//        groceryList.add(drinkList);
//
//        System.out.println(groceryList.get(0).get(1));
//   for each
//        String[]animals = {"cat","dog","bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("bird");

        /*for (String i: animals){ //: = in
            System.out.println(i);*/

        //method

        int x = 3;
        int y = 4;
        System.out.println(add(x, y));
    }

    static int add(int x, int y) {    //void=not return any values, if we want to return int, put int

        return x + y;
    }
}








