package Visitor;

// Concrete Element B of the Visitor Pattern
public class Pickups implements GuitarPart {

    @Override
    public void accept(GuitarPartVisitor guitarPartVisitor) {
        guitarPartVisitor.visit(this);
    }
}
