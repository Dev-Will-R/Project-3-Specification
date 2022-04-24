package Bridge;

public class BridgeDemo {
    public static void main(String[] args){
        TradingCard card1 = new PokemonCard(new Shipped(), new Display());
        card1.handle();
        TradingCard card2 = new MagicCard(new Shipped(), new Display());
        card2.handle();
    }
}
