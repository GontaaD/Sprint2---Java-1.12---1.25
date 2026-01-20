package org.tasks.Object.Task2;

public class Car {
    String brand;
    int speed;

    public Car(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void printSpeed() {
        System.out.println(speed);
    }
}
