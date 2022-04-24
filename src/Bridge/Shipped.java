package Bridge;

public class Shipped implements  CardStore {

    @Override
    public void handleCard() {
        System.out.print("shipped to store ");
    }
}
