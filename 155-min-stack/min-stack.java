class MinStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public MinStack() {
       stack1 = new Stack<>();
       stack2 = new Stack<>();
    }
    
    public void push(int val) {
       if (stack2.isEmpty() || val <= stack2.peek()) {
           stack2.push(val);
       } 
       stack1.push(val);
    }
    
    public void pop() {
        if (stack1.peek().equals(stack2.peek())) {
            stack2.pop();
        }
        stack1.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
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