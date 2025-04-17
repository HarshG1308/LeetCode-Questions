/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        postorderHelper(root, ans);
        return ans;
    }

    void postorderHelper(Node root, List<Integer> ans) {
        if (root == null) return;
        for (Node child : root.children) {
            postorderHelper(child, ans);
        }
        ans.add(root.val);
    }
}
