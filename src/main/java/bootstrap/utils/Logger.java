package bootstrap.utils;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Snowson
 * @since 2019/10/24 15:16
 */
@Aspect
public class Logger {

    @Before("execution(* bootstrap.manual.Base.*(..)) ")
    public void start() {
        System.out.println("fly start...");
    }

    @After("execution(* bootstrap.manual.Base.*(..)) ")
    public void complete() {
        System.out.println("fly complete...");
    }
}
