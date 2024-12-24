package ru.be_prog.model.color;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Yellow implements Color {
    @Override
    public String getColor() {
        return "Жёлтый ";
    }

    @Override
    public String getMnemonicWord() {
        return "желает ";
    }
}
