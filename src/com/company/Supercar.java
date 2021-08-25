package com.company;

public class Supercar extends Vehicle {

    public Supercar(String name, String year, Engine engine) {
        super(name, year, engine);
    }

    public Supercar(String name, String year, Engine engine, int maxPassengers) {
        super(name, year, engine, maxPassengers);
    }

    @Override
    public void roofAccessory() {
        System.out.println("Removing targa top...");
    }
}
