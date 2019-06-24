package filterPattern;

import java.util.List;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);

}
