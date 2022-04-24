package Bridge;

// Concrete Implementor B of the Bridge Pattern
public class Display implements CardStore {

    @Override
    public void handleCard() {
        System.out.println("and placed on display.");
    }
}
