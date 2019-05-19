/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }
    
    private TreeNode buildTree(int[] nums, int begin, int end) {
        if (begin > end) {
            return null;
        }
        
        if (begin == end) {
            return new TreeNode(nums[begin]);
        }
        
        int mid = (begin + end) >> 1;
        TreeNode node = new TreeNode(nums[mid]);
        
        node.left = buildTree(nums, begin, mid - 1);
        node.right = buildTree(nums, mid + 1, end);
        
        return node;
    }
}