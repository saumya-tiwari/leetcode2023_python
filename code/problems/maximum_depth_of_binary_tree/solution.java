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
    public int ans;
    public int maxDepth(TreeNode root) {
        maxDepth(root, 1);
       return ans;          
    }
    
    public void maxDepth(TreeNode root, int depth) {
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            ans = Math.max(ans, depth);
        
        maxDepth(root.left, depth+1);
        maxDepth(root.right, depth+1);
    }
}