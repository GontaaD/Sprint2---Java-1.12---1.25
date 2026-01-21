package org.tasks.OOP.Task2;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {new Animal(), new Dog(), new Cat()};

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}