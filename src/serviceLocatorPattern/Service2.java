package serviceLocatorPattern;

/**
 * @author zhangh
 * @create 2019-07-02
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }
}
