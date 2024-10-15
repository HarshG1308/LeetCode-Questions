import java.util.HashSet;

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> seen = new HashSet<>();
        return inorder(root, k, seen);
    }

    private boolean inorder(TreeNode root, int k, HashSet<Integer> seen) {
        if (root == null) {
            return false;
        }

        if (seen.contains(k - root.val)) {
            return true;
        }

        seen.add(root.val);
        return inorder(root.left, k, seen) || inorder(root.right, k, seen);
    }
}
