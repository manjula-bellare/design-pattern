package designPatterns.design.patterns;

import java.util.ArrayList;
import java.util.List;

public class CustomerOrder implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String orderStatus;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(orderStatus);
        }
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        notifyObservers();
    }
}

