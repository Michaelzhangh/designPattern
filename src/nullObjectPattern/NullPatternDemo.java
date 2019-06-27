package nullObjectPattern;

/**
 * @author zhangh
 * @create 2019-06-27
 */
public class NullPatternDemo {

    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());

        /**
         * 执行结果如下：
         * Customers
         * Rob
         * Not Available in Customer Database
         * Julie
         * Not Available in Customer Database
         *
         */
    }

}
