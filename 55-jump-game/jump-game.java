class Solution {
    public boolean canJump(int[] nums) {
        int range = 0;

        for(int i = 0; i <= range; i++){
            range = Math.max(range, i+nums[i]);

            if(range >= nums.length-1){
                return true;
            }
        }
    return false;
        
    }
}