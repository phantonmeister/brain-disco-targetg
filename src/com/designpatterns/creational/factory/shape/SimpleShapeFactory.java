package designpatterns.creational.factory.shape;

public class SimpleShapeFactory implements ShapeFactory{
    @Override
    public Shape getShape(String shapeType) {
        if("CIRCLE".equalsIgnoreCase(shapeType))
            return new Circle();
        else if("SQUARE".equals(shapeType))
            return new Square();
        else
            return new Rectangle();
    }
}
