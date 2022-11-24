package org.antonio.patterns.decorator;

public class Ham extends PizzaDecorator{

    private final Pizza pizza;

    public Ham(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Ham (18.12)";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice()+18.12;
    }

}