import org.example.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestIsAllPositive {

    @Test
    public void testIsAllPositiveNumber() {
        assertTrue(Utils.isAllPositiveNumbers("123","1024"));
        assertFalse(Utils.isAllPositiveNumbers("-123","345"));
    }
}
