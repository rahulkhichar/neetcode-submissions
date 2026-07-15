class Solution {
    public int characterReplacement(String s, int k) {

        int lengthOfString = s.length();
        if(lengthOfString <= 1) return lengthOfString;
        int ans = 0;

        for(int index = 0; index < lengthOfString ;index++) {

            Map<Character,Integer>mp = new HashMap<>();
            int maxFreq = 0;

            for(int j = index ; j < lengthOfString ; j++) {

                mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
                int count = mp.get(s.charAt(j));
                maxFreq = Math.max(maxFreq,count);

                if(j - index - maxFreq + 1 <= k ) {
                    ans = Math.max(j-index + 1,ans);
                } else {
                    break;
                }

            }
        }

        return ans;
        
    }
}
