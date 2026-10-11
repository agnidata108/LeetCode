/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        // Base case : agar node is empty, depth => 0
        if(root==null)
        {
            return 0;
        }
        
        // Recursively right aur left subtree ka depth find karenge
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        
        // Total depth hoga = dono subtree ke max se + 1 (current)
        return 1 + Math.max(leftDepth, rightDepth);

    }
}