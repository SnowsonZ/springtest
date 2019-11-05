package bootstrap.auto;

import org.springframework.stereotype.Component;

import bootstrap.annotation.Coffee;
import bootstrap.annotation.Hot;

/**
 * @author Snowson
 * @since 2019/11/5 23:55
 */
@Component
@Hot
@Coffee
public class Z implements Deliver {
    @Override
    public void move() {
        System.out.println("z moved");
    }
}
