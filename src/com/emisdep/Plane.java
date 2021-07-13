package com.emisdep;

import java.util.List;

public class Plane extends Vehicle{

    public List<Tire> tires;
    public boolean isLanding;


    public Plane(Engine engine, List<Passenger> passengers, String type, boolean isLand, boolean isWater, boolean isAir, boolean isSpace) {
        super(engine, passengers, type, isLand, isWater, isAir, isSpace);
        this.isLanding = isLanding;
    }

    public boolean toggleLanding(){
        return true;
    }
}

