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
import java.util.*;
class Solution {
    ArrayList<Integer> arr = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        helper(root);
        Collections.sort(arr);
        return arr.get(k-1);
    }
    void helper(TreeNode root){
        if(root == null) return;
        arr.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}