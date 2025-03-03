class MinStack {
    Stack<Integer> st=new Stack<>();
    Stack<Integer> mnst=new Stack<>();
    int mn=Integer.MAX_VALUE;

    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        mn=Math.min(mn,val);
        mnst.push(mn);
    }
    
    public void pop() {
        st.pop();
        mnst.pop();
        if(mnst.isEmpty())
        {
            mn=Integer.MAX_VALUE;
        }
        else
        mn=mnst.peek();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mnst.peek();
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