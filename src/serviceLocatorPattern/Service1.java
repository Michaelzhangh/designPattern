package serviceLocatorPattern;

/**
 * @author zhangh
 * @create 2019-07-02
 */
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
