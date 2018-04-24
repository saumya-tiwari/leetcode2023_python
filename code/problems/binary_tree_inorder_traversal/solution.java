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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list =  new LinkedList<>();
        inorderTraversal(root, list);
        return list;
        
    }
    
     public void inorderTraversal(TreeNode root, List<Integer> list) {
        if(root == null)
            return;
         inorderTraversal(root.left, list);
         list.add(root.val);
         inorderTraversal(root.right, list);
    }
}