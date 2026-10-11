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
    public boolean isSameTree(TreeNode p,TreeNode q) {
        // dono khali hain, toh same hain true
        if(p==null&&q==null)
            return true;

        // agar ek khali hai aur dusra nhi to false
        if(p==null||q==null)
            return false; 

        // values alag hain toh tree same nhi -> false
        if(p.val!=q.val)
            return false;

        // left side same nahi hai -> false
        if(!isSameTree(p.left,q.left))
            return false;

        // right side same nahi hai -> false 
        if(!isSameTree(p.right,q.right))
            return false;

        return true; // dono sides same, toh tree bhi same
        
    }
}