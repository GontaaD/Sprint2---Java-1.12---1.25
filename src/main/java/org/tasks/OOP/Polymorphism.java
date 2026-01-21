package org.tasks.OOP;

public class Polymorphism {
    abstract class Shape {
        abstract double getArea();
    }

    class Circle extends Shape {
        private double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double getArea() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        private double width;
        private double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double getArea() {
            return width * height;
        }
    }
}
