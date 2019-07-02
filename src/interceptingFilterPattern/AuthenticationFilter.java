package interceptingFilterPattern;

/**
 * @author zhangh
 * @create 2019-07-02
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
