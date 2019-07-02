package interceptingFilterPattern;

/**
 * @author zhangh
 * @create 2019-07-02
 */
public class Client {

    FilterManager filterManager;

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }

    public FilterManager getFilterManager() {
        return filterManager;
    }

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }
}
