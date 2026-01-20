package org.tasks.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal animal = new Animal();
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
