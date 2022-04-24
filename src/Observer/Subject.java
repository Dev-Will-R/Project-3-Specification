package Observer;

import java.util.ArrayList;
import java.util.List;

// Subject for the Observer Pattern
public class Subject {

    public List<Observer> observers = new ArrayList<>();
    private int stateValue;

    public int getStateValue(){
        return stateValue;
    }

    public void setStateValue(int stateValue){
        this.stateValue = stateValue;
        notifyOfUpdate();
    }

    public void attach(Observer observ){
        observers.add(observ);
    }

    public void detach(Observer observ){
        observers.remove(observ);
    }

    public void notifyOfUpdate(){
        for(Observer observ : observers){
            observ.update();
        }
    }
}
