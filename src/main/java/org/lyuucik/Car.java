package org.lyuucik;

public abstract class Car {
    private String model;
    private int year;
    private String color;
    private boolean isAutomatic;
    private double engineVolume;
    private int mileage;

    public Car(String model, int year, String color, boolean isAutomatic, double engineVolume, int mileage) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.engineVolume = engineVolume;
        this.mileage = mileage;
    }

    public String getFullInfo() {
        return "Model: " + model + ", Year: " + year + ", Color: " + color +
                ", Transmission: " + (isAutomatic ? "Automatic" : "Manual") +
                ", Engine Volume: " + engineVolume + "L, Mileage: " + mileage + "km";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public abstract void honk();
}