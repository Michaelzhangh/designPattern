package interceptingFilterPattern;

/**
 * @author zhangh
 * @create 2019-07-02
 */
public class DebugFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
