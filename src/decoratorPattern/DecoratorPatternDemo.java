package decoratorPattern;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        //Shape redCircle = new RedShapeDecorator(new Circle());
        //Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        /**
         *   执行结果如下：
         * Circle with normal border
         * Shape: Circle
         *
         * Circle of red border
         * Shape: Circle
         * Border Color: Red
         *
         * Rectangle of red border
         * Shape: Rectangle
         * Border Color: Red
         *
         *
         */


    }
}
