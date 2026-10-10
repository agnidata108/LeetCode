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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> output=new ArrayList<>();
        
        traverse(root,output);
        
        return output;
    }

    void traverse(TreeNode root,List<Integer> output)
    {
        if(root==null)
            return; // node hi nhi hai toh kuch nhi karna
        
        // POSTORDER : LEFT -> RIGHT -> PARENT

        traverse(root.left,output); // pehle LEFT pura dekhenge

        traverse(root.right,output); // ab RIGHT side pura dekhenge
        
        output.add(root.val); // ab current PARENT node ki value add karenge

    }
}