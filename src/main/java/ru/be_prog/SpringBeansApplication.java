package ru.be_prog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.be_prog.model.rainbow.RainbowAdvanced;
import ru.be_prog.model.rainbow.RainbowSimple;

public class SpringBeansApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        System.out.println("RainbowSimple:");
        RainbowSimple rainbowSimple = context.getBean(RainbowSimple.class);
        System.out.println(rainbowSimple.getRainbowColors());
        System.out.println(rainbowSimple.getRainbowMnemonic());

        System.out.println("RainbowAdvanced:");
        RainbowAdvanced rainbowAdvanced = context.getBean(RainbowAdvanced.class);
        System.out.println(rainbowAdvanced.getRainbowColors());
        System.out.println(rainbowAdvanced.getRainbowMnemonic());
    }
}
