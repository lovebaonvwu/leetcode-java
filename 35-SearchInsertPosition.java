class Solution {
    public int searchInsert(int[] nums, int target) {

        if (target < nums[0])
            return 0;
        if (target > nums[nums.length - 1])
            return nums.length;

        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) >> 1;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return lo;
    }
}