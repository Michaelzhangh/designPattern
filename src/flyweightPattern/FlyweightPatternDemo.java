package flyweightPattern;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class FlyweightPatternDemo {

    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };

    public static void main(String[] args) {

        for (int i=0;i<20;i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }

        /**
         * 执行结果如下：
         * Creating circle of color : Blue
         * Circle: Draw() [Color : Blue, x : 84, y :80, radius :100
         * Creating circle of color : Green
         * Circle: Draw() [Color : Green, x : 9, y :70, radius :100
         * Creating circle of color : White
         * Circle: Draw() [Color : White, x : 25, y :80, radius :100
         * Circle: Draw() [Color : White, x : 15, y :19, radius :100
         * Creating circle of color : Red
         * Circle: Draw() [Color : Red, x : 15, y :33, radius :100
         * Creating circle of color : Black
         * Circle: Draw() [Color : Black, x : 0, y :28, radius :100
         * Circle: Draw() [Color : Blue, x : 15, y :32, radius :100
         * Circle: Draw() [Color : Blue, x : 10, y :8, radius :100
         * Circle: Draw() [Color : Black, x : 74, y :12, radius :100
         * Circle: Draw() [Color : Black, x : 57, y :25, radius :100
         * Circle: Draw() [Color : Blue, x : 28, y :99, radius :100
         * Circle: Draw() [Color : White, x : 2, y :4, radius :100
         * Circle: Draw() [Color : Blue, x : 47, y :38, radius :100
         * Circle: Draw() [Color : Green, x : 53, y :85, radius :100
         * Circle: Draw() [Color : Blue, x : 63, y :41, radius :100
         * Circle: Draw() [Color : Red, x : 72, y :39, radius :100
         * Circle: Draw() [Color : Red, x : 46, y :89, radius :100
         * Circle: Draw() [Color : Blue, x : 91, y :1, radius :100
         * Circle: Draw() [Color : Blue, x : 53, y :33, radius :100
         * Circle: Draw() [Color : Green, x : 67, y :18, radius :100
         */

    }

    private static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    private static int getRandomX(){
        return (int)(Math.random()*100);
    }

    private static int getRandomY(){
        return (int)(Math.random()*100);
    }



}
