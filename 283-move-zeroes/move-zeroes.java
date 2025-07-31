class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != pos) {
                    int temp = nums[i];
                    nums[i] = nums[pos];
                    nums[pos] = temp;
                }
                pos++;
            }
        }
        
    }
}