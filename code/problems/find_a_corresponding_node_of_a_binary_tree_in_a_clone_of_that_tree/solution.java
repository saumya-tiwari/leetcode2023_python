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
    TreeNode ans, target;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        inOrder(original, cloned);
        return ans;
    }
    
    private void inOrder(final TreeNode o, final TreeNode c){
        if(o != null){
            inOrder(o.left, c.left);
            if(o ==target)
                ans = c;
             inOrder(o.right, c.right);
        }
       
    }
}
