package visitorPattern;

/**
 * @author zhangh
 * @create 2019-06-27
 */
public interface ComputerPartVisitor {

    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);


}
