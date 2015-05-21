package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno.devesa on 20-05-2015.
 */
// to be a observervable object ( users to be interestd in me ), how must be my API? what do i want as an observer ?
public interface Observable {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
