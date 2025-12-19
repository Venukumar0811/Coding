class Solution {
    public int binarysearch(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == k) {
                ans = mid;       
                high = mid - 1;  
            } 
            else if (k < arr[mid]) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}