package bootstrap.aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author Snowson
 **/
@Component("water")
public class ProxyFactoryBeanSupport extends ProxyFactoryBean {

    public ProxyFactoryBeanSupport(Coffee coffee) throws ClassNotFoundException {
        this.setInterceptorNames("loggerInterceptor", "loggerInterceptor");
        this.setProxyInterfaces(Coffee.class.getInterfaces());
        this.setTarget(coffee);
        this.setProxyTargetClass(true);
    }
}
