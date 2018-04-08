import org.junit.Test;
import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

public class PolyCurrencyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15),five.times(3));
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
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void francDoesNotEqualDollar() {
        assertNotEquals(new Franc(5),new Dollar(5));
    }

}
