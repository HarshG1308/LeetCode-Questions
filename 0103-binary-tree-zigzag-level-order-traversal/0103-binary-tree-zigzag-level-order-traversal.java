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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Deque<TreeNode> q = new LinkedList<>();
        q.addFirst(root);
        boolean rev = false;
        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (!rev) {
                    TreeNode p = q.pollFirst();
                    res.add(p.val);
                    if (p.left != null)
                        q.addLast(p.left);
                    if (p.right != null)
                        q.addLast(p.right);
                } else {
                    TreeNode p = q.pollLast();
                    res.add(p.val);
                    if (p.right != null)
                        q.addFirst(p.right);
                    if (p.left != null)
                        q.addFirst(p.left);
                }
            }
            rev = !rev;
            ans.add(res);
        }
        return ans;
    }
}