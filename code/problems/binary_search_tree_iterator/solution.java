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
class BSTIterator {
    
    List<Integer> itr;
    int k;
    
    public void inOrder(TreeNode root, List<Integer> itr){
        if(root == null)
            return;
        inOrder(root.left, itr);
        itr.add(root.val);
        inOrder(root.right, itr);
    }

    public BSTIterator(TreeNode root) {  
        this.itr = new ArrayList<>();
        inOrder(root, itr);  
        this.k = -1;
    }
    
    public int next() {
        ++k;
        return itr.get(k);    
    }
    
    public boolean hasNext() {       
        return itr.size() > 0 && k < itr.size() - 1;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */