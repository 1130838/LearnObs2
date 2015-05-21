package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno.devesa on 20-05-2015.
 */
public class Expense implements Observable {

    private int value;
    private List<Observer> listOfInterested = new ArrayList<Observer>();

    public Expense(int value) {
        this.value = value;
    }

    @Override
    public void addObserver(Observer observer) {
    listOfInterested.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
listOfInterested.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < listOfInterested.size() ; i++) {
            listOfInterested.get(i).update();
        }
    }

    public int getValue() {
        return value;
    }

}
