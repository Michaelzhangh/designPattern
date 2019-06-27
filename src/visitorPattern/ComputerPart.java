package visitorPattern;

/**
 * @author zhangh
 * @create 2019-06-27
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
