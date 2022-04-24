package Visitor;

public class VisitorDemo {
    public static void main(String[] args) {

        GuitarPart guitar = new Guitar();
        guitar.accept(new GuitarPartConcreteVisitor());

    }
}
