package org.tasks.OOP.Task3;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea() {
        double area = length * width;
        System.out.printf("Rectangle area is: %.2f%n", area);
    }
}
