package Bridge;


// Refined abstraction B of the Bridge Pattern
public class MagicCard extends TradingCard {

    public MagicCard(CardStore store1, CardStore store2) {
        super(store1, store2);
    }

    @Override
    public void handle() {
        System.out.print("Magic the Gathering card ");
        store1.handleCard();
        store2.handleCard();
    }
}
