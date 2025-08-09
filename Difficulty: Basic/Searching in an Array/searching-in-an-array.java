// User function Template for Java
class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        // code here
        for(int i = 0 ;i<= arr.size()-1; i++){
            if(arr.get(i) == k) return i+1;
            
        }
        return -1;
    }
}