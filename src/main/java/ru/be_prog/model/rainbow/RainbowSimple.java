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
    @Autowired
    private Blue blue;
    @Autowired
    private Purple purple;

    public RainbowSimple(Red red, Green green) {this.red = red; this.green = green; }

    @Autowired
    public void setOrange(Orange orange) {
        this.orange = orange;
    }

    // public RainbowSimple(Green green) { this.green = green; }

    @Autowired
    public void setLightBlue(LightBlue lightBlue) {
        this.lightBlue = lightBlue;
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
