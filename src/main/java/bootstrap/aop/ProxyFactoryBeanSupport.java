package bootstrap.aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
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
    }
}
