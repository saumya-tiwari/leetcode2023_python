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

    public int deepestLeavesSum(TreeNode root) {
        int maxDepth = findMaxDepth(root);
        //System.out.println(maxDepth);

        int level = 1;

        int sum = 0;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            System.out.println(size);

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();

                TreeNode left = node.left;
                TreeNode right = node.right;

                if (left != null) q.add(left);
                if (right != null) q.add(right);

                if (level == maxDepth) {
                  sum += node.val;
                }
            }

            level += 1;
              
        }

        return sum;
    }

    private int findMaxDepth(TreeNode node) {
        if (node == null) return 0;
        int left = findMaxDepth(node.left);
        int right = findMaxDepth(node.right);

        return Math.max(left, right) + 1;
    }
}
