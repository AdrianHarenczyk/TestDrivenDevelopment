public class Money {
    protected String currency;
    protected int amount;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount
                && getClass().equals(money.getClass());
    }

    Money times(int multiplier) {
        return null;
    }

    String currency(){
        return currency;
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
