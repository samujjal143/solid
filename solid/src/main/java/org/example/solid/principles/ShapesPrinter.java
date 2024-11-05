package org.example.solid.principles;

import java.util.List;

public class ShapesPrinter {

    public String json(int sum) {
        return "{sum: %s}".formatted(sum);
    }

    public String csv(int sum) {
        return "sum, %s".formatted(sum);
    }
}
