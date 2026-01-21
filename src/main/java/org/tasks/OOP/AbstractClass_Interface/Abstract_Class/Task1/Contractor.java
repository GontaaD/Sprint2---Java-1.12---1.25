package org.tasks.OOP.AbstractClass_Interface.Abstract_Class.Task1;

public class Contractor extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    public Contractor(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateMonthlySalary() {
        return hourlyRate * hoursWorked;
    }
}
