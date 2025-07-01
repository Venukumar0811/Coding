class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;

        if (k >= n) {
            reverse(arr, 0, n - 1);
            return;
        }

        for (int i = 0; i < n; i += k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            reverse(arr, left, right);
        }
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        
        }
    }
}