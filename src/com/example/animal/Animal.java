package com.example.animal;

public class Animal {
//Attributes, properties, fields
    private double height;
    private double weight;
    private String animalType;
    private String bloodType;

    //constructor

    public Animal(){
        this.height =0;
        this.weight =0;
        this.animalType = "Unknown";
        this.bloodType = "Unknown";
    }
//parameterized constructor
    public Animal (int height, int weight, String animalType, String bloodType){
        this.height = height;
        this.weight = weight;
        this.animalType = animalType;
        this.bloodType = bloodType;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }



}
