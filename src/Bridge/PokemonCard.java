package Bridge;

// Refined abstraction A of the Bridge Pattern
public class PokemonCard extends TradingCard {

    public PokemonCard(CardStore store1, CardStore store2) {
        super(store1, store2);
    }

    @Override
    public void handle() {
        System.out.print("Pokemon card ");
        store1.handleCard();
        store2.handleCard();
    }
}
