class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        // int left = 0, curr_sum =0, max = 0;
        
        // for (int r=0; r< arr.length ; r++ ){
        //     curr_sum += arr[r];
            
        //     while(left>= r){
        //         curr_sum -=arr[r];
                
        //         if(curr_sum>max){
        //             max = curr_sum;
        //         }
        //         left++;
        //     }
        // }
        // return max;
        
        int currSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
    
}