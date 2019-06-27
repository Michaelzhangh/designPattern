package visitorPattern;

/**
 * @author zhangh
 * @create 2019-06-27
 */
public class VisitorPatternDemo {

    public static void main(String[] args) {

        ComputerPart computer = new Computer();

        computer.accept(new ComputerPartDisplayVisitor());

        /**
         * 执行结果如下：
         * Displaying Mouse.
         * Displaying Keyboard.
         * Displaying Monitor.
         * Displaying Computer.
         */

    }

}
