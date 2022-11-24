package org.antonio.patterns.factory;

public class Main {
    public static void main(String[] args) {

        System.out.println("Implementing Factory Design Pattern in Java: ");

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
    }
}
