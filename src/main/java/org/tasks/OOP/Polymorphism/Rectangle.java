package org.tasks.OOP.Polymorphism;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println(width * height);
    }
}
