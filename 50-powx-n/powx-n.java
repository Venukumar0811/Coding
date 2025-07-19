class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;
        long power = n;
        if(power < 0){
            x = 1/x;
            power = - power;
        }

        while(power > 0){
            if ((power% 2) == 1){
                res *= x;
            }
            x *= x ;
            power /= 2;
        }
        
        return res;
    }
}