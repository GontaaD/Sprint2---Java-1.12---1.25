package org.tasks.Object;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Person name is: " + name);
        System.out.println(name + " age is: " + age);
    }
}
