import org.example.Util;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestIsAllPositive {

    @Test
    public void testIsAllPositiveNumber() {
        assertTrue(Util.isAllPositiveNumbers("123","1024"));
    }

    @Test
    public void testIsAllNotPositiveNumber() {
        assertFalse(Util.isAllPositiveNumbers("-123","345"));
    }
}
