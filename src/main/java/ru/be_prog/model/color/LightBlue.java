package ru.be_prog.model.color;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(4)
public class LightBlue implements Color {
    @Override
    public String getColor() {
        return "Голубой ";
    }

    @Override
    public String getMnemonicWord() {
        return "где ";
    }
}
