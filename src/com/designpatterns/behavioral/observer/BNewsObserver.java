package designpatterns.behavioral.observer;

public class BNewsObserver implements NewsObserver {


    @Override
    public void update(String observableChange) {
        System.out.println("B News Observer :- " +observableChange);
    }
}
