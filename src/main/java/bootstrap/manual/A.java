package bootstrap.manual;

/**
 * @author Snowson
 * @since 2019/10/23 17:38
 */
public class A {
    private Base b;

    public A(Base instance) {
        this.b = instance;
    }

    public void start() {
        this.b.fly();
    }
}
