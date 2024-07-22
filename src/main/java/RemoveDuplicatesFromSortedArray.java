public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicatesSingleLoop(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[k] != nums[i + 1]) {
                k++;
                nums[k] = nums[i + 1];
            }
        }
        return k + 1;
    }

    public static int removeDuplicates(int[] nums) {
        int k = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != Integer.MIN_VALUE && nums[i] == nums[i + 1]) {
                k--;
                for (int j = i + 1; j < nums.length; j++) {
                    if (j + 1 >= nums.length) {
                        nums[j] = Integer.MIN_VALUE;
                    } else {
                        nums[j] = nums[j + 1];
                    }
                }
                i--;
            }
        }
        return k;
    }
}
