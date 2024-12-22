package ru.be_prog.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Qualifier("plane")
public class Airplane implements Transport {

    @Override
    public void move() {
        System.out.println("Fly in the sky");
    }
}
