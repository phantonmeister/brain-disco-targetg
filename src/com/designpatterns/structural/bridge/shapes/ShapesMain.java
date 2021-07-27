package designpatterns.structural.bridge.shapes;

public class ShapesMain {

    public static void main(String... args){

        Shape circle = new Circle(new RedColor());
        circle.draw();

        Shape gcircle = new Circle(new GreenColor());
        gcircle.draw();

    }
}
