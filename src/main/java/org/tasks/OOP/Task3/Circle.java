package org.tasks.OOP.Task3;

public class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of circle is: %.2f%n", area);
    }
}
