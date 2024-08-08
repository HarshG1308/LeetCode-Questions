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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root2 == null && root1 == null) return true;
        if(root2 == null || root1 == null) return false;
        if(root2.val != root1.val) return false;
        boolean flip = flipEquiv(root2.left, root1.right) && flipEquiv(root2.right, root1.left);
        boolean noflip = flipEquiv(root2.left, root1.left) && flipEquiv(root2.right, root1.right);
        return flip || noflip;
    }
}