package designpatterns.creational.factory.shape;

public class Rectangle implements Shape{

    @Override
    public void drawShape() {
        System.out.println("Drawing a Rectangle.");
    }
}
