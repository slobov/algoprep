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
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }
    
    public int sum(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        
        if (node.left == null && node.right == null) {
            return sum * 10 + node.val;
        }
        
        return sum(node.left, sum * 10 + node.val)
            + sum(node.right, sum * 10 + node.val);
    }
}
