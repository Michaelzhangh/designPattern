package facadePattern;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();;
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }


}
