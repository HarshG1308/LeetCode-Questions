class MinStack {

    private Stack<Integer> st = new Stack<>();
    private Stack<Integer> minS = new Stack<>();
    
    public void push(int val) {
        st.push(val);
        if(minS.isEmpty() || val <= minS.peek()){
            minS.push(val);
        }
    }
    
    public void pop() {
        if (st.isEmpty()) return;
        int r = st.pop();
        if(r == minS.peek()) minS.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
       return minS.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */