class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int i = 0;
        int prev = 0;

        for (int j = 1; j < nums.length; ++j) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
                prev = i;
            } else if (i == prev) {
                nums[++i] = nums[j];
            }
        }

        return i + 1;
    }
}