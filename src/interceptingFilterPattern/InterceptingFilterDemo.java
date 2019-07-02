package interceptingFilterPattern;

/**
 * @author zhangh
 * @create 2019-07-02
 */
public class InterceptingFilterDemo {

    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");

        /**
         * 执行结果如下：
         * Authenticating request: HOME
         * request log: HOME
         * Executing request: HOME
         */




    }

}
