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
    List<Integer> res = new ArrayList<>();

    // public List<Integer> inorderTraversal(TreeNode root) {

    // if(root ==  null)
    //   return res;
    //  inorderTraversal(root.left);
    //  res.add(root.val);
    // inorderTraversal(root.right);

    //  return res;

    //   }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return res;

        Deque<TreeNode> stack = new ArrayDeque<>();

        //stack.add(root);
        
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
         
            
            while( curr != null){
                stack.push(curr);
                curr = curr.left;
            }
           
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }

        return res;
    }
}
