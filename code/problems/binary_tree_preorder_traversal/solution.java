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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> list = new ArrayList<>();
       preorderTraversal(root, list);
       return list;        
    }
    
    public void preorderTraversal(TreeNode root, List<Integer> list) {
        if(root == null)
            return;
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
    }
}