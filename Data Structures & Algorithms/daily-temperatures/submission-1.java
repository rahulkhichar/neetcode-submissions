class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int lastIndex = temperatures.length - 1;
        Stack<Integer>st = new Stack<>();
        int []ans = new int[lastIndex+1];

        for(int index = lastIndex ; index >= 0 ; index--) {

            while(!st.isEmpty() && temperatures[index] >= temperatures[st.peek()]) {
                st.pop();
            }
            if(st.isEmpty()) ans[index] = 0;
            else ans[index] = st.peek() - index;
            st.push(index);

        }
        return ans;
        
    }
}
