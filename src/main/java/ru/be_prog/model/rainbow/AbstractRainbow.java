package ru.be_prog.model.rainbow;

import ru.be_prog.model.color.Color;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class AbstractRainbow {

    public abstract String getRainbowColors();

    public abstract String getRainbowMnemonic();

    protected String buildStringFromColors(List<Color> colors, Function<Color, String> colorStringExtractor) {
        return colors.stream().map(colorStringExtractor).collect(Collectors.joining());
    }
}
