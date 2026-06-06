class Solution {
    public boolean isAnagram(String s, String t) {

        int []firstString = new int[27];
        int []secondString = new int[27];
        for(char ch : s.toCharArray()) {
            firstString[ch - 'a']++;
        }
         for(char ch : t.toCharArray()) {
            secondString[ch - 'a']++;
        }

        for(int i = 0 ; i < 27;i++) {
            if(firstString[i] != secondString[i]) return false;
        }

        return true;

    }
}
