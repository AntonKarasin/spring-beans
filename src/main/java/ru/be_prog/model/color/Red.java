package ru.be_prog.model.color;

import org.springframework.stereotype.Component;

@Component
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
