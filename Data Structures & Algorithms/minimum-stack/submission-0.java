class MinStack {

    int  []stack;
    int lastIndex;
    Stack<Integer>st;

    public MinStack() {
       stack = new int[50000];
       lastIndex = -1;
       st = new Stack<>();
        
    }
    
    public void push(int val) {
        lastIndex++;
        stack[lastIndex] = val;
        if(st.isEmpty()) {
            st.push(lastIndex);
        } else if(val < stack[st.peek()]){
            st.push(lastIndex);
        }
        
    }
    
    public void pop() {
        if(lastIndex == -1) return ;
        if(st.peek() == lastIndex) st.pop();
        lastIndex--;
        
    }
    
    public int top() {

        if(lastIndex == -1) return -1;
        return  stack[lastIndex];
        
    }
    
    public int getMin() {
        if(!st.isEmpty()) {
            return stack[st.peek()];
        }
        
        return -1;
        
    }
}
