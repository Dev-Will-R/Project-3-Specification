package Visitor;

// Concrete Visitor of the Visitor Pattern
public class GuitarPartConcreteVisitor implements GuitarPartVisitor {

    @Override
    public void visit(Guitar guitar) {
        System.out.println("This is the guitar.");
    }

    @Override
    public void visit(Strings string) {
        System.out.println("These are the strings.");
    }

    @Override
    public void visit(Pickups pickups) {
        System.out.println("These are the pickups.");
    }

    @Override
    public void visit(AudioJack audioJack) {
        System.out.println("This is the audio jack.");
    }
}
