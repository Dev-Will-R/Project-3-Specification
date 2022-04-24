package Bridge;

// Concrete Implementor A of the Bridge Pattern
public class Shipped implements  CardStore {

    @Override
    public void handleCard() {
        System.out.print("shipped to store ");
    }
}
