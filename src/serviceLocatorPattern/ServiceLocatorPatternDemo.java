package serviceLocatorPattern;

/**
 * @author zhangh
 * @create 2019-07-02
 */
public class ServiceLocatorPatternDemo {

    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();

        /**
         *  执行结果如下：
         *  Looking up and creating a new Service1 object
         * Executing Service1
         * Looking up and creating a new Service2 object
         * Executing Service2
         * Returning cached  Service1 object
         * Executing Service1
         * Returning cached  Service2 object
         * Executing Service2
         */

    }
}
