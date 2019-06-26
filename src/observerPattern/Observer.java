package observerPattern;

/**
 * @author zhangh
 * @create 2019-06-26
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
