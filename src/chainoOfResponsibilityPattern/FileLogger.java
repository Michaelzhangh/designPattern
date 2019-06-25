package chainoOfResponsibilityPattern;

/**
 * @author zhangh
 * @create 2019-06-25
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
