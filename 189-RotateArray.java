// Time: O(n)
// Space: O(1)
class Solution {
    public void rotate(int[] nums, int k) {

        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int lo, int hi) {
        while (lo < hi) {
            int temp = nums[lo];
            nums[lo] = nums[hi];
            nums[hi] = temp;

            ++lo;
            --hi;
        }
    }
}

// Time: O(n)
// Space: O(k)
// class Solution {
//     public void rotate(int[] nums, int k) {
//         k = k % nums.length;

//         int[] temp = new int[k];

//         for (int i = nums.length - k, j = 0; i < nums.length; ++i, ++j) {
//             temp[j] = nums[i];
//         }

//         for (int i = nums.length - 1; i >= k; --i) {
//             nums[i] = nums[i - k];
//         }

//         for (int i = 0; i < k; ++i) {
//             nums[i] = temp[i];
//         }
//     }
// }

// Time: O(n**k)
// Space: O(1)
// class Solution {
//     public void rotate(int[] nums, int k) {
//         k = nums.length - (k % nums.length);

//         for (int i = 0; i < k; ++i) {
//             int temp = nums[0];

//             for (int j = 0; j < nums.length - 1; ++j) {
//                 nums[j] = nums[j + 1];
//             }

//             nums[nums.length - 1] = temp;
//         }
//     }
// }