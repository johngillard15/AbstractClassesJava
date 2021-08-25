package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    public String name;
    public String year;
    public Engine engine;
    private final List<String> passengers = new ArrayList<>();
    private int maxPassengers;

    public Vehicle(String name, String year, Engine engine){
        this.name = name;
        this.year = year;
        this.engine = engine;
        maxPassengers = 4;
    }

    public Vehicle(String name, String year, Engine engine, int maxPassengers){
        this.maxPassengers = maxPassengers;
    }

    public void addPassenger(String name){
        passengers.add(name);
    }

    public void removePassenger(String name){
        passengers.remove(name);
    }

    public void removePassenger(int index){
        passengers.remove(index);
    }

    public abstract void roofAccessory();

    @Override
    public String toString() {
        return String.format("Name: %s\nYear: %s\nEngine: [%s]",
                name, year, engine);
    }
}
