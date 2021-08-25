package com.company;

public abstract class Cat {
    private String name;
    private String color;
    private int weightInGrams;
    private boolean isNeutered;
    private String species;

    public Cat(String name, String color, int weightInGrams, boolean isNeutered, String species){
        this.name = name;
        this.color = name;
        this.weightInGrams = weightInGrams;
        this.isNeutered = isNeutered;
        this.species = species;
    }

    public void displayWeightInPounds(){
        int weightInOunces = weightInGrams / 28;
        int weightInPounds = weightInOunces / 16;

        System.out.printf("%s weight in pounds: %d lbs", name, weightInPounds);
    }

    public void neuterPet(){
        System.out.println("Bob Barker is happy.");
        isNeutered = true;
    }

    public abstract void meow();
}
