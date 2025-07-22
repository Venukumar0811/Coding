class Solution {
    public boolean canAliceWin(int[] nums) {
        int sig_sum = 0;
        int dou_sum = 0;

        for(int num : nums){
            
            if(num < 10){
                sig_sum +=num;
            }
            else{
                dou_sum += num;
            }
        }
        if (sig_sum == dou_sum) return false;

        return true;
    }
}