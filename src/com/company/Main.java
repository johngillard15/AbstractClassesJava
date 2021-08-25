package com.company;

public class Main {

    public static void main(String[] args) {
        // Cat stuff
        /*Cat garfield = new HouseCat("Garfield", "Orange", 2_500, false, "Persian Tabby");

        garfield.displayWeightInPounds();
        garfield.meow();*/


        // Vehicle stuff
        Engine porsche918Engine = new HighPowerEngine("Porsche MR6 V8", 887);
        Vehicle porsche918 = new Supercar("Porsche 918 Spyder", "2015", porsche918Engine);

        System.out.println(porsche918);

        System.out.println("\nStarting engine...");
        porsche918.engine.start();
        System.out.printf("%s isOn: %b\n", porsche918.engine.name, porsche918.engine.getIsOn());

        System.out.println();
        porsche918.engine.rev();

        System.out.println();
        porsche918.roofAccessory();

        System.out.println("\nStopping engine...");
        porsche918.engine.stop();
        System.out.printf("%s isOn: %b\n", porsche918.engine.name, porsche918.engine.getIsOn());
    }
}
