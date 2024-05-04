import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathUtilsTest {
    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @After
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
        assertEquals(-1.0, mathUtils.divide(9, 0), 0.0);
    }
}
