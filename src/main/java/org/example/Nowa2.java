package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Nowa2 {

    public static void main(String[] args) {

        List<Car> cars = List.of(new Car("Tesla", "X", "V6E4R7", 2024, true),
                new SportsCar("BMW", "A4", "SZY6738", 2012, false, 350),
                new ElectricCar("Honda", "Y", "HU8394", 2015, true, 0.7),
                new ElectricCar("Tesla", "Y", "Y6G5R7", 2020, true, 0.3),
                new ElectricCar("Toyota", "E", "J7D5G", 2018, true, 0.4),
                new Car("Ford", "Tremor", "FH5384", 2020, true),
                new SportsCar("Audi", "Q5", "GE4729", 2019, true, 300));

        Car car1 = findWithSpeedAtLeast(cars, 300);
        System.out.println("Samochod z szybkoscia minimum 300km/h: " + car1.brand);

        findUncharged(cars, 0.6).forEach(car -> System.out.println("Samochod z bateria ponizej 60%: " + car.brand));

        List<Car> fastCar = findWithSpeedAtLeastWithLoop(cars, 300);
        for(Car car : fastCar) {
            System.out.println("Samochod z szybkoscia minimum 300km/h wyszukany przez petle: " + car.brand);
        }
        List<Car> lowBatteryCar = findUnchargedWithLoop(cars, 0.6);
        for (Car car : lowBatteryCar) {
            System.out.println("Samochody z bateria ponizej 60% wyszukane przez petle: " + car.brand);
        }


    }

    public static Car findWithSpeedAtLeast(List<Car> cars, int maxSpeed) {

        return  cars.stream()
                .filter(car -> car instanceof SportsCar)
                .map(car -> (SportsCar)car) //rzutowanie
                .filter(car -> car.maxSpeed >= maxSpeed)
                .filter(car -> car.isAvailable = true)
                .findFirst().get();

    }
    public static List<Car> findUncharged(List<Car> cars, double batteryLevel) {
        return cars.stream()
                .filter(car -> car instanceof ElectricCar)
                .map(car -> (ElectricCar)car)
                .filter(car -> car.batteryLevel < batteryLevel)
                .collect(Collectors.toList());
    }

    public static List<Car> findWithSpeedAtLeastWithLoop(List<Car> cars, int maxSpeed) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car instanceof SportsCar) {
                SportsCar sportsCar = (SportsCar) car;
                if (sportsCar.maxSpeed > maxSpeed && sportsCar.isAvailable)
                    result.add(sportsCar);
            }
        } return result;
    }

    public static List<Car> findUnchargedWithLoop(List<Car> cars, double batteryLevel) {
        List<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car instanceof ElectricCar) {
                ElectricCar electricCar = (ElectricCar) car;
                if (electricCar.batteryLevel < batteryLevel)
                    result.add(electricCar);
            }
        } return result;
    }


    //Napisz metodę findUncharged, która wyszuka w bazie
    // dostępne samochody, które mają poziom baterii poniżej 60%.
    //zapisac w postaci petli tez
}
