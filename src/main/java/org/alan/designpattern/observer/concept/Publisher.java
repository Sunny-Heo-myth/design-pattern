package org.alan.designpattern.observer.concept;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.Collection;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Publisher {

    protected final Collection<Observer> observers;

    public abstract void addObserver(Observer observer);

    public abstract void removeObserver(Observer observer);

    public void publish() {
        for (Observer observer : observers) {
            observer.run();
        }
    }
}
