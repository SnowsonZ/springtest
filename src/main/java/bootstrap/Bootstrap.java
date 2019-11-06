package bootstrap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bootstrap.auto.X;
import bootstrap.config.AutoConfig;
import bootstrap.manual.A;
import bootstrap.manual.Base;
import bootstrap.manual.D;
import bootstrap.config.BeanConfig;

/**
 * @author Snowson
 * @since 2019/10/23 17:36
 */
public class Bootstrap {
    public static void main(String[] args) {

        // manual java code config
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Base b = context.getBean(D.class );
        A a = new A(b);
        a.start();

        // auto java code config
        AnnotationConfigApplicationContext contextAuto = new AnnotationConfigApplicationContext(AutoConfig.class);
        X x = contextAuto.getBean(X.class);
        x.start();
        x.start();
        x.start();
    }
}
