package Observer;

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
