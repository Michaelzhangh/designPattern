package frontControllerPattern;

/**
 * @author zhangh
 * @create 2019-07-01
 */
public class FrontControllerPatternDemo {

    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");

        /**
         * 执行结果如下：
         * Page requested: HOME
         * User is authenticated successfully.
         * Displaying Home Page
         * Page requested: STUDENT
         * User is authenticated successfully.
         * Displaying Student Page
         */
    }
}
