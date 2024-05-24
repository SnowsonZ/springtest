package bootstrap.aop;

import org.springframework.stereotype.Component;

/**
 * @author Snowson
 **/
@Component
public class Coffee implements Water {
    int temperature;

    @Override
    public void printTemperature() {
        System.out.println(getClass().getSimpleName() + " temp: " + 10);
    }
}
