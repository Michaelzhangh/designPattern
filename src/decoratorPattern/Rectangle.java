package decoratorPattern;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
