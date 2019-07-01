package compositeEntityPattern;

/**
 * @author zhangh
 * @create 2019-07-01
 */
public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();

        /**
         * 执行结果如下：
         * Data: Test
         * Data: Data
         * Data: Second Test
         * Data: Data1
         */

    }
}
