class Solution {
    public String mergeAlternately(String word1, String word2) {

        String ans = new String();
        int lengthOfFirstString = word1.length();
        int lengthOfSecondString = word2.length();
        int index1 = 0;
        int index2 = 0;

        while(index1 < lengthOfFirstString && index2 < lengthOfSecondString ) {
            ans +=  word1.charAt(index1);
            ans += word2.charAt(index2);
            index1++;
            index2++;

        }

        while(index1 < lengthOfFirstString ) {
            ans +=  word1.charAt(index1);
            index1++;
        }
         while(index2 < lengthOfSecondString ) {
            ans +=  word2.charAt(index2);
            index2++;
        }

        return ans;
        
    }
}