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
      ArrayList<TreeNode> ls = new ArrayList<>(); 
    public TreeNode increasingBST(TreeNode root) {
        recur(root);

        TreeNode fin = new TreeNode();
        TreeNode dummy =fin;
       for(TreeNode i: ls)
       {
        TreeNode mini = new TreeNode(i.val);
            fin.right= mini;
            fin= fin.right;
       }
        
        return dummy.right;
    }
    void recur(TreeNode root)
    {
        if(root==null)
        return;

        recur(root.left);

        ls.add(root);

        recur(root.right);
    }
}