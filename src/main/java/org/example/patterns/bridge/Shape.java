package org.example.patterns.bridge;

public abstract class Shape {

    protected Color color;

    public Shape() {
    }
    public Shape(Color color) {
        this.color=color;
    }

    abstract public String draw();
}
