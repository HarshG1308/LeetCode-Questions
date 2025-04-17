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
};
*/

class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        solve(root, ans);
        return ans;
    }
    void solve(Node root,List<Integer> ans){
        if(root == null) return;
        ans.add(root.val);
        for(int i = 0; i< root.children.size(); i++){
            solve(root.children.get(i), ans);
        }
    }
}