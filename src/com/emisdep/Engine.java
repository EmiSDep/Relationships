package com.emisdep;

public class Engine {
    public String type;
    public boolean isOn;
    public int fuel;

    public Engine(String type, boolean isOn, int fuel){
        this.type = type;
        this.isOn = isOn;
        this.fuel = fuel;
    }

    public boolean turnOn(){
        return true;
    }

    public boolean turnOff(){
        return false;
    }
}

