/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        if(node.neighbors.isEmpty()) return new Node(node.val);

        HashMap<Node, Node> copy = new HashMap<>();
        Stack<Node> q = new Stack<>();

        copy.put(node, new Node(node.val));
        q.push(node);

        while(!q.isEmpty()){
            Node rv = q.pop();
            for(Node n : rv.neighbors){
                if(!copy.containsKey(n)){
                    q.push(n);
                    copy.put(n, new Node(n.val));
                }
                copy.get(rv).neighbors.add(copy.get(n));
            }
        }
        return copy.get(node);
    }
}