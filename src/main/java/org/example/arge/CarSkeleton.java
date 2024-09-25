package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String startEngine(){
        System.out.println(getClass().getSimpleName());
        return getName()+" starting engine";
    }

    public String drive(){
        runEngine(this);
        return getName() +" is driving";
    }

    protected String runEngine(CarSkeleton carSkeleton){
        return
    }



}
