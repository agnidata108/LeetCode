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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> output=new ArrayList<>();
        
        traverse(root,output); //Recursion starter
        
        return output;
    }

    void traverse(TreeNode root,List<Integer> output)
    {
        if(root==null)
            return; // Node nahi hai toh aage kuch nahi karna

        output.add(root.val); // Pehle current node ki value add karo
        
        traverse(root.left,output); // Phir left subtree traverse karo
        
        traverse(root.right,output); // Last mein right subtree traverse karo
    }
}
