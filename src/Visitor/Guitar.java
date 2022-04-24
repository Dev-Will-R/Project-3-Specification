package Visitor;

public class Guitar implements GuitarPart {

    GuitarPart[] parts;

    public Guitar() {
        parts = new GuitarPart[] {new Strings(), new Pickups(), new AudioJack()};
    }

    @Override
    public void accept(GuitarPartVisitor guitarPartVisitor) {
        for (GuitarPart part : parts) {
            part.accept(guitarPartVisitor);
        }

        guitarPartVisitor.visit(this);
    }
}
