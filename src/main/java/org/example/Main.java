package org.example;

import org.example.conpany.Car;
import org.example.conpany.Ford;
import org.example.conpany.Holden;
import org.example.conpany.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Car car = new Car(8, "Base car");
        printResult(car);


        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        printResult(mitsubishi);

        Car ford = new Ford(6, "Ford Falcon");

       printResult(ford);

        Car holden = new Holden(6, "Holden Commodore");

        printResult(holden);
    }
    public static void printResult(Car car){
        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());
    }
}