package bootstrap.annotation;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Snowson
 * @since 2019/11/5 14:10
 */
@Target({TYPE, CONSTRUCTOR, METHOD, FIELD, PARAMETER})
@Retention(RUNTIME)
@Qualifier
public @interface IceCream {
}
