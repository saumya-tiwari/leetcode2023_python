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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        postorderTraversal(root, list);
        return list;
    }
    
    public void postorderTraversal(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        postorderTraversal(root.left, list);
        postorderTraversal(root.right, list); 
        list.add(root.val);
          

    }
}