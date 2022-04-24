package Visitor;

public interface GuitarPart {
    public void accept(GuitarPartVisitor guitarPartVisitor);
}
