package designpatterns.creational.factory.shape;

public class ShapeFactoryMain {

    public static void main(String... args){

        ShapeFactory factory = new SimpleShapeFactory();
        factory.getShape("Circle").drawShape();

        factory.getShape("rectangle").drawShape();
    }
}
