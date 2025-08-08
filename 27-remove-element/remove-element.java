class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];  
                k++;
            }
        }

        return k;
    }

    public static void printArray(int[] nums, int k) {
        System.out.print("Output: " + k + ", nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i < k - 1 ? "," : ""));
        }
        System.out.println("]");
    }
}