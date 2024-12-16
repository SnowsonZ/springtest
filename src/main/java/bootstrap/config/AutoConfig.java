package bootstrap.config;

import bootstrap.annotation.Cold;
import bootstrap.annotation.IceCream;
import bootstrap.aop.Coffee;
import bootstrap.auto.Deliver;
import bootstrap.rpc.MetricQueryService;
import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Snowson
 * @since 2019/10/27 22:35
 */
@Configuration
@ComponentScan(basePackages = {"bootstrap.auto", "bootstrap.utils", "bootstrap.rpc", "bootstrap.aop"})
@EnableAspectJAutoProxy
public class AutoConfig implements BeanFactoryAware {

    MetricQueryService service;
    Deliver deliver;
    private BeanFactory beanFactory;

    public AutoConfig(@Qualifier("aaa") MetricQueryService service) {
        this.service = service;
    }

    @Autowired
    public AutoConfig(@Qualifier("ddd") MetricQueryService service, @Cold @IceCream Deliver deliver) {
        this.service = service;
        this.deliver = deliver;
        System.out.println("init " + getClass().getSimpleName() + ", deliver: " + deliver.getClass().getSimpleName());
    }

    @Bean
    public Object coffee(MethodInterceptor loggerInterceptor,
                         @Qualifier("xxx") Coffee coffee) throws ClassNotFoundException {
        final ProxyFactoryBean pfb = new ProxyFactoryBean();
        pfb.setInterceptorNames("loggerInterceptor");
        pfb.setProxyInterfaces(Coffee.class.getInterfaces());
        pfb.setTarget(coffee);
        pfb.setProxyTargetClass(true);
        pfb.setBeanFactory(beanFactory);
        return pfb.getObject();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }
}
