public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multipler) {
        return new Franc(amount * multipler);
    }

    @Override
    public boolean equals(Object obj) {
        Franc franc = (Franc) obj;
        return amount == franc.amount;
    }
}
