class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int ans = 0;

        Arrays.sort(people);
        int startIndex = 0 ;
        int endIndex = n-1;
        while(startIndex < endIndex) {
            ans++;
            if(people[startIndex]+ people[endIndex] <= limit) 
            {
                startIndex++;
                endIndex--;
            } else {
                endIndex--;
            }
        }
        if(startIndex == endIndex) ans++;
        return ans;

        
    }
}