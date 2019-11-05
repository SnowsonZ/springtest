package bootstrap.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Snowson
 * @since 2019/10/27 22:25
 */
@Component
public class X {

    private Y y;

    @Autowired
    public X(Y y) {
        this.y = y;
    }

    public void start() {
        y.move();
    }
}
