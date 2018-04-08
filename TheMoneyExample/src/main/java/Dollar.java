public class Dollar extends Money{
    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    Money times(int mulitpler) {
        return new Dollar(amount * mulitpler);
    }
}
