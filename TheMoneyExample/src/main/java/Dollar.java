public class Dollar extends Money{



    public Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int mulitpler) {
        return new Dollar(amount * mulitpler);
    }
}
