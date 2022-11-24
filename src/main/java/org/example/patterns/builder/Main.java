package org.example.patterns.builder;

public class Main {
    public static void main(String[] args) {

        System.out.println("Implementing Builder Pattern in Java with lombok: "
                +User.builder().id(1L).firstName("Tomas").lastName("Roncero").age(40).build());
    }
}
