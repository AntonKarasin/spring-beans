package ru.be_prog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Person {
    private Car car;
    public Car getCar() {
        return car;
    }
    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }
}
