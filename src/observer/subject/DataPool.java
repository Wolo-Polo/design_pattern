package observer.subject;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class DataPool implements Subject {
    private String data;
    private List<Observer> observers = new ArrayList<>(); ////??

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyToObservers() {
        observers.forEach(observer -> observer.update(data));
    }

    public void setData(String data) { ////??
        this.data = data;
        notifyToObservers();
    }
}
