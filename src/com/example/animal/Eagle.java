package com.example.animal;

public class Eagle extends Birds {


    public void showInfo() {
        System.out.println("Height: " + this.getHeight());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Animal Type: " + this.getAnimalType());
        System.out.println("Blood Type: " + this.getBloodType());
        System.out.println("Trait: " + this.getTrait());
        System.out.println("Ability: " + (this.isAbility() ? "Can fly" : "cannot fly"));
    }
}




