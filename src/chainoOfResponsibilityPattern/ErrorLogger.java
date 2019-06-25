package chainoOfResponsibilityPattern;

/**
 * @author zhangh
 * @create 2019-06-25
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }


    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
