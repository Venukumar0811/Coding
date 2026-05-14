class Solution {
    public int climbStairs(int n) {

        if(n <= 3) return n;
        
        int one_step_before = 2;
        int two_steps_before = 1;

        for(int i = 3 ; i <= n; i++){

            int cur = one_step_before + two_steps_before;

            two_steps_before = one_step_before;
            one_step_before = cur;
        }

        return one_step_before;
    }
}