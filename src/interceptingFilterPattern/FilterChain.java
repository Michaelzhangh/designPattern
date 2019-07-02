package interceptingFilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangh
 * @create 2019-07-02
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter:filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
