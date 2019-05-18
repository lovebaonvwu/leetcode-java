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
    public boolean isSymmetric(TreeNode root) {
        return isSameTree(root, root);
    }
    
    private boolean isSameTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        
        if (t1 == null || t2 == null) {
            return false;
        }
        
        return t1.val == t2.val && 
            isSameTree(t1.left, t2.right) && 
            isSameTree(t1.right, t2.left);
    }
}