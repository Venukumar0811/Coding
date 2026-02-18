class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp =0, dp1= 0, dp2 = 0;

        for(int i = 2; i <= n; i++){
            int oneStep = dp1+cost[i-1];
            int twoStep = dp2+cost[i-2];

            dp = Math.min(oneStep, twoStep);
            dp2 = dp1;
            dp1= dp;

        }

        return dp1;
    }
}