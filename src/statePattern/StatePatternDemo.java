package statePattern;

/**
 * @author zhangh
 * @create 2019-06-26
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());

        /**
         * 执行结果如下：
         * Player is in start state
         * Start State
         * Player is in stop state
         * Stop State
         *
         */


    }
}
