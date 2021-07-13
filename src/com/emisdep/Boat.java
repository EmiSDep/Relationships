package com.emisdep;

import java.util.List;

public class Boat extends Vehicle{

    public int maxLoad;

    public Boat(Engine engine,List<Passenger> passengers, int maxLoad, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace) {
        super(engine, passengers, type, isLand, isWater, isAir, isSpace);
        this.maxLoad = maxLoad;
    }
}
