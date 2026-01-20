package org.tasks.OOP.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
        }
    }
}
