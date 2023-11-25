import com.verezubov.StringUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilTest {

    @Test
    public void testIsPositiveNumber() {
        assertTrue(StringUtil.isPositiveNumber("123"));

    }
    @Test
    public void testIsNotPositiveNumber(){
        assertFalse(StringUtil.isPositiveNumber("-123"));
    }

}
