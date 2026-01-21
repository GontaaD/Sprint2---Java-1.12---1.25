package org.tasks.OOP.AbstractClass_Interface.Abstract_Class.Task2;

public abstract class Vehicle {
    protected String model;
    protected double fuelLevel;

    public Vehicle(String model, double fuelLevel) {
        this.model = model;
        this.fuelLevel = fuelLevel;
    }

    public String getModel(){
        return model;
    }

    public double getFuelLevel(){
        return fuelLevel;
    }

    public abstract void drive(double distance);

    public void refuel(double amount) {
        if(amount<0){
            System.out.println("Refuel can't be negative");
            return;
        }
        fuelLevel += amount;
    }
}
