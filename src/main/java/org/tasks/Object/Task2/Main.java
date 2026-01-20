package org.tasks.Object.Task2;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Mercedes");
        car.printSpeed();
        car.accelerate(120);
        car.printSpeed();
        car.accelerate(-150);
        car.printSpeed();
    }
}
