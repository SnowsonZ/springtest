package bootstrap.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.remoting.rmi.RmiServiceExporter;

import bootstrap.rpc.MetricQueryService;

/**
 * @author Snowson
 * @since 2019/10/27 22:35
 */
@Configuration
@ComponentScan(basePackages = {"bootstrap.auto", "bootstrap.utils", "bootstrap.rpc", "bootstrap.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AutoConfig {

    @Qualifier("aaa")
    @Autowired
    MetricQueryService service;

    @Bean
    public static PropertyPlaceholderConfigurer placeholderConfigurer() {
        return new PropertyPlaceholderConfigurer();
    }

    @Bean
    public RmiServiceExporter rmiExporter() {
        RmiServiceExporter e = new RmiServiceExporter();
        e.setService(service);
        e.setServiceInterface(MetricQueryService.class);
        e.setServiceName("metricQueryService");

        return e;
    }

}
