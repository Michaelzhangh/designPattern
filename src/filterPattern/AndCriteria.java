package filterPattern;

import java.util.List;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria,Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCirteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCirteriaPersons);
    }
}
