package designpatterns.behavioral.command;

public class LightBulb implements Device{
    @Override
    public void turnOff() {
        System.out.println("LightBulb is turned OFF");
    }

    @Override
    public void turnOn() {
        System.out.println("LightBulb is turned ON");
    }
}
