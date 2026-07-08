class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int ans = 0;

        int startIndex = 0;
        int endIndex = n - 1;
        while(startIndex < endIndex) {
            ans = Math.max(ans,(endIndex-startIndex)*Math.min(heights[startIndex],heights[endIndex]));
            if(heights[startIndex]< heights[endIndex]) {
                startIndex++;
            } else {
                endIndex--;
            }

        }
        return ans;


        
    }
}
