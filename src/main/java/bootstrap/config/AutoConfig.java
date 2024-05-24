package bootstrap.config;

import bootstrap.annotation.Coffee;
import bootstrap.annotation.Hot;
import bootstrap.auto.Deliver;
import bootstrap.rpc.MetricQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * @author Snowson
 * @since 2019/10/27 22:35
 */
@Configuration
@ComponentScan(basePackages = {"bootstrap.auto", "bootstrap.utils", "bootstrap.rpc", "bootstrap.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AutoConfig {

    MetricQueryService service;
    Deliver deliver;

    public AutoConfig() {
        System.out.println("");
    }

    public AutoConfig(@Qualifier("aaa") MetricQueryService service) {
        this.service = service;
    }

    @Autowired
    public AutoConfig(@Qualifier("ddd") MetricQueryService service, @Hot @Coffee Deliver deliver) {
        this.service = service;
        this.deliver = deliver;
        System.out.println("init " + getClass().getSimpleName() + ", deliver: " + deliver.getClass().getSimpleName());
    }

    @Bean
    public static PropertyPlaceholderConfigurer placeholderConfigurer() {
        return new PropertyPlaceholderConfigurer();
    }

    @Bean
    public RmiServiceExporter rmiExporter(@Qualifier("aaa") MetricQueryService service1) {
        RmiServiceExporter e = new RmiServiceExporter();
        e.setService(service1);
        e.setServiceInterface(MetricQueryService.class);
        e.setServiceName("metricQueryService");
        return e;
    }

}
