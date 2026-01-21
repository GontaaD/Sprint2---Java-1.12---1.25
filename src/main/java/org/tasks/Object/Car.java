package org.tasks.Object;

class Car {

    String brand;
    int speed;

    Car(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    void accelerate(int value) {
        speed = speed + value;
    }

    void printSpeed() {
        System.out.println("Current speed: " + speed);
    }
}