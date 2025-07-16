// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k)
                maxLen = i + 1;

            if (prefixSumMap.containsKey(sum - k)) {
                int len = i - prefixSumMap.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            if (!prefixSumMap.containsKey(sum))
                prefixSumMap.put(sum, i);
        }

        return maxLen;
    }
}
