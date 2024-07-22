import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {
        int[] nums = {1, 2, 2, 2, 3, 4};
        int k = RemoveDuplicatesFromSortedArray.removeDuplicatesSingleLoop(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }
}