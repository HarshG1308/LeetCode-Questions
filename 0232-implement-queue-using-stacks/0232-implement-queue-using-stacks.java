class MyQueue {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();
    
    public void push(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        // Push the new element onto s1
        s1.push(x);
        // Move all elements back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        // Pop the element from s1
        if (!s1.isEmpty()) {
            return s1.pop();
        } else {
            throw new RuntimeException("Queue is empty.");
        }
    }
    
    public int peek() {
        // Peek the element from s1
        if (!s1.isEmpty()) {
            return s1.peek();
        } else {
            throw new RuntimeException("Queue is empty.");
        }
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */