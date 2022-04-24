package Bridge;

// Abstraction of the Bridge Pattern
abstract class TradingCard {
    protected CardStore store1;
    protected CardStore store2;

    protected TradingCard(CardStore store1, CardStore store2) {
        this.store1 = store1;
        this.store2 = store2;
    }

    abstract public void handle();
}
