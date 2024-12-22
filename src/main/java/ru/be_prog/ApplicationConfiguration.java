package ru.be_prog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.*;

@Configuration
@ComponentScan(basePackages = "ru.be_prog")
public class ApplicationConfiguration {

    private String randomCarBrand() {
        int randomIndex = new Random().nextInt(CAR_BRANDS.size());
        return CAR_BRANDS.get(randomIndex);
    }

    public static final List<String> CAR_BRANDS = new ArrayList<>(
            Arrays.asList("Audi", "BMW", "Dodge", "Lada", "Lamborghini", "Land Rover", "Volvo", "Volkswagen", "Porsche")
    );

}
