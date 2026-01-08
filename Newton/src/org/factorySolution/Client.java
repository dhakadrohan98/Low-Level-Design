package org.factorySolution;

public class Client {
    public static void main(String[] args) {

        ShapeFactory factory = new CircleFactory();
        factory.render();

        ShapeFactory factory2 = new SquareFactory();
        factory2.render();
    }
}

