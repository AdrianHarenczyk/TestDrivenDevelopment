public class Dollar extends Money{



    public Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int mulitpler) {
        return new Dollar(amount * mulitpler);
    }

    String currency() {
        return "USD";
    }
}
