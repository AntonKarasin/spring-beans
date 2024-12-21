package ru.be_prog.model.color;

import org.springframework.stereotype.Component;

@Component
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
