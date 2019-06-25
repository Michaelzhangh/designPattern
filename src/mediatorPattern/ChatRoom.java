package mediatorPattern;

import java.util.Date;

/**
 * @author zhangh
 * @create 2019-06-25
 */
public class ChatRoom {

    public static void showMessage(User user,String message){
        System.out.println(new Date().toString() + " [" + user.getName() +"] : " + message);
    }



}
