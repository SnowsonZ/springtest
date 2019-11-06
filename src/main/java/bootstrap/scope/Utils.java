package bootstrap.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * SINGLETON SCOPE
 *
 * @author Snowson
 * @since 2019/11/6 0:35
 */
@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Utils {
}
