import com.verezubov.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void testIsPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("123"));

    }
    @Test
    public void testIsNotPositiveNumber(){
        assertFalse(StringUtils.isPositiveNumber("-123"));
    }

}
