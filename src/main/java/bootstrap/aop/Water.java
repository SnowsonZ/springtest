package bootstrap.aop;

/**
 * @author Snowson
 **/
public interface Water {
    default void printTemperature() {
        System.out.println(getClass().getSimpleName() + " temp: " + 10);
    }
}
