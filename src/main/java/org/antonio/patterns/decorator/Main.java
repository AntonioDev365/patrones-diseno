package org.antonio.patterns.decorator;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Implementing Singleton Design Pattern in Java: ");

        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        Pizza pizza = new FamilySizePizza();
        pizza = new Chicken(pizza);
        pizza = new Cheese(pizza);

        System.out.println("Description: "+pizza.getDescription());
        System.out.println("Price: "+decimalFormat.format(pizza.getPrice()));

        pizza = new MediumSizePizza();
        pizza = new Ham(pizza);
        pizza = new Cheese(pizza);;

        System.out.println("Description: "+pizza.getDescription());
        System.out.println("Price: "+decimalFormat.format(pizza.getPrice()));
    }
    }
