package Visitor;

public class Pickups implements GuitarPart {

    @Override
    public void accept(GuitarPartVisitor guitarPartVisitor) {
        guitarPartVisitor.visit(this);
    }
}
