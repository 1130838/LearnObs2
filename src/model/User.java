package model;

/**
 * Created by bruno.devesa on 20-05-2015.
 */
public class User implements Observer {
    private Observable observable;

    @Override
    public void subscribe(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void unsubscribe(Observable observable) {
        observable.removeObserver(this);
    }

    @Override
    public void update() {
        System.out.println("hello, i'm another subscriber and i've been notified because the value > 5");
    }
}
