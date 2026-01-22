package org.tasks.OOP.AbstractClass_Interface.AbstractClass.Task1;

public class Main {
    public static void main(String[] args){
        Employee firstEmployee = new FullTimeEmployee("James Sallivan", 3204, 48000);
        Employee secondEmployee = new Contractor("Needleman", 3207, 20, 140);

        Employee[] employees = {firstEmployee, secondEmployee};
        for(Employee employee : employees){
            employee.displayInfo();
        }

    }
}
