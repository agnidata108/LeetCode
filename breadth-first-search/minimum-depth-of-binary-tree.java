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
    public int minDepth(TreeNode root) {
        // Base case : agar node is nhi h, depth => 0
        if(root==null)
        {
            return 0;
        }
        
        // Recursively right aur left subtree ka min depth find karenge
        int leftDepth=minDepth(root.left);
        int rightDepth=minDepth(root.right);
        
        if(root.left==null)
            return 1+rightDepth;

        if(root.right==null)
            return 1+leftDepth;
        
        // Total depth hoga = dono subtree ke min se + 1 (current)
        return 1 + Math.min(leftDepth, rightDepth);

    }
}