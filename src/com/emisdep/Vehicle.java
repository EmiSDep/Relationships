package com.emisdep;

import java.util.List;

public class Vehicle {
    public String type;
    public boolean isLand;
    public boolean isWater;
    public boolean isAir;
    public boolean isSpace;
    public Engine engine;
    public List<Passenger> passengers;
    public int maxPassengers;

    public Vehicle(Engine engine, List<Passenger> passengers, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace){
    this.type = type;
    this.isLand = isLand;
    this.isWater = isWater;
    this.isAir = isAir;
    this.isSpace = isSpace;
    }

    public boolean turnOn(){
        return true;
    }

    public boolean turnOff(){
        return false;
    }

    public void addPassenger(Passenger name){
        passengers.add(name);
    }

    public void removePassenger(Passenger name){
        passengers.remove(name);
    }
}
