package org.tasks.OOP.AbstractClass_Interface.Abstract_Class.Task2;

public class Car extends Vehicle{
    public Car(String model, double fuelLevel) {
        super(model, fuelLevel);
    }

    @Override
    public void drive(double distance) {
        double requiredFuel = distance * 0.1;
        if (fuelLevel >= requiredFuel) {
            fuelLevel -= requiredFuel;
            System.out.println(model + " drove " + distance + " units.");
        } else {
            System.out.println("Insufficient fuel for " + model);
        }
    }
}
