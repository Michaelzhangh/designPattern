package templatePattern;

/**
 * @author zhangh
 * @create 2019-06-27
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();

        /**
         * 执行结果如下：
         * Cricket Game Initialized! Start playing.
         * Cricket Game Started. Enjoy the game!
         * Cricket Game Finished!
         *
         * Football Game Initialized! Start playing.
         * Football Game Started. Enjoy the game!
         * Football Game Finished!
         *
         */

    }

}
