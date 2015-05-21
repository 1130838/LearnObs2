package presentation;

import aplication.WatchExpenseController;
import model.Observable;
import model.Observer;
import util.Console;

/**
 * Created by bruno.devesa on 20-05-2015.
 */
public class MainUI implements Observer{

    Observable observable = null;
    WatchExpenseController watchExpenseController;
    int number;

    public void run() {
        number = Console.readInteger("type a number for the counter");
        watchExpenseController = new WatchExpenseController(number, this);
    }

    @Override
    public void subscribe(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void unsubscribe(Observable observable) {
this.observable.removeObserver(this);
    }

    @Override
    public void update() {
        System.out.println("hello,i'm the UI and i'm a subscriber of expense. i get notified now because the number is > 5");

    }
}
