import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {
    private MathUtils mathUtils;

    @BeforeEach
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    public void tearDown() {
        mathUtils = null;
    }

    @Test
    public void testAdd() {
        assertEquals(8, mathUtils.add(2, 6));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, mathUtils.subtract(5, 4));
    }

    @Test
    public void testMultiply() {
        assertEquals(25, mathUtils.multiply(5, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(3.0, mathUtils.divide(9, 3), 0.0);
        assertEquals(Double.NEGATIVE_INFINITY, mathUtils.divide(9, 0), 0.0);
    }
}
