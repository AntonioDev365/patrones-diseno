package org.antonio.patterns.decorator;

public class MediumSizePizza implements Pizza {

    @Override
    public String getDescription() {
        return "Medium Size Pizza (350)";
    }

    @Override
    public double getPrice() {
        return 230;
    }

}
