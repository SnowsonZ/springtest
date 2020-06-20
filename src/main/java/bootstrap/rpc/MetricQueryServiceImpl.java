package bootstrap.rpc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Snowson
 * @since 2019/11/17 21:41
 */
@Component
@Qualifier("aaa")
public class MetricQueryServiceImpl implements MetricQueryService {
    @Override
    public String queryMetric(String id) {
        return "metric Name: result";
    }

    @Override
    public String toString() {
        return getClass().getAnnotation(Qualifier.class).value();
    }
}
