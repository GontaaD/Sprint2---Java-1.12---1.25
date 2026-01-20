package org.tasks;

import org.tasks.Object.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda Odyssey");
        car.accelerate(49);
        car.printSpeed();
    }
}
