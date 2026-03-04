class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxprof = 0;

        for(int price : prices){

            if(price < min){
                min = price;
            }
            else{
                maxprof = Math.max(maxprof,price - min);
            }
        }

        return maxprof;
    }
}
