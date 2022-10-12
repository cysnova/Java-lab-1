package com.example.animal;

public class Main {

    public static void main(String[] args) {

        Reptile myReptile = new Reptile();

        Fish myFish = new Fish();
        myFish.setHabitat("Live in water");
        myFish.setHasGrills(true);
        System.out.println(myFish.getHabitat());
        System.out.println(myFish.getHasGrills());

        Eel myEel = new Eel();
        myEel.showInfo();

        Crocodile myCrocodile = new Crocodile();




        Birds myBird = new Birds();
//        myBird.showInfo
    }
}
