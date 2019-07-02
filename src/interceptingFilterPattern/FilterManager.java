package interceptingFilterPattern;

/**
 * @author zhangh
 * @create 2019-07-02
 */
public class FilterManager {

    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }

}
