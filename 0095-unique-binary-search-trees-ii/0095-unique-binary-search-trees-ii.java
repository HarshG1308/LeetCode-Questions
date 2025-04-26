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
    public List<TreeNode> generateTrees(int n) {
        HashMap<String, List<TreeNode>> memo = new HashMap<>();
        return solve(1, n, memo);
    }
    List<TreeNode> solve(int s,int e, HashMap<String, List<TreeNode>> memo){
        String key = s + "-" + e;
        List<TreeNode> trees = new ArrayList<>();
        if(s > e){
            trees.add(null);
            return trees;
        }
        if(memo.containsKey(key)) return memo.get(key);
        for(int i = s; i <= e; i++){
            List<TreeNode> left = solve(s,i - 1, memo);
            List<TreeNode> right = solve(i + 1, e , memo);
            for(TreeNode l : left){
                for(TreeNode r : right){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    trees.add(root);
                }
            }
        }
        memo.put(key, trees);
        return trees;
    }
}