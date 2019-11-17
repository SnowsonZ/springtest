package bootstrap.auto;

/**
 * @author Snowson
 * @since 2019/10/27 22:26
 */
public interface Deliver {
    void move();

    void moved(String name);

    default void moved(int num) {
        System.out.println("num: " + num);
    }
}
