package org.example;

import java.util.List;

public class Nowa2 {

    public static void main(String[] args) {

        List<Car> cars = List.of(new Car("Tesla", "X", "V6E4R7", 2024, true),
                new SportsCar("BMW", "A4", "SZY6738", 2012, false, 350),
                new ElectricCar("Honda", "Y", "HU8394", 2015, true, 0.7),
                new ElectricCar("Tesla", "Y", "Y6G5R7", 2020, true, 0.3),
                new Car("Ford", "Tremor", "FH5384", 2020, true),
                new SportsCar("Audi", "Q5", "GE4729", 2019, true, 300));

        Car car = findWithSpeedAtLeast(cars, 300);
        System.out.println(car.brand);

        Car car1 = findUncharged(cars, 0.6);
        System.out.println(car1.brand);

        Car fastCar = findWithSpeedAtLeastWithLoop(cars, 300);
        System.out.println(fastCar.brand);

        Car lowBatteryCar = findUnchargedWithLoop(cars, 0.6);
        System.out.println(lowBatteryCar.brand);

    }

    public static Car findWithSpeedAtLeast(List<Car> cars, int maxSpeed) {

        return  cars.stream()
                .filter(car -> car instanceof SportsCar)
                .map(car -> (SportsCar)car) //rzutowanie
                .filter(car -> car.maxSpeed >= maxSpeed)
                .filter(car -> car.isAvailable = true)
                .findFirst().get();

    }
    public static Car findUncharged(List<Car> cars, double batteryLevel) {
        return cars.stream()
                .filter(car -> car instanceof ElectricCar)
                .map(car -> (ElectricCar)car)
                .filter(car -> car.batteryLevel < batteryLevel)
                .filter(car -> car.isAvailable = true)
                .findFirst().get();
    }

    public static Car findWithSpeedAtLeastWithLoop(List<Car> cars, int maxSpeed) {
        for (Car car : cars) {
            if (car instanceof SportsCar) {
                SportsCar sportsCar = (SportsCar) car;
                if (sportsCar.maxSpeed > maxSpeed && sportsCar.isAvailable)
                    return sportsCar;
            }
        } return null;
    }

    public static Car findUnchargedWithLoop(List<Car> cars, double batteryLevel) {
        for (Car car : cars) {
            if (car instanceof ElectricCar) {
                ElectricCar electricCar = (ElectricCar) car;
                if (electricCar.batteryLevel < batteryLevel && electricCar.isAvailable)
                    return electricCar;
            }
        } return null;
    }


    //Napisz metodę findUncharged, która wyszuka w bazie
    // dostępne samochody, które mają poziom baterii poniżej 60%.
    //zapisac w postaci petli tez
}
