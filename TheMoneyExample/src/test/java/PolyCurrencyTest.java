import org.junit.Test;
import static junit.framework.TestCase.*;

public class PolyCurrencyTest {

    @Test
    public void testMultiplication() {
        // Given
        Dollar five = new Dollar(5);

        // When
        five.times(2);

        // Then
        assertEquals(10, five.amount);

        five.times(3);

        assertEquals(15,five.amount);
    }

}
