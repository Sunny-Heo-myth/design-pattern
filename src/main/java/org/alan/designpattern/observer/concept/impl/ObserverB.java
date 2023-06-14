package org.alan.designpattern.observer.concept.impl;

import lombok.RequiredArgsConstructor;
import org.alan.designpattern.observer.concept.Observer;

@RequiredArgsConstructor
public class ObserverB implements Observer {
    private final String stateB;
    @Override
    public void run() {
        System.out.println(stateB);
    }
}
