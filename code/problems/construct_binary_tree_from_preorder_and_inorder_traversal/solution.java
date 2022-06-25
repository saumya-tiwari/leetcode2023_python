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
    int preorderIndex = 0;
    Map<Integer, Integer> map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        
        for(int i  = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        
        return arrayToTree(preorder, 0, preorder.length - 1);
        
    }
    
    TreeNode arrayToTree(int[] preorder, int left, int right){
        if( left > right) return null;
        
        int rootValue = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootValue);
        
       root.left = arrayToTree(preorder, left, map.get(rootValue) - 1);
        root.right = arrayToTree(preorder, map.get(rootValue) + 1, right);
        
        return root;
    }
}