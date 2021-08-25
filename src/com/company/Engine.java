package com.company;

public abstract class Engine {
    public final String name;
    public final int horsePower;
    private boolean isOn = false;

    public Engine(String name, int horsePower){
        this.name = name;
        this.horsePower = horsePower;
    }

    public void start(){
        isOn = true;
    }

    public void stop(){
        isOn = false;
    }

    public boolean getIsOn(){
        return isOn;
    }

    public abstract void rev();

    @Override
    public String toString() {
        return String.format("Name: %s, Horsepower: %s",
                name, horsePower);
    }
}
