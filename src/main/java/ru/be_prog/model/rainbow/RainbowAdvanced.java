package ru.be_prog.model.rainbow;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.be_prog.model.color.Color;

import java.util.List;

@Component
@Qualifier("rainbow-advanced")
public class RainbowAdvanced extends AbstractRainbow {

    private final List<Color> colors;

    public RainbowAdvanced(List<Color> colors) {
        this.colors = colors;
    }

    @Override
    public String getRainbowColors() {
        return buildStringFromColors(colors, Color::getColor);
    }

    @Override
    public String getRainbowMnemonic() {
        return buildStringFromColors(colors, Color::getMnemonicWord);
    }
}
