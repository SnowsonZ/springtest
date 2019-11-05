package bootstrap.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import bootstrap.auto.X;
import bootstrap.auto.Y;

/**
 * @author Snowson
 * @since 2019/10/27 22:35
 */
@Configuration
@ComponentScan(basePackageClasses = {X.class, Y.class})
public class AutoConfig {
}
