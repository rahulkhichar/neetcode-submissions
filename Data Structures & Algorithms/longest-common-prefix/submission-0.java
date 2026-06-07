class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length; 
        String ans = strs[0];

        for(int i = 1 ;i <n;i++) {
            int firstIndex = 0 ;
            int secondIndex = 0;
            int firstLength = ans.length();
            int secondLength = strs[i].length();
            

            while(firstIndex < firstLength && secondIndex < secondLength && ans.charAt(firstIndex) == strs[i].charAt(secondIndex)) {
                firstIndex++;
                secondIndex++;
            }
            ans = ans.substring(0,firstIndex);

        }
        return ans;
        
    }
}