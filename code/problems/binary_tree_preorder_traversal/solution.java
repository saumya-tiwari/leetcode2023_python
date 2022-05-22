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

    //  public List<Integer> preorderTraversal(TreeNode root) {

    // if(root == null){
    //   return res;
    //     }

    //    res.add(root.val);
    //   preorderTraversal(root.left);
    //   preorderTraversal(root.right);

    //  return res;
    //   }

    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new ArrayDeque<>();

       // TreeNode curr = root;
        
        stack.add(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            res.add(curr.val);

           
            if(curr.right != null) stack.push(curr.right);
             if(curr.left != null) stack.push(curr.left);
        }

        return res;
    }
}
