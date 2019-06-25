package commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangh
 * @create 2019-06-25
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order:orderList) {
            order.execute();
        }
        orderList.clear();
    }



}
