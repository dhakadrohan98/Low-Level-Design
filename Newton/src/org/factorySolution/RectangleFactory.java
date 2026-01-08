package org.factorySolution;

public class RectangleFactory extends ShapeFactory {
    @Override
    protected Shape createShape() {
        return new Rectangle();
    }
}
