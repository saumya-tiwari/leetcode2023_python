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
    public boolean isValidBST(TreeNode root) {
        
        if(root == null)
            return true;
        
        
        return validate(root, null, null);       
        
    }
    
    boolean validate(TreeNode root, Integer left, Integer right){
        if(root == null)
            return true;
        
        if(left != null && root.val <= left || right != null && root.val >= right) return false;
        
        return validate(root.left, left, root.val) && validate(root.right, root.val, right);
    }
}