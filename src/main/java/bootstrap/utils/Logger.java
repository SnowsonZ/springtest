package bootstrap.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Snowson
 * @since 2019/10/24 15:16
 */
@Aspect
@Component
public class Logger {

    @Pointcut("execution(* bootstrap.manual.Base.*(..)) ")
    public void process() {

    }

    @Pointcut("execution(* bootstrap.auto.Deliver.moved(String)) && args(name)")
    public void count(String name) {
    }

    @Before("process()")
    public void start() {
        System.out.println("fly start...");
    }

    @After("process()")
    public void complete() {
        System.out.println("fly complete...");
    }

    @Around("process()")
    public void processing(ProceedingJoinPoint point) {
        System.out.println("切点方法执行开始");
        try {
            // 交出控制权，调用切点方法
            point.proceed();
            System.out.println("切点方法执行完毕");
        } catch (Throwable throwable) {
            System.out.println(throwable.getMessage());
        }
    }

    @AfterReturning("process()")
    public void returnOccur() {
        System.out.println("切点方法返回");
    }

    @AfterThrowing("process()")
    public void exceptionOccur() {
        System.out.println("切点方法异常");
    }

    @Before("count(name)")
    public void calculate(String name) {
        playCount.put(name, getCurrentCount(name) + 1);
        System.out.println(playCount.toString());
    }

    public int getCurrentCount(String name) {
        return playCount.containsKey(name) ? playCount.get(name) : 0;
    }

    private Map<String, Integer> playCount = new HashMap<>();
}
