class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character>st = new HashSet<>();
        int n = s.length();
        int j = 0;
        int ans = 0;

        for(int index = 0 ;index < n ;index++) {

            while(st.contains(s.charAt(index))) {
                st.remove(s.charAt(j));
                j++;
            }
            ans = Math.max(ans,index - j+1);

            st.add(s.charAt(index));
        }

        return ans;


    }
}
