package org.antonio.patterns.decorator;

public class Chicken extends PizzaDecorator{

    private final Pizza pizza;

    public Chicken(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+", Chicken (12.75)";
    }


    @Override
    public double getPrice() {
        return pizza.getPrice()+12.75;
    }

}