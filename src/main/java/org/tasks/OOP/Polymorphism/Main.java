package org.tasks.OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(5, 3);
        circle.getArea();
        rectangle.getArea();
    }
}
