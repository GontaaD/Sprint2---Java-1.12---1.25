package org.tasks.OOP.AbstractClass_Interface.Abstract_Class.Task2;

public class Main {
    public static void main(String[] args){
        Vehicle car = new Car("Sedan", 50);
        Vehicle truck = new Truck("Freightliner", 50);
        car.drive(100);
        truck.drive(100);
        System.out.println("Remaining fuel for " + car.getModel() + ": " + car.getFuelLevel() + " liters.");
        System.out.println("Remaining fuel for " + truck.getModel() + ": " + truck.getFuelLevel() + " liters.");
    }
}
