import java.util.*;

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> s = new HashSet<>();
        return inorder(root, k, s);
    }
    private boolean inorder(TreeNode root, int k, HashSet<Integer> s) {
        if (root == null) return false;
        if (s.contains(k - root.val)) return true;
        s.add(root.val);
        return inorder(root.left, k, s) || inorder(root.right, k, s);
    }
}
