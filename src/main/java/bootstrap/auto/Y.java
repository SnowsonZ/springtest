package bootstrap.auto;

import org.springframework.stereotype.Component;

/**
 * @author Snowson
 * @since 2019/10/27 22:25
 */
@Component
public class Y implements Deliver {

    public Y() {
    }

    @Override
    public void move() {
        System.out.println("y moved");
    }
}
