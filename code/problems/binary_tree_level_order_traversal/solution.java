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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root != null)
            q.offer(root);
        TreeNode cur = null;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> subList = new LinkedList<>();
            for(int i =0; i<size;i++){
                cur = q.poll();
                subList.add(cur.val);
                
                if(cur.left != null)
                    q.offer(cur.left);
                
                if(cur.right != null)
                    q.offer(cur.right);
            }
            list.add(subList);
        }
            return list;
    }
}