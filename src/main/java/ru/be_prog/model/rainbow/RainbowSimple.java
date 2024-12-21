package ru.be_prog.model.rainbow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import ru.be_prog.model.color.*;

import java.util.Arrays;

@Component
@Primary
public class RainbowSimple extends AbstractRainbow {

    private Red red;
    private Orange orange;

    @Autowired
    private Yellow yellow;
    private Green green;
    private LightBlue lightBlue;
    private Blue blue;
    private Purple purple;

    public RainbowSimple(Red red) {
        this.red = red;
    }

    @Autowired
    public void setOrange(Orange orange) {
        this.orange = orange;
    }

    @Override
    public String getRainbowColors() {
        return buildStringFromColors(Arrays.asList(red, orange, yellow, green, lightBlue, blue, purple), Color::getColor);
    }

    @Override
    public String getRainbowMnemonic() {
        return buildStringFromColors(Arrays.asList(red, orange, yellow, green, lightBlue, blue, purple), Color::getMnemonicWord);
    }
}
