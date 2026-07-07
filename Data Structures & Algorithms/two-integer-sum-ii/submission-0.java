class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int startIndex = 0;
        int endIndex = numbers.length - 1;

        while( startIndex <=  endIndex) {
            int sums = numbers[startIndex] + numbers[endIndex];
            if(sums == target) return new int[]{startIndex+1,endIndex+1};
            else if( sums < target) startIndex++;
            else endIndex--;
        }
        return new int[]{0,0};
        
    }
}
