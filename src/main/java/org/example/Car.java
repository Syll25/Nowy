package org.example;

public class Car {
    public String brand;
    public String model;
    public String licensePlate;
    public int year;
    public boolean isAvailable;

    public void rentCar() {
        isAvailable = false;
    }
    public void returnCar() {
        isAvailable = true;
    }

    public Car(String brand, String model, String licensePlate, int year, boolean isAvailable) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.year = year;
        this.isAvailable = isAvailable;
    }
}
