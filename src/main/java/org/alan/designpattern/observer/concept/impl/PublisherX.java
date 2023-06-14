package org.alan.designpattern.observer.concept.impl;

import org.alan.designpattern.observer.concept.Observer;
import org.alan.designpattern.observer.concept.Publisher;

import java.util.Collection;

public class PublisherX extends Publisher {

    public PublisherX(Collection<Observer> observers) {
        super(observers);
    }

    @Override
    public void addObserver(Observer observer) {
        super.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        super.observers.remove(observer);
    }
}
