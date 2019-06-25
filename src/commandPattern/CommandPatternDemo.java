package commandPattern;

/**
 * @author zhangh
 * @create 2019-06-25
 */
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStock = new BuyStock(abcStock);
        SellStock sellStock = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();

        /**
         *  执行结果如下：
         *
         * Stock [ Name: ABC,Quantity: 10 ] bought
         * Stock [ Name: ABC,Quantity: 10 ] sold
         *
         */

    }
}
