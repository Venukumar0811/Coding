// User function Template for Java
class Solution {
    public static int nextPrime(int n) {

        // code here to find next prime number
        // return next prime number
        int next_prime_no = n+1;
        
        while(true){
            if(isPrime(next_prime_no)){
               return next_prime_no; 
            }
            next_prime_no++;
        }
    }
    
    static boolean isPrime(int n){
            
            if(n<=1){return false;}
            for (int i =2; i<=Math.sqrt(n); i++){
                
              if(n%i ==0){return false;}
            }
            return true;
        }
}