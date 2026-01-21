package org.tasks.OOP.AbstractClass_Interface.Abstract_Class.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Bob", 15, 887654));
        employees.add(new Contractor("Lob", 55, 488, 48));
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
