package org.alan.designpattern.observer.concept;

import org.alan.designpattern.observer.concept.impl.ObserverA;
import org.alan.designpattern.observer.concept.impl.ObserverB;
import org.alan.designpattern.observer.concept.impl.PublisherX;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class ConceptTest {

    private List<Observer> observers;
    private Publisher publisherX;
    private Observer observer1;
    private Observer observer2;
    private Observer observer3;

    // given
    @BeforeEach
    void beforeEach() {
        observers = new ArrayList<>();
        publisherX = new PublisherX(observers);
        observer1 = new ObserverA("1");
        observer2 = new ObserverA("2");
        observer3 = new ObserverB("3");
        publisherX.addObserver(observer1);
        publisherX.addObserver(observer2);
        publisherX.addObserver(observer3);
    }

    @Test
    void test1() {
        // given
        Observer observer4 = new ObserverB("4");

        // when
        publisherX.addObserver(observer4);
        publisherX.publish();
    }

    @Test
    void test2() {
        // when
        publisherX.removeObserver(observer2);
        publisherX.publish();
    }
}
