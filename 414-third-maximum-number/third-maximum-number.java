class Solution {
    public int thirdMax(int[] nums) {
        Long first = null, second = null, third = null;

        for (int num : nums) {
            long curr = num;

            if ((first != null && curr == first) ||
                (second != null && curr == second) ||
                (third != null && curr == third)) {
                continue;
            }

            if (first == null || curr > first) {
                third = second;
                second = first;
                first = curr;
            } else if (second == null || curr > second) {
                third = second;
                second = curr;
            } else if (third == null || curr > third) {
                third = curr;
            }
        }

        return third == null ? first.intValue() : third.intValue();
    }
}