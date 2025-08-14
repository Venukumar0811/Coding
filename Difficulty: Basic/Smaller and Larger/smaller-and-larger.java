// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
         int n = arr.length;
        
        int countLessOrEqual = upperBound(arr, target);
        int countGreaterOrEqual = n - lowerBound(arr, target);
        
        return new int[] {countLessOrEqual, countGreaterOrEqual};
    }
    
    private static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) low = mid + 1;
            else high = mid;
        }
        return low; 
    }
    
    private static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < target) low = mid + 1;
            else high = mid;
        }
        return low;
    }
    
}