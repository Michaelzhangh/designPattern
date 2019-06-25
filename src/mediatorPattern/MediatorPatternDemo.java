package mediatorPattern;

/**
 * @author zhangh
 * @create 2019-06-25
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {

        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi！John ");
        john.sendMessage("Hello！Robert");

        /**
         * 执行结果如下：
         *
         * Tue Jun 25 21:31:18 CST 2019 [Robert] : Hi！John
         * Tue Jun 25 21:31:18 CST 2019 [John] : Hello！Robert
         *
         */

    }
}
