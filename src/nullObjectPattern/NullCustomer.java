package nullObjectPattern;

/**
 * @author zhangh
 * @create 2019-06-27
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
