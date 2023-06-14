package org.alan.designpattern.observer.concept.impl;

import lombok.RequiredArgsConstructor;
import org.alan.designpattern.observer.concept.Observer;

@RequiredArgsConstructor
public class ObserverA implements Observer {
    private final String stateA;
    @Override
    public void run() {
        System.out.println(stateA);
    }
}
