package ru.be_prog;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.be_prog.model.Transport;

@Component
@Scope("prototype")
@Primary
public class Car implements Transport {

    private String brand;
    public void move()  {
        System.out.println("Drive on road");
    }
    public String getModel() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
