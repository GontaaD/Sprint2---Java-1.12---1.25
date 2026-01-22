package org.tasks.OOP.AbstractClass_Interface.AbstractClass.Task2;

public class Truck extends Vehicle {

    Truck(String model, double fuelLevel) {
        super(model, fuelLevel);
    }

    @Override
    public void drive(double distance) {
        double neededFuel = distance * 0.3;
        if ( neededFuel > fuelLevel) {
            System.out.println("Insufficient fuel for: " + model);
        } else {
            fuelLevel -= neededFuel;
            System.out.println(model + " drove " + distance + " units");
            System.out.println("Fuel consumption " + neededFuel);
            System.out.println(model + " fuel level " + fuelLevel);
        }
    }
}
