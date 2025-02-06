package org.example;

public class ElectricCar extends Car{

    public double batteryLevel;


    public ElectricCar(String brand, String model, String licensePlate, int year, boolean isAvailable, double batteryLevel) {
        super(brand, model, licensePlate, year, isAvailable);
        this.batteryLevel = batteryLevel;
    }
}
