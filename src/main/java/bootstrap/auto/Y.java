package bootstrap.auto;

import org.springframework.stereotype.Component;

import bootstrap.annotation.Cold;
import bootstrap.annotation.IceCream;

/**
 * @author Snowson
 * @since 2019/10/27 22:25
 */
@Component
@Cold
@IceCream
public class Y implements Deliver {

    @Override
    public void move() {
        System.out.println("y moved");
    }
}
