package org.tasks.OOP.AbstractClass_Interface.AbstractClass.Task2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Honda Odyssey", 50);
        car.drive(100);
        car.refuel(5);
        System.out.println(car.getModel() + " fuel level is: " + car.getFuelLevel());


        Vehicle truck = new Truck("MAN TGX", 50);
        truck.drive(100);
        truck.refuel(11);
        System.out.println(truck.getModel() + " fuel level is: " + truck.getFuelLevel());
    }
}
