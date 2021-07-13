package com.emisdep;

import java.util.List;

public class Car extends Vehicle{

    private List<Tire> tires;

    public Car(Engine engine, List<Passenger> passengers, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace) {
        super(engine, passengers, type, isLand, isWater, isAir, isSpace);
        this.tires = tires;
    }
}
