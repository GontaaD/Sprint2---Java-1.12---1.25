package org.tasks.OOP.AbstractClass_Interface.AbstractClass.Task1;

public class Contractor extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    Contractor(String name, int id, double hourlyRate, double hoursWorked){
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateMonthlySalary(){
        return hourlyRate * hoursWorked;
    }
}
