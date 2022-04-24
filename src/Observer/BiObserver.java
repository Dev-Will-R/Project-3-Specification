package Observer;

// Concrete observer A of the Observer Pattern
public class BiObserver extends Observer{

    public BiObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Binary output: " + Integer.toBinaryString(subject.getStateValue()));
    }
}
