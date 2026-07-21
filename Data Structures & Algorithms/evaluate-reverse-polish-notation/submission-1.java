class Solution {

    public int evalRPN(String[] tokens) {

       Stack<String> st = new Stack<>();

        for (String str : tokens) {
            switch (str) {
                case "+": {
                    int a = Integer.parseInt(st.pop());
                    int b = Integer.parseInt(st.pop());
                    st.push(Integer.toString(a + b));
                    break;
                }
                case "-": {
                    int a = Integer.parseInt(st.pop());
                    int b = Integer.parseInt(st.pop());
                    st.push(Integer.toString(b - a));
                    break;

                }
                case "*": {
                    int a = Integer.parseInt(st.pop());
                    int b = Integer.parseInt(st.pop());
                    st.push(Integer.toString(a * b));
                    break;

                }
                case "/": {
                    int a = Integer.parseInt(st.pop());
                    int b = Integer.parseInt(st.pop());
                    st.push(Integer.toString(b / a));
                    break;

                }
                default:
                    st.push(str);
            }

        }

        return Integer.parseInt(st.pop());
        
    }
}
