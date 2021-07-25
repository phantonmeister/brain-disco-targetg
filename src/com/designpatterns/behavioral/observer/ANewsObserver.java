package designpatterns.behavioral.observer;

public class ANewsObserver implements NewsObserver{

    @Override
    public void update(String observableChange) {
        System.out.println("A News Observer :- " +observableChange);
    }
}
