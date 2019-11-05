package bootstrap.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Snowson
 * @since 2019/11/5 14:07
 */
@Target(value = {TYPE, CONSTRUCTOR, METHOD, FIELD})
@Retention(RUNTIME)
@Qualifier
public @interface Hot {
}
