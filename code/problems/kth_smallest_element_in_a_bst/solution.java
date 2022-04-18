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
    public int kthSmallest(TreeNode root, int k) {
        
        List<Integer> list = new ArrayList<>();
        
        populateHeap(list, root);
        
        return list.get(k - 1);
        
        
        
    }
    
     public void populateHeap(List<Integer> heap, TreeNode root){
        if(root== null) return;
        
        populateHeap(heap, root.left);
        heap.add(root.val);
        populateHeap(heap, root.right);
        
    }
}