class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];

        ans[0] = firstElement(nums, target);
        ans[1] = lastElement(nums, target);

        return ans;
    }

    private int firstElement(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) >> 1;

            if (nums[mid] == target) {
                if (mid > 0 && nums[mid - 1] == target) {
                    hi = mid - 1;
                } else {
                    return mid;
                }
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1;
    }

    private int lastElement(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) >> 1;

            if (nums[mid] == target) {
                if (mid < nums.length - 1 && nums[mid + 1] == target) {
                    lo = mid + 1;
                } else {
                    return mid;
                }
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1;
    }
}