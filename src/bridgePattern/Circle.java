package bridgePattern;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class Circle extends Shape {

    private int radius;
    private int x;
    private int y;

    public Circle(int radius,int x,int y,DrawAPI drawAPI){
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
