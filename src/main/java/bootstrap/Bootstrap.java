package bootstrap;

import bootstrap.aop.Water;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import bootstrap.config.AutoConfig;
import bootstrap.config.BeanConfig;
import bootstrap.manual.A;
import bootstrap.manual.Base;
import bootstrap.manual.D;

/**
 * @author Snowson
 * @since 2019/10/23 17:36
 */
public class Bootstrap {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "target/classes/cglib");
        final Bootstrap bootstrap = new Bootstrap();
        bootstrap.autoInjectTest();
    }

    public void manualInjectTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        Base b = context.getBean(D.class);
        A a = new A(b);
        a.start();
    }

    public void autoInjectTest() {
        AnnotationConfigApplicationContext contextAuto = new AnnotationConfigApplicationContext(AutoConfig.class);
        final Water coffee = (Water) contextAuto.getBean("water");
        coffee.printTemperature();
    }

}
