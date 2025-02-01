package org.lyuucik.cars;

import org.lyuucik.Car;

public class Suzuki extends Car {
    public Suzuki(String model, int year, String color, boolean isAutomatic, double engineVolume, int mileage) {
        super(model, year, color, isAutomatic, engineVolume, mileage);
    }

    @Override
    public void honk() {
        System.out.println("Suzuki honk: Beep Beep!");
    }
}
