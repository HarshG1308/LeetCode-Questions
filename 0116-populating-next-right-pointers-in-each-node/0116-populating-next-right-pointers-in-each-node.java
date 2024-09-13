/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return null;
        
        Node curr = root;
        while (curr.left != null) { // Traverse each level
            Node temp = curr; // Start with the current node
            while (curr != null) { // Traverse the current level
                curr.left.next = curr.right; // Connect left child to right child
                if (curr.next != null) { // Connect right child to the next left child
                    curr.right.next = curr.next.left;
                }
                curr = curr.next; // Move to the next node in the current level
            }
            curr = temp.left; // Move to the leftmost node of the next level
        }
        
        return root; // Return the root of the modified tree
    }
}