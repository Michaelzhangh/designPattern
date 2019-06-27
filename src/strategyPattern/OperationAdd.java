package strategyPattern;

/**
 * @author zhangh
 * @create 2019-06-27
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
