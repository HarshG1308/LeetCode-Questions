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
    public int findBottomLeftValue(TreeNode root) {
         return findBottomLeftValueHelper(root, 1, new int[]{0, 0}); 
    }

    private int findBottomLeftValueHelper(TreeNode node, int depth, int[] res) {
        if (node == null) return res[1];
        if (depth > res[0]) {
            res[0] = depth;
            res[1] = node.val;
        }
        findBottomLeftValueHelper(node.left, depth + 1, res);
        findBottomLeftValueHelper(node.right, depth + 1, res);
        return res[1];
    }
}