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
   
    int i  = 0;
    List<Integer> list = new ArrayList<>();
    public void recoverTree(TreeNode root) {
      
        inorder(root, list);
        Collections.sort(list);
        createTree(root);
        
    }
    
    void inorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        inorder(node.left, list);
        list.add(node.val);
        inorder(node.right, list);
    }
    
    void createTree(TreeNode node){
        if(node == null) return;
        createTree(node.left);
        node.val = list.get(i);
        i++;
        createTree(node.right);
    }
}
