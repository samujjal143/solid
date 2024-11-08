package org.example;

import org.example.solid.principles.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
        List<Shape> shapes = List.of(circle, square, cube, rectangle);
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));
    }
}