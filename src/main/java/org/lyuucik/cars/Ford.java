package org.lyuucik.cars;

import org.lyuucik.Car;

public class Ford extends Car {
    public Ford(String model, int year, String color, boolean isAutomatic, double engineVolume, int mileage) {
        super(model, year, color, isAutomatic, engineVolume, mileage);
    }

    @Override
    public void honk() {
        System.out.println("Ford honk: Honk Honk!");
    }
}
