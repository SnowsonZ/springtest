package bootstrap.manual;

import org.springframework.stereotype.Component;

/**
 * @author Snowson
 * @since 2019/10/23 17:39
 */
@Component
public class B implements Base {
    private C c;

    public B(C c) {
        this.c = c;
    }

    @Override
    public void fly() {
        System.out.println(" " + getClass().getName() + " " + c.name + " fly...");
    }
}
