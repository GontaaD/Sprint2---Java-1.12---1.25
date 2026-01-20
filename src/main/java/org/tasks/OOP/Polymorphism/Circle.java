package org.tasks.OOP.Polymorphism;

public class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println(Math.PI * (radius * radius));
    }
}
