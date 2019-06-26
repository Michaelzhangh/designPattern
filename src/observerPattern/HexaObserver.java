package observerPattern;

/**
 * @author zhangh
 * @create 2019-06-26
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject =subject;
        this.subject.attach(this);
    }


    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
