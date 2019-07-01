package businessDelegatePattern;

/**
 * @author zhangh
 * @create 2019-07-01
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
