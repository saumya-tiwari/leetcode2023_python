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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
       
        
      // if( p.val > root.val  && root.val < q.val)
        //   return lowestCommonAncestor(root.right, p, q);
        
     //   else if( root.val > p.val && root.val > q.val)
     //      return lowestCommonAncestor(root.left, p, q);
        
     //   else
         //  return root;
        
        TreeNode node = root;
        
        
        while(node != null){
            
            if(node.val > q.val && node.val > p.val)
                node = node.left;
            else if(node.val < q. val && node.val < p.val)
                node = node.right;
            
            else
                return node;
            
            
        }
        
        
        return root;
        
        
        
        
    }
}