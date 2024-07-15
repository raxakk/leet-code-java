import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
        // Given
        String s = "([)]{}";
        // When
        boolean isValid = ValidParentheses.isValid3(s);
        // Then
        assertTrue(isValid);
    }
}