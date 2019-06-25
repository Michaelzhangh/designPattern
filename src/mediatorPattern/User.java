package mediatorPattern;

/**
 * @author zhangh
 * @create 2019-06-25
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this,message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
