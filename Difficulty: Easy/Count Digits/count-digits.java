// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int dup = n;
        int count = 0;
        while (n>0){
            int ld = n%10;
            n = n/10;
            if (ld != 0 && dup%ld == 0){
                count++;
            }
            
            
        }
        return count;
    }
}