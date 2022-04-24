package Visitor;

public class AudioJack implements GuitarPart {

    @Override
    public void accept(GuitarPartVisitor guitarPartVisitor) {
        guitarPartVisitor.visit(this);
    }
}
