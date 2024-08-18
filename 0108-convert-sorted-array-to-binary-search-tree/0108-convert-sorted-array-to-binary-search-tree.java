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
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums,0,nums.length-1);
    }

    TreeNode toBST(int[] nums, int si, int ei){
        if(si > ei) return null;
        int mid = (si + ei)/2;
        TreeNode nn = new TreeNode(nums[mid]);
        nn.left = toBST(nums, si, mid-1);
        nn.right = toBST(nums, mid+1, ei);
        return nn;
    }
}