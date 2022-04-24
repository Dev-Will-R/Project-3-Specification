package Visitor;

// Concrete Element A of the Visitor Pattern
public class Strings implements GuitarPart {

    @Override
    public void accept(GuitarPartVisitor guitarPartVisitor) {
        guitarPartVisitor.visit(this);
    }
}
