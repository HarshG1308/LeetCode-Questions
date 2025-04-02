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
    int ans = 0;
    public int minCameraCover(TreeNode root) {
        int x = solve(root);
        return x == -1 ? ++ans : ans; 
    }

    int solve(TreeNode root){
        if(root == null) return 0;
        int l = solve(root.left);
        int r = solve(root.right);
        if(l == -1 || r == -1){ans++; return 1;}
        else if(l == 1 || r == 1) return 0;
        else return -1;
    }
}