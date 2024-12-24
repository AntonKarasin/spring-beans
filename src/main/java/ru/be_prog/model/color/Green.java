package ru.be_prog.model.color;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Green implements Color {
    @Override
    public String getColor() {
        return "Зелёный ";
    }

    @Override
    public String getMnemonicWord() {
        return "знать, ";
    }
}
