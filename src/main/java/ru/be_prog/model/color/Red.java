package ru.be_prog.model.color;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0)
public class Red implements Color {
    @Override
    public String getColor() {
        return "Красный ";
    }

    @Override
    public String getMnemonicWord() {
        return "Каждый ";
    }
}
