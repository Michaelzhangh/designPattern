package observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangh
 * @create 2019-06-26
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer:observers) {
            observer.update();
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
}
