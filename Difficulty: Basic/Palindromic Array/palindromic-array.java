/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        for(int num : arr){
            if(!isPalindrome(num)){
                return false;
            }
        }
       return true;  
    }
    
    public static boolean isPalindrome(int num){
        
        int original = num; 
        int reverse = 0;
        
        while(num>0){
            
            int digit = num%10;
            reverse = 10*reverse+digit;
            num =num/10;
        }
        return original == reverse;
    }
}