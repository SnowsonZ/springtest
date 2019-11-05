package bootstrap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import bootstrap.config.BeanConfig;
import bootstrap.manual.B;
import bootstrap.manual.D;

/**
 * @author Snowson
 * @since 2019/11/4 2:41
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {BeanConfig.class})
@ActiveProfiles("dev")
public class BootstrapTest {

    @Autowired
    ApplicationContext context;

    @Test
    public void main() {
        D bean = context.getBean(D.class);
        System.out.println(bean.toString());
    }
}
