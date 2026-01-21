package org.tasks.OOP.Task3;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(3.5, 2.3);

        circle.getArea();
        rectangle.getArea();
    }
}
