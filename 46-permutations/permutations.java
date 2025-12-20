class Solution {
    public void backtrack(int i, int[] nums, List<List<Integer>> ans) {
        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) temp.add(num);
            ans.add(temp);
            return;
        }

        for (int j = i; j < nums.length; j++) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            backtrack(i + 1, nums, ans);

            // backtrack
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, nums, ans);
        return ans;
    }
}