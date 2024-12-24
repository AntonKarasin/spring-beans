package ru.be_prog.model.color;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class Blue implements Color {
    @Override
    public String getColor() {
        return "Синий ";
    }

    @Override
    public String getMnemonicWord() {
        return "сидит ";
    }
}
