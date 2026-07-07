class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndex  = nums1.length - 1;
        int firstArrayLastIndex = m - 1 ;
        int secondArrayLstIndex = n - 1;
        while( firstArrayLastIndex >= 0 && secondArrayLstIndex >= 0 ) {
            if(nums1[firstArrayLastIndex] >  nums2[secondArrayLstIndex]) {
                nums1[lastIndex] = nums1[firstArrayLastIndex];
                lastIndex--;
                firstArrayLastIndex--;
            } else {
                nums1[lastIndex] = nums2[secondArrayLstIndex];
                lastIndex--;
                secondArrayLstIndex--;
            }
        }

        while( firstArrayLastIndex >= 0 ) {
                nums1[lastIndex] = nums1[firstArrayLastIndex];
                lastIndex--;
                firstArrayLastIndex--;
        }

          while(  secondArrayLstIndex >= 0 ) {
                nums1[lastIndex] = nums2[secondArrayLstIndex];
                lastIndex--;
                secondArrayLstIndex--;
        }
        
    }
}