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
    public int countNodes(TreeNode root) {
        return count(root, 0);
    }

    int count(TreeNode root, int c){
        if(root == null) return 0;
        int left = count(root.left, c+1);
        int right = count(root.right, c+1);
        return left+right+1;
    }
}