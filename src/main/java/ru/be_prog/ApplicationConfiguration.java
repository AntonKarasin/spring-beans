package ru.be_prog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.*;

@Configuration
public class ApplicationConfiguration {

    @Bean(name = "hello-bean")
    public SpringHelloWorld getHelloBean() {
        SpringHelloWorld bean = new SpringHelloWorld();
        bean.setMessage("Hello World from Spring!!!");
        return bean;
    }


    @Bean(name = "car-bean")
    @Scope("prototype")
    public Car getCarBean() {
        Car bean = new Car();
        bean.setBrand(randomCarBrand());
        return bean;
    }

    @Bean(name = "person-bean")
    @Scope("prototype")
    public Person getPerson() {
        Person bean = new Person();
        Car car = getCarBean();
        bean.setCar(car);
        return bean;
    }

    private String randomCarBrand() {
        int randomIndex = new Random().nextInt(CAR_BRANDS.size());
        return CAR_BRANDS.get(randomIndex);
    }

    public static final List<String> CAR_BRANDS = new ArrayList<>(
            Arrays.asList("Audi", "BMW", "Dodge", "Lada", "Lamborghini", "Land Rover", "Volvo", "Volkswagen", "Porsche")
    );

}
