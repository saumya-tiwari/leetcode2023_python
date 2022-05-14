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
        
       // if(root == null)
          //  return 0;
        
      // int lDepth = maxDepth(root.left);
      // int rDepth = maxDepth(root.right);
        
        //adding one because that will be depth of the single node tree and then adding that to max of left
        //and right subtree
      // return Math.max(lDepth, rDepth) + 1;
      
         if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        int level = 0;
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            for(int i  = 0; i <size; i++){
                TreeNode node = q.poll();
                
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                
            }
            
            level += 1;
            
            
            
        }
        
        return level;
    }
}