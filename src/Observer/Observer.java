package Observer;

// Observer of the Observer Pattern
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
