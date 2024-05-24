package bootstrap.aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Snowson
 **/
@Component("water")
public class ProxyFactoryBeanSupport extends ProxyFactoryBean {


    Coffee coffee;

    @Autowired
    public ProxyFactoryBeanSupport(Coffee coffee) throws ClassNotFoundException {
        this.coffee = coffee;
        this.setInterceptorNames("loggerInterceptor", "loggerInterceptor");
        this.setProxyInterfaces(Coffee.class.getInterfaces());
        this.setTarget(coffee);
    }
}
