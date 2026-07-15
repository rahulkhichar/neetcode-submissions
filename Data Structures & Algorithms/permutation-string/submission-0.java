class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(m < n) return false;
        int[] mapA = new int[27];
        int[] mapB = new int[27];
        for(int index= 0 ;index < n ;index++) {

         mapA[s1.charAt(index) - 'a']++;
         mapB[s2.charAt(index) - 'a']++;

        }
        if(isMathc(mapA,mapB)) return true;

        for(int index = n; index < m; index++) {

            mapB[s2.charAt(index - n)-'a']--;
            mapB[s2.charAt(index)-'a']++;

            if(isMathc(mapA,mapB)) return true;
            

        }




        return false;
        
    }

    boolean isMathc(int []a,int []b) {
        for(int index = 0; index < 27; index++) {
            if(a[index]!= b[index]) return false;
        }
        return true;
    }
}
