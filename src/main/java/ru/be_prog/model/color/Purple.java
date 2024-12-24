package ru.be_prog.model.color;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(6)
public class Purple implements Color {
    @Override
    public String getColor() {
        return "Фиолетовый";
    }

    @Override
    public String getMnemonicWord() {
        return "фазан.";
    }
}
