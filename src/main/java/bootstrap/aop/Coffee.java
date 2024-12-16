package bootstrap.aop;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Snowson
 **/
@Component("xxx")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Coffee implements Water {
    int temperature;
}
