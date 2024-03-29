package observerPattern;

/**
 * @author zhangh
 * @create 2019-06-26
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        /**
         * 执行结果如下：
         * First state change: 15
         * Hex String: F
         * Octal String: 17
         * Binary String: 1111
         * Second state change: 10
         * Hex String: A
         * Octal String: 12
         * Binary String: 1010
         */

    }

}
