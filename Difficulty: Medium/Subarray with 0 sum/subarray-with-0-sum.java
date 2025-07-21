class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        
        
        for(int num : arr){
            sum +=num;
            
            if(sum == 0 || set.contains(sum) || num == 0){
                return true;
            }
            
            set.add(sum);
        }
        return false;
    }
}