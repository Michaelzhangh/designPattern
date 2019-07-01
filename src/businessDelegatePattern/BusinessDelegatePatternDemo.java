package businessDelegatePattern;

/**
 * @author zhangh
 * @create 2019-07-01
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();

        /**
         *  执行结果如下：
         *  Processing task by invoking EJB Service
         * Processing task by invoking JMS Service
         */
    }

}
