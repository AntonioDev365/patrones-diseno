package org.antonio.patterns.decorator;

public class FamilySizePizza implements Pizza{

    @Override
    public String getDescription() {
        return "Family Size Pizza (350)";
    }

    @Override
    public double getPrice() {
        return 350;
    }
}
