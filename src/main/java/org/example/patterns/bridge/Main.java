package org.example.patterns.bridge;

public class Main {
    public static void main(String[] args) {

        System.out.println("Implementing Bridge Design Pattern in Java: ");

        Shape square = new Square(new Green());
        System.out.println(square.draw());

        Shape triangle=new Triangle(new Blue());
        System.out.println(triangle.draw());
    }
}
