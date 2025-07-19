class Solution {
    int maxLength(int arr[]) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum)) {
                int prevIndex = map.get(sum);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}