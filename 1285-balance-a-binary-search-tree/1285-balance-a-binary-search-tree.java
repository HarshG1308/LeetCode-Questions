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
    List<Integer> arr = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return constr(root, 0, arr.size()-1);
    }
    TreeNode constr(TreeNode root, int s, int e){
        if(s > e) return null;
        int m = s + (e-s)/2;
        TreeNode n = new TreeNode(arr.get(m));
        n.left = constr(n, s, m-1);
        n.right = constr(n, m+1, e);
        return n;
    }
    void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }

}