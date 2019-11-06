package bootstrap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import bootstrap.manual.B;
import bootstrap.manual.C;
import bootstrap.manual.D;
import bootstrap.utils.Logger;

/**
 * @author Snowson
 * @since 2019/10/23 17:41
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class BeanConfig {

    @Bean("b")
    public B b() {
        return new B(c());
    }

    @Bean("d")
    public D d() {
        return new D(c());
    }

    @Bean("c")
    public C c() {
        return new C("little dog");
    }

    @Bean
    public Logger logger() {
        return new Logger();
    }
}
