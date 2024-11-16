package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        NoShape noShape = new NoShape();
        List<Shape> shapes = List.of(circle, square, cube, noShape);
        /* The class NoShape cannot calculate the area. We are violating the Liskov
           Substitution Principle because NoShape is not substitutable for Shape.
         */
        int sum = areaCalculator.sum(shapes);
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        System.out.println(shapesPrinter.json(sum));
        System.out.println(shapesPrinter.csv(sum));
    }
}