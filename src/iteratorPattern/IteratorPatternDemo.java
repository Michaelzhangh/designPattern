package iteratorPattern;

/**
 * @author zhangh
 * @create 2019-06-25
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            String name = (String) iterator.next();
            System.out.println("Name: "+name);
        }

    }

    /**
     * 执行结果如下：
     *
     * Name: Robert
     * Name: John
     * Name: Julie
     * Name: Lora
     *
     *
     */

}
