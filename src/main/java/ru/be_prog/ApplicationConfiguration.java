package ru.be_prog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import ru.be_prog.model.color.Orange;


@Configuration
@ComponentScan(basePackages = "ru.be_prog")
public class ApplicationConfiguration {

    @Bean
    @Order(1)
    public Orange getOrangeBean() {
        return new Orange();
    }

}
