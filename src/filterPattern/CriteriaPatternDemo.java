package filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert","Male","Single"));
        persons.add(new Person("John","Male","Married"));
        persons.add(new Person("Laura","Female","Married"));
        persons.add(new Person("Diana","Female","Single"));
        persons.add(new Person("Mike","Male","Single"));
        persons.add(new Person("Bobby","Male","Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();

        Criteria singleMale = new AndCriteria(single, male);
        OrCriteria singleOrFemale = new OrCriteria(single, female);
        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));


        /**
         *  执行结果如下：
         *  Males:
         * Person : [ Name : Robert, Gender : Male, Marital Status : Single ]
         * Person : [ Name : John, Gender : Male, Marital Status : Married ]
         * Person : [ Name : Mike, Gender : Male, Marital Status : Single ]
         * Person : [ Name : Bobby, Gender : Male, Marital Status : Single ]
         *
         * Females:
         * Person : [ Name : Laura, Gender : Female, Marital Status : Married ]
         * Person : [ Name : Diana, Gender : Female, Marital Status : Single ]
         *
         * Single Males:
         * Person : [ Name : Robert, Gender : Male, Marital Status : Single ]
         * Person : [ Name : Mike, Gender : Male, Marital Status : Single ]
         * Person : [ Name : Bobby, Gender : Male, Marital Status : Single ]
         *
         * Single Or Females:
         * Person : [ Name : Robert, Gender : Male, Marital Status : Single ]
         * Person : [ Name : Diana, Gender : Female, Marital Status : Single ]
         * Person : [ Name : Mike, Gender : Male, Marital Status : Single ]
         * Person : [ Name : Bobby, Gender : Male, Marital Status : Single ]
         * Person : [ Name : Laura, Gender : Female, Marital Status : Married ]
         */



    }


    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
