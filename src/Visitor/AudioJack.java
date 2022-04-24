package Visitor;

// Concrete Element C of the Visitor Pattern
public class AudioJack implements GuitarPart {

    @Override
    public void accept(GuitarPartVisitor guitarPartVisitor) {
        guitarPartVisitor.visit(this);
    }
}
