public class Dollar extends Money{

    private String currency;
    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    Money times(int mulitpler) {
        return new Dollar(amount * mulitpler);
    }

    String currency() {
        return currency;
    }
}
