class Solution {
    public boolean alphanumeric(char ch) {
        if(ch <='z' && ch >= 'a') return true;

        if(ch <= '9' && ch >= '0') return true;
        return false;

    }
    public boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();

        int lowerIndex = 0;
        int higherIndex = s.length() - 1;

        while( lowerIndex <  higherIndex) {
            while(lowerIndex <  higherIndex && !alphanumeric(lowerCase.charAt(lowerIndex))) lowerIndex++;
            while( lowerIndex <  higherIndex && !alphanumeric(lowerCase.charAt(higherIndex))) higherIndex--;
            if( lowerIndex < higherIndex && lowerCase.charAt(lowerIndex) != lowerCase.charAt(higherIndex) )
              return false;

            lowerIndex++;
            higherIndex--;

        }

        


        return true;
        
    }
}
