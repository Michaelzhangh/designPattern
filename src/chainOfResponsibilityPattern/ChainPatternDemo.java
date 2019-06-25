package chainOfResponsibilityPattern;

/**
 * @author zhangh
 * @create 2019-06-25
 */
public class ChainPatternDemo {

    public static AbstractLogger getChainOfLoggers(){
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }


    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO ,"This is an information.");
        System.out.println("-------------我是分割线-----------------");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is a debug level information.");
        System.out.println("-------------我是分割线-----------------");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.");

        /**
         * 执行结果如下：
         * Standard Console::Logger: This is an information.
         * -------------我是分割线-----------------
         * File::Logger: This is a debug level information.
         * Standard Console::Logger: This is a debug level information.
         * -------------我是分割线-----------------
         * Error Console::Logger: This is an error information.
         * File::Logger: This is an error information.
         * Standard Console::Logger: This is an error information.
         */


    }

}
