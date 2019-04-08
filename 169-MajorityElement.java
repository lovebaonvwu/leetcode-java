
// O(n)
class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        int major = -1;

        for (int i = 0; i < nums.length; ++i) {
            if (cnt == 0) {
                major = nums[i];
                ++cnt;
            } else {
                if (major == nums[i])
                    ++cnt;
                else
                    --cnt;
            }
        }

        return major;
    }
}

// O(nlogn)
// class Solution {
//     public int majorityElement(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<Integer, Integer>();

//         for (int i = 0; i < nums.length; ++i) {

//             if (map.get(nums[i]) == null) {
//                 map.put(nums[i], 1);
//             } else {
//                 map.put(nums[i], map.get(nums[i]) + 1);
//             }
//         }

//         for (Integer key : map.keySet()) {
//             if (map.get(key) > nums.length / 2) {
//                 return key;
//             }
//         }

//         return -1;
//     }
// }