import java.util.*;

class Solution {
    int cnt = 0;
    int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return result;
    }

    void helper(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        // Traverse the left subtree
        helper(root.left, k);

        // Increment the counter
        cnt++;

        // If we've reached the k-th smallest element
        if (cnt == k) {
            result = root.val;
            return;
        }

        // Traverse the right subtree
        helper(root.right, k);
    }
}
