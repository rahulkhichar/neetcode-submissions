class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        if( n == 1 && m == 1) return matrix[0][0] == target;
        int findRow = 0;
        int start = 0;
        int end = matrix.length-1;
        while(start <= end) {
            int mid = (end - start)/2+start;

            if(target >= matrix[mid][0]) {
                findRow = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int startIndex = 0; 
        int endIndex = matrix[findRow].length - 1 ;

        while(startIndex <= endIndex) {
            int midIndex = (endIndex - startIndex)/2 + startIndex;
            if(matrix[findRow][midIndex] == target) return true;
            if(target > matrix[findRow][midIndex] ) startIndex = midIndex+1;
            else {
                endIndex = midIndex-1;
            }
        }

        System.out.println(findRow);


        return false;

        
    }
}
