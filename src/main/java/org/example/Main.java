package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        NoShape noShape = new NoShape();
        List<Shape> shapes = List.of(circle, square, cube);
        int sum = areaCalculator.sum(shapes);
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));
    }
}