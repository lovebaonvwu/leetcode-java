class Solution {
    public int findPeakElement(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;

        while (lo < hi) {
            int mid = (lo + hi) >> 1;

            if (nums[mid] < nums[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        return lo;
    }
}

// class Solution {
//     public int findPeakElement(int[] nums) {
//         if (nums.length == 1)
//             return 0;
//         if (nums[0] > nums[1])
//             return 0;
//         if (nums[nums.length - 1] > nums[nums.length - 2])
//             return nums.length - 1;

//         for (int i = 1, j = 2; j < nums.length; ++i, ++j) {
//             if (nums[i] > nums[j] && nums[i] > nums[i - 1]) {
//                 return i;
//             }
//         }

//         return -1;
//     }
// }

// class Solution {
//     public int findPeakElement(int[] nums) {
//         if (nums.length == 1)
//             return 0;
//         if (nums[0] > nums[1])
//             return 0;
//         if (nums[nums.length - 1] > nums[nums.length - 2])
//             return nums.length - 1;

//         int i = 1;
//         for (int j = 2; j < nums.length; ++j) {
//             if (nums[i] > nums[j] && nums[i] > nums[i - 1]) {
//                 return i;
//             }

//             ++i;
//         }

//         return -1;
//     }
// }