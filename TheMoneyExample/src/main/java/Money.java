public abstract class Money {
    protected String currency;
    protected int amount;

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

    abstract Money times(int multiplier);

    String currency(){
        return currency;
    }
}
