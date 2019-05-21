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
    private TreeNode prev;
    
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        
        flatten(root.right);
        flatten(root.left);
        
        root.right = prev;
        root.left = null;
        
        prev = root;
    }
} // 0ms

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
    public void flatten(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        preorderDfs(root, queue);
        
        root = null;
        TreeNode cur = root;
        
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (cur == null) {
                cur = node;
                root = cur;
            } else {
                cur.right = node;
            }
            
            cur = node;
        }
    }
    
    private void preorderDfs(TreeNode root, ArrayDeque<TreeNode> queue) {
        if (root == null) {
            return;
        }
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        root.left = null;
        root.right = null;
        
        queue.add(root);
        
        preorderDfs(left, queue);
        preorderDfs(right, queue);
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
    public void flatten(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        preorderDfs(root, queue);
        
        root = null;
        TreeNode cur = root;
        
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (cur == null) {
                System.out.println(node.val);
                cur = node;
                root = cur;
            } else {
                cur.right = node;
            }
            
            cur = node;
        }
    }
    
    private void preorderDfs(TreeNode root, LinkedList<TreeNode> queue) {
        if (root == null) {
            return;
        }
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        root.left = null;
        root.right = null;
        
        queue.add(root);
        
        preorderDfs(left, queue);
        preorderDfs(right, queue);
    }
} // 4ms