package bootstrap.aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author Snowson
 **/
@Component("water")
public class ProxyFactoryBeanImpl extends ProxyFactoryBean {


    Coffee coffee;

    @Autowired
    public ProxyFactoryBeanImpl(Coffee coffee) throws ClassNotFoundException {
        this.coffee = coffee;
        this.setInterceptorNames("loggerInterceptor");
        this.setProxyInterfaces(Coffee.class.getInterfaces());
        this.setTarget(coffee);
    }
}
