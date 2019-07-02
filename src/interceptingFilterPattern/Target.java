package interceptingFilterPattern;

/**
 * @author zhangh
 * @create 2019-07-02
 */
public class Target {

    public void execute(String request){
        System.out.println("Executing request: " + request);
    }

}
