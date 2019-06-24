package bridgePattern;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 100, 100, new RedCircle());
        Shape greenCircle = new Circle(10, 100, 100, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

        /**
         *  执行结果如下：
         *
         *  Drawing Circle[ color: red, radius: 10, x: 100, y: 100]
         *  Drawing Circle[ color: green, radius: 10, x: 100, y: 100]
         *
         */

    }
}
