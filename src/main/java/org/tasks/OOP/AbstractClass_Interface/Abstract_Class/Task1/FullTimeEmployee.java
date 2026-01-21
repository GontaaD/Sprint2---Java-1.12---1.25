package org.tasks.OOP.AbstractClass_Interface.Abstract_Class.Task1;

public class FullTimeEmployee extends Employee {
    private final double yearlySalary;

    public FullTimeEmployee(String name, int id, double yearlySalary) {
        super(name, id);
        this.yearlySalary = yearlySalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return yearlySalary / 12;
    }
}
