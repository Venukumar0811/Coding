class Solution {
//     static int inversionCount(int arr[]) {
//     int count = 0;
    
//     for (int i = 0; i < arr.length - 1; i++) {
//         for (int j = i + 1; j < arr.length; j++) {
//             if (arr[i] > arr[j]) {
//                 count++;
//             }
//         }
//     }
    
//     return count;
// }

    static int inversionCount(int arr[]) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int left, int right) {
        int invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            // Count inversions in left half, right half, and merge step
            invCount += mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);
            invCount += merge(arr, left, mid, right);
        }
        return invCount;
    }

    private static int merge(int[] arr, int left, int mid, int right) {
        // Create temporary arrays for left and right subarrays
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

        for (int i = 0; i < leftArr.length; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < rightArr.length; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left, invCount = 0;

        // Merge the two arrays and count inversions
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                invCount += (leftArr.length - i); // Count inversions
            }
        }

        // Copy remaining elements
        while (i < leftArr.length)
            arr[k++] = leftArr[i++];
        while (j < rightArr.length)
            arr[k++] = rightArr[j++];

        return invCount;
    }
}
