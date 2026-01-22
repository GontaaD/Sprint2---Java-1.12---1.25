package org.tasks.OOP.AbstractClass_Interface.AbstractClass.Task1;

public abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id){
        this.name=name;
        this.id= id;
    }

    public abstract double calculateMonthlySalary();

    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID:" + id);
        System.out.println("MonthlySalary: " + calculateMonthlySalary());
    }
}
