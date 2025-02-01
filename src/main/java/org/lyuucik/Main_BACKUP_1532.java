package org.lyuucik;

import org.lyuucik.cars.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
<<<<<<< HEAD
    // it's hotfix origin
=======
    // it's Main origin
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Suzuki("Swift", 2010, "Red", true, 1.2, 50000));
        cars.add(new Toyota("Corolla", 2005, "Green", false, 1.6, 80000));
        cars.add(new BMW("X5", 2020, "Black", true, 3.0, 20000));
        cars.add(new Audi("A4", 2015, "Blue", true, 2.0, 40000));
        cars.add(new Ford("Focus", 2008, "Green", false, 1.8, 60000));
        cars.add(new Suzuki("Vitara", 2018, "White", true, 1.4, 30000));
        cars.add(new Toyota("Camry", 2012, "Silver", true, 2.5, 70000));
        cars.add(new BMW("M3", 2021, "Red", true, 3.0, 10000));
        cars.add(new Audi("Q7", 2019, "Gray", true, 3.0, 25000));
        cars.add(new Ford("Mustang", 2022, "Yellow", true, 5.0, 5000));

        printCarsAfter2006(cars);
        changeGreenCarsToRed(cars);
        printCarsWithHighMileage(cars);
        pressToHonk(cars);
    }

    public static void printCarsAfter2006(List<Car> cars) {
        System.out.println("Cars produced after 2006:");
        cars.forEach(car -> {
            if (car.getYear() > 2006) {
                System.out.println(car.getFullInfo());
            } else {
                System.out.println("Outdated car");
            }
        });
    }

    public static void changeGreenCarsToRed(List<Car> cars) {
        cars.stream()
                .filter(car -> car.getColor().equalsIgnoreCase("green"))
                .forEach(car -> car.setColor("red"));
    }

    public static void printCarsWithHighMileage(List<Car> cars) {
        System.out.println("Cars with mileage over 50000 km:");
        cars.forEach(car -> {
            if(car.getMileage() > 50000)
                System.out.println(car.getFullInfo());
        });
    }

    public static void pressToHonk(List<Car> cars) {
       cars.forEach(Car::honk);
    }
>>>>>>> develop
}
