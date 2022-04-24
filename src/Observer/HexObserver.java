package Observer;

// Concrete observer C of the Observer Pattern
public class HexObserver extends Observer{

    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Hexadecimal output: " + Integer.toHexString(subject.getStateValue()));
    }
}
