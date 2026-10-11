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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> output=new ArrayList<>();
        
        traverse(root,output);
        
        return output;
    }

    void traverse(TreeNode root,List<Integer> output)
    {
        if(root==null)
            return; // node hi nhi hai toh kuch nhi karna
        
        // INORDER : LEFT -> PARENT -> RIGHT 

        traverse(root.left,output); // pehle left LEFT pura dekhenge
        
        output.add(root.val); // ab current PARENT node ki value add karenge
        
        traverse(root.right,output); // ab RIGHT side pura dekhenge
    }
}
