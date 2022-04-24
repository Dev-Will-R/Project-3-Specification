package Visitor;

// Visitor of the Visitor Pattern
public interface GuitarPartVisitor {
    public void visit(Guitar guitar);
    public void visit(Strings string);
    public void visit(Pickups pickup);
    public void visit(AudioJack audioJack);

}
