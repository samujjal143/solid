package org.example.solid.principles;

import java.util.List;

public class ShapesPrinter {
    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return "{sum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return "sum, %s".formatted(areaCalculator.sum(shapes));
    }
}
