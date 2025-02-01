package org.lyuucik.cars;

import org.lyuucik.Car;

public class BMW extends Car {
    public BMW(String model, int year, String color, boolean isAutomatic, double engineVolume, int mileage) {
        super(model, year, color, isAutomatic, engineVolume, mileage);
    }

    @Override
    public void honk() {
        System.out.println("BMW honk: Vroom Vroom!");
    }
}
