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
    public boolean isSymmetric(TreeNode root) {
        return Symmetric(root.left, root.right);
    }

    public boolean Symmetric(TreeNode root, TreeNode root1) {
        if(root == null && root1 == null) return true;
        if(root == null || root1 == null) return false;
        if(root.val != root1.val) return false;
        boolean left = Symmetric(root.left, root1.right);
        boolean right = Symmetric(root.right, root1.left);
        return left && right;
    }
}