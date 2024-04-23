import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        String[] strs = {"flof", "flofmmkmkmm", "flofflofmmkmkmm"};
        String longestCommonPrefix = LongestCommonPrefix.longestCommonPrefix(strs);
        assertEquals("flof", longestCommonPrefix);
    }
}