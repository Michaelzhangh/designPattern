package visitorPattern;

/**
 * @author zhangh
 * @create 2019-06-27
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
