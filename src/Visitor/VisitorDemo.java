package Visitor;

// Main class to allow for demonstration of the Visitor program
public class VisitorDemo {
    public static void main(String[] args) {

        GuitarPart guitar = new Guitar();
        guitar.accept(new GuitarPartConcreteVisitor());

    }
}
