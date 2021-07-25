package designpatterns.behavioral.observer;

public class ObserverMain {

    public static void main(String... args){

        ScoreObservable observable = new ScoreObservable();

        observable.addObserver(new ANewsObserver());
        observable.addObserver(new BNewsObserver());

        observable.setNews("Update 1-1");
    }
}
