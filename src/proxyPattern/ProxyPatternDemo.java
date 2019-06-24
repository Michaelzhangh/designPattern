package proxyPattern;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();

        /**
         * 执行结果如下：
         * Loading test_10mb.jpg
         * Displaying test_10mb.jpg
         *
         * Displaying test_10mb.jpg
         */

    }
}
