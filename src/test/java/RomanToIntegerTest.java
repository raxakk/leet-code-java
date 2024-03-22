import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    @Test
    void romanToInt() {
        assertEquals(1994, RomanToInteger.romanToInt("MCMXCIV"));
    }
}