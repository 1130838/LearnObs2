package model;

/**
 * Created by bruno.devesa on 20-05-2015.
 */
// to be an observer, how must be my API? what do i want as an observer ?
public interface Observer {
    public void subscribe(Observable observable);
    public void unsubscribe(Observable observable);
    public void update();
}
