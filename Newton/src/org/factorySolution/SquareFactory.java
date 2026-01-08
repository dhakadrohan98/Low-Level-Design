package org.factorySolution;

public class SquareFactory extends ShapeFactory {
    @Override
    protected Shape createShape() {
        return new Square();
    }
}
