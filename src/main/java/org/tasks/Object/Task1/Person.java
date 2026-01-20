package org.tasks.Object.Task1;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.printf("Person:%nName: %s%nAge: %s%n",name,age);
    }
}
