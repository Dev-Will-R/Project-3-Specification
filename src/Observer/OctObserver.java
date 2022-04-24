package Observer;

// Concrete observer B of the Observer Pattern
public class OctObserver extends Observer{

    public OctObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Octal output: " + Integer.toOctalString(subject.getStateValue()));
    }
}
