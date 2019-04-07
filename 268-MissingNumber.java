class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n; ++i) {
            sum += nums[i];
        }

        return (((0 + n) * (n + 1)) >> 1) - sum;
    }
}

// This is the best answer, but hard to understand.
// class Solution {
//     public int missingNumber(int[] nums) {
//         int miss = nums.length;
//         for (int i = 0; i < nums.length; i++) {
//             miss ^= i ^ nums[i];
//         }

//         return miss;
//     }
// }