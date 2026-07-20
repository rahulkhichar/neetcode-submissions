class Solution {
    public boolean isValid(String s) {

        Stack<Character>st = new Stack<>();

        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if(!st.isEmpty()) {
                char top = st.peek();
                if(ch == ')' && top == '(' ) st.pop();
                else if(ch == '}' && top == '{') st.pop();
                else if(ch == ']' && top == '[') st.pop();
                else {
                  st.push(ch);
                }
    
            } else {
                return false;
            }
        }

        if(!st.isEmpty()) return false;
        return true;
        
    }
}
