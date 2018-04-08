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
        assertEquals(Money.dollar(5), Money.dollar(5));
    }

    @Test
    public void testNotEqual() {
        assertNotEquals(Money.dollar(5), Money.dollar(6));
    }

    @Test
    public void testEqualityFranc() {
        assertEquals(Money.franc(5), Money.franc(5));
    }

    @Test
    public void testNotEqualFranc() {
        assertNotEquals(Money.franc(5), Money.franc(6));
    }

    @Test
    public void francDoesNotEqualDollar() {
        assertNotEquals(Money.franc(5),Money.dollar(5));
    }

    @Test
    public void testIfCurrencyIsCorrect() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
