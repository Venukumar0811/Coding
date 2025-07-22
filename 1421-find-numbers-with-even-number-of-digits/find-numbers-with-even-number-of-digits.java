class Solution {
    public int findNumbers(int[] nums) {
        int total_count = 0;

        for(int num : nums){
            int count = 0;

            while (num > 0){
                int digit = num%10;
                num = num/10;
                count ++;
            }
            
            if(count%2 == 0)total_count++;

        }

        return total_count;
    }
}