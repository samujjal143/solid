package org.example;

import java.util.List;

public class ShapesPrinter {
    private AreaCalculator areaCalculator = new AreaCalculator();

    public String json(List<Shape> shapes) {
        return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "shapes_sum, %s".formatted(areaCalculator.sum(shapes));
    }

    /*  We are breaking the Dependency Inversion Principle because we are depending on the
        actual concrete class i.e. AreaCalculator
     */
}
