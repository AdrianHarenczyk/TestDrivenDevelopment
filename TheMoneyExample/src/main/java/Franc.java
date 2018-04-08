public class Franc extends Money{

    private String currency;
    public Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    public Money times(int multipler) {
        return new Franc(amount * multipler);
    }

    String currency() {
        return currency;
    }
}
