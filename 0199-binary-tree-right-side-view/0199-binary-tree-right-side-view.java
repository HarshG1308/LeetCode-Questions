/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int maxd = 0;

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightView(root,1, ans);
        return ans;
    }

    public void rightView(TreeNode root, int curr_level, List<Integer> ans) {
        if (root == null) return ;
        if (curr_level > maxd) {
            ans.add(root.val);
            maxd = curr_level;
        }
        rightView(root.right, curr_level + 1, ans);
        rightView(root.left, curr_level + 1, ans);
    }
}