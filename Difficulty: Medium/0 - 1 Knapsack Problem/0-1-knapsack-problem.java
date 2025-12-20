class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int[][] dp=new int[W+1][val.length+1];
        return solve(W, val, wt, 0, dp);
    }
    public int solve(int cap, int []val, int []wt, int i, int[][] dp){
        if(i==val.length) return 0;
        if(dp[cap][i]!=0) return dp[cap][i];
        int pick=0;
        int not_pick=0;
        if(wt[i]<=cap){
            pick=val[i]+solve(cap-wt[i], val, wt, i+1, dp);
        }
        not_pick=solve(cap, val, wt, i+1, dp);
        return dp[cap][i]=Math.max(pick, not_pick);
    }
}
