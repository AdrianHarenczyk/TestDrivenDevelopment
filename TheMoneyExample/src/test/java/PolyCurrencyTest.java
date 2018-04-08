import org.junit.Test;
import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

public class PolyCurrencyTest {

    @Test
    public void testDollarMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
    }

    @Test
    public void testNotEqual() {
        assertNotEquals(new Dollar(5), new Dollar(6));
    }

    @Test
    public void testEqualityFranc() {
        assertEquals(new Franc(5), new Franc(5));
    }

    @Test
    public void testNotEqualFranc() {
        assertNotEquals(new Franc(5), new Franc(6));
    }

    @Test
    public void francDoesNotEqualDollar() {
        assertNotEquals(new Franc(5),new Dollar(5));
    }



}
