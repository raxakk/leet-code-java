import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int k = RemoveElement.removeElement(nums, 2);
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }
}