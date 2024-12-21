package ru.be_prog;

import org.springframework.context.annotation.Configuration;

import java.beans.BeanProperty;

@Configuration
public class Person {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
