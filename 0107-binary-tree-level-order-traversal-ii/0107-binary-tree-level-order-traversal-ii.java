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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode p = q.poll();
                res.add(p.val);
                if (p.left != null)
                    q.offer(p.left);
                if (p.right != null)
                    q.offer(p.right);
            }
            ans.add(0, res);
        }
        return ans;
    }
}