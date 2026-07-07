class Solution {
    public void reverseString(char[] s) {

        int length = s.length;

        for(int index = 0 ;index < length / 2 ;index ++) {
            char temp = s[index];
            s[index] = s[length - index - 1];
            s[length - index - 1] = temp;
        }
        return ;
        
    }
}