package org.example;

public class SportsCar extends Car{

    public int maxSpeed;


    public SportsCar(String brand, String model, String licensePlate, int year, boolean isAvailable, int maxSpeed) {
        super(brand, model, licensePlate, year, isAvailable);
        this.maxSpeed = maxSpeed;
    }
}
