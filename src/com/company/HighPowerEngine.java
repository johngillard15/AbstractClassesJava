package com.company;

public class HighPowerEngine extends Engine {

    public HighPowerEngine(String name, int horsePower) {
        super(name, horsePower);
    }

    @Override
    public void rev(){
        System.out.println("Vrrrroooooom!");
    }
}
