package chainoOfResponsibilityPattern;

/**
 * @author zhangh
 * @create 2019-06-25
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
