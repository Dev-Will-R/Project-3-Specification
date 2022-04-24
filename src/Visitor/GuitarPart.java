package Visitor;

// Element of the Visitor Pattern
public interface GuitarPart {
    public void accept(GuitarPartVisitor guitarPartVisitor);
}
