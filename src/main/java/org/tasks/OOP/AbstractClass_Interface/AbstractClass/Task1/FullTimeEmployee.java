package org.tasks.OOP.AbstractClass_Interface.AbstractClass.Task1;

public class FullTimeEmployee extends Employee{
    private double yearlySalary;

    public FullTimeEmployee(String name, int id, double yearlySalary){
        super(name, id);
        this.yearlySalary= yearlySalary;
    }

    @Override
    public double calculateMonthlySalary(){
        return yearlySalary/12;
    }
}
