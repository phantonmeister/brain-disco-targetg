package designpatterns.structural.bridge.shapes;

import designpatterns.creational.factory.shape.Circle;

public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
