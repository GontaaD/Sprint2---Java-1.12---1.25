package org.tasks.OOP.Task6;

public class Car {
    private Engine engine;

    public void startEngine() {
        Engine engine = new Engine();
        System.out.println("Starting car: ");
        engine.engineStart();
        System.out.println("Car is ready to go!");
    }
}
