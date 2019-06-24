package facadePattern;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class FacadePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        /**
         *  执行结果如下：
         *
         * Circle::draw()
         * Rectangle::draw()
         * Square::draw()
         */

    }
}
