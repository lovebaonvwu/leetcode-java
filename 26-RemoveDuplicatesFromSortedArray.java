class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length < 2)
            return nums.length;

        int index = 1;
        int slow = 0;
        int fast = 1;

        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                nums[index++] = nums[fast];
                slow = fast;
            }

            ++fast;
        }

        return index;
    }
}