package com.example.animal;

public class Birds extends Animal{

    private String trait;
    private boolean ability;

    //default constructor

    public Birds(){
        super();
        //height,weight,animalType,bloodType
        this.trait = "Unknown";
        this.ability = false;

    }

    public Birds(int height, int weight, String animalType,
                 super(height, weight, animalType, bloodType);
    this.trait = trait;
    this.ability = ability;
    public String getTrait() {
        return trait;
    }

    public void setTrait(String trait) {
        this.trait = trait;
    }

    public boolean isAbility() {
        return ability;
    }

    public void setAbility(boolean ability) {
        this.ability = ability;
    }




}
