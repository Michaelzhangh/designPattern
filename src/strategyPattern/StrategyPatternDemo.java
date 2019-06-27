package strategyPattern;

/**
 * @author zhangh
 * @create 2019-06-27
 */
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

        /**
         * 执行结果如下：
         *
         * 10 + 5 = 15
         * 10 - 5 = 5
         * 10 * 5 = 50
         *
         */
    }
}
