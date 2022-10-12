package com.example.animal;

public class Eel extends Fish{

    private boolean releaseElectricCharge;

    public boolean isReleaseElectricCharge() {
        return releaseElectricCharge;
    }

    public void setReleaseElectricCharge(boolean releaseElectricCharge) {
        this.releaseElectricCharge = releaseElectricCharge;
    }


    public void showInfo(){
        System.out.println("Height: " + this.getHeight());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Animal Type: " + this.getAnimalType());
        System.out.println("Blood Type: " + this.getBloodType());
        System.out.println("Habitat: " + this.getHabitat());
        System.out.println("hasGrills: " + (this.getHasGrills() ? "Yes" : "No"));

    }
}
