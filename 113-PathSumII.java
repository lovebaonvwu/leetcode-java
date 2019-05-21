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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        findPath(root, sum, list, ans);
        
        return ans;
    }
    
    private void findPath(TreeNode root, int sum, ArrayList<Integer> list, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }
        
        list.add(root.val);
        sum -= root.val;
        
        if (root.left == null && root.right == null && sum == 0) {
            ans.add((ArrayList<Integer>)list.clone());
        }
        
        findPath(root.left, sum, list, ans);
        findPath(root.right, sum, list, ans);
        
        list.remove(list.size() - 1);
    }
} // 1ms

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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        findPath(root, sum, list, ans);
        
        return ans;
    }
    
    private void findPath(TreeNode root, int sum, ArrayList<Integer> list, List<List<Integer>> ans) {
        if (root == null) {
            return;
        }
        
        list.add(root.val);
        sum -= root.val;
        
        if (root.left == null && root.right == null && sum == 0) {
            ans.add(new ArrayList<Integer>(list));
        }
        
        findPath(root.left, sum, list, ans);
        findPath(root.right, sum, list, ans);
        
        list.remove(list.size() - 1);
    }
} // 1ms