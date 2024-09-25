package org.example.conpany;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getName() + " engine is starting";
    }

    @Override
    public String accelerate() {
        return getName() + " is accelerating";
    }

    @Override
    public String brake() {
        return getName()+ " is braking";
    }
}