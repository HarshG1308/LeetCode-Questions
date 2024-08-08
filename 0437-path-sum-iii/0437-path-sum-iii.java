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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        int c = PathSum(root, targetSum);
        int left = pathSum(root.left, targetSum);
        int right = pathSum(root.right, targetSum);
        return left + right + c;
    }

    public int PathSum(TreeNode root, long targetSum) {
        if(root == null) return 0;
        int count = 0;
        if(root.val - targetSum == 0) count++;
        int  left = PathSum(root.left, targetSum - root.val);
        int right = PathSum(root.right, targetSum - root.val);
        return left + right + count;
    }
}