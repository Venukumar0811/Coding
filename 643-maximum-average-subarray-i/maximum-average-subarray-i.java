class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        
        for(int i =0; i<=k-1; i++){
            sum += nums[i];
        }
        double max_avg = (double) sum/k;

        int l =1;
        int r = k;
        
        while(r < nums.length){
            sum = sum - nums[l-1] +nums[r];
            double avg = (double)sum/k;
            max_avg = Math.max(avg,max_avg);
            l++;
            r++;
        }
        return max_avg;
    }
}