package bootstrap.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootstrap.annotation.Coffee;
import bootstrap.annotation.Cold;
import bootstrap.annotation.Hot;
import bootstrap.annotation.IceCream;

/**
 * @author Snowson
 * @since 2019/10/27 22:25
 */
@Component
public class X {

    private Deliver d;

    @Autowired
    @Hot
    @Coffee
    public X(Deliver d) {
        this.d = d;
    }

    public void start() {
        d.move();
    }
}
