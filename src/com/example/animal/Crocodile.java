package com.example.animal;

public class Crocodile extends Reptile{

    public String getEggType(){
    return "Soft-shelled eggs";
    }


    public void showInfo(){
        System.out.println("Height: " + this.getHeight());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Animal Type: " + this.getAnimalType());
        System.out.println("Blood Type: " + this.getBloodType());
        System.out.println("Skin Type: " + this.getSkinType());
        System.out.println("Bone: " + this.getBone());

    }
}

