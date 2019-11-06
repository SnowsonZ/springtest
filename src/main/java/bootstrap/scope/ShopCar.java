package bootstrap.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import static org.springframework.web.context.WebApplicationContext.SCOPE_SESSION;

/**
 * SESSION SCOPE
 * 若ShopCar,则proxyMode = {@link ScopedProxyMode.INTERFACES}
 *
 * @author Snowson
 * @since 2019/11/6 0:20
 */
@Component
@Scope(scopeName = SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ShopCar {
}
