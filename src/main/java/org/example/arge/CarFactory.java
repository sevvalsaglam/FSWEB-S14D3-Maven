package org.example.arge;

public class CarFactory {


    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("tesla", "tesla desc", 700, 2000);
        CarSkeleton hybridCar = new HybridCar("mercedes", "mersonun cantları beş kol", 800, 2100, 4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("tofaş", "tofaşk", 900, 6);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPoweredCar);

    }
    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }
}
