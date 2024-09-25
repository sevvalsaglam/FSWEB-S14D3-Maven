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

    protected void runEngine(CarSkeleton carSkeleton){
        if(carSkeleton instanceof ElectricCar ){
            double avgKmPerCharge = ((ElectricCar)carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar)carSkeleton).getBatterySize();
            System.out.println("The car engine is starting with electric.Per charge: "+ avgKmPerCharge+ " Battery charge: " +batterySize);
        }else if(carSkeleton instanceof GasPoweredCar gasPoweredCar){
            System.out.println("The car engine is starting with gas.Per charge: "+ gasPoweredCar.getAvgKmPerLiter());
        }else if(carSkeleton instanceof HybridCar hybridCar){
            System.out.println("The car engine is starting with hybrid.Per charge: "+ hybridCar.getAvgKmPerLiter()+ " Battery charge: " +hybridCar.getBatterySize());
        }else{
            System.out.println("invalid car type!");
        }
    }



}
