package com.emisdep;

public class Tire {
    public int diameter;
    public int pressure;

    public Tire(int diameter, int pressure){
        this.diameter = diameter;
        this.pressure = pressure;
    }

    public boolean fill(){
        return true;
    }
}
