package org.tasks.Object;

public class Car {
    String brand;
    int speed;

    public Car(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    public void accelerate(int value) {
        speed += value;
    }

    public void printSpeed() {
        System.out.println(brand + " current speed: " + speed + " km/h");
    }
}
