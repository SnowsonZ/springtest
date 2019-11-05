package bootstrap.manual;

/**
 * @author Snowson
 * @since 2019/10/24 14:20
 */
public class D implements Base {

    private C c;

    public D(C c) {
        this.c = c;
    }

    @Override
    public void fly() {
        System.out.println(" " + getClass().getName() + " " + c.name + " fly...");
    }

    @Override
    public String toString() {
        return getClass().getName() + ", " + c.name;
    }
}
