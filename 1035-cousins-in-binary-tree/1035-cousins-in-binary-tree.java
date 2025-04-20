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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) return false;
        TreeNode xx = Find(root, x);
        TreeNode yy = Find(root, y);
        return ((level(root, xx, 0) == level(root, yy, 0) && !sibling(root, xx, yy)));
    }
    TreeNode Find(TreeNode root, int x){
        if(root == null) return null;
        if(root.val == x) return root;
        TreeNode l = Find(root.left, x);
        if(l == null) return Find(root.right, x);
        return l;
    }
    int level(TreeNode root, TreeNode xx, int l){
        if(root == null) return 0;
        if(root == xx) return l;
        return Math.max(level(root.left, xx, l+1), level(root.right, xx, l+1));
    }
    boolean sibling(TreeNode root, TreeNode xx, TreeNode yy){
        if(root == null) return false;
        if(root.right == xx && root.left == yy || root.left == xx && root.right == yy) return true;
        return (sibling(root.left, xx, yy) || sibling(root.right, xx, yy));
    }
}