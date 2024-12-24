package ru.be_prog;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import ru.be_prog.model.rainbow.RainbowSimple;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringJUnitConfig(classes = ApplicationConfiguration.class)
public class SpringBeansTestRainbowSimple {

    @Autowired
    private ApplicationContext context;

    @Test
    public void shouldGetRainbowColors() {
        RainbowSimple rainbowSimple = context.getBean(RainbowSimple.class);
        String colors = rainbowSimple.getRainbowColors();
        assertEquals("Красный Оранжевый Жёлтый Зелёный Голубой Синий Фиолетовый", colors, "Тест не пройдет, цвета радуги не совпадают с правильным порядком.");
    }

    @Test
    public void shouldGetRainbowMnemonic() {
        RainbowSimple rainbowSimple = context.getBean(RainbowSimple.class);
        String colors = rainbowSimple.getRainbowMnemonic();
        assertEquals("Каждый охотник желает знать, где сидит фазан.", colors, "Тест не пройдет, мнемоническая фраза неправильная.");
    }
}