package org.antonio.patterns.decorator;

public abstract class PizzaDecorator implements Pizza {

    @Override
    public String getDescription() {
        return "Toppings";
    }

}