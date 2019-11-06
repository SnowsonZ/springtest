package bootstrap.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * PROTOTYPE SCOPE
 * 每次注入时都创建新的实例
 * @author Snowson
 * @since 2019/11/6 0:27
 */
@Component
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TimeFlag {
}
