class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int even = 0;
        int odd =0;
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]%2 == 0){
                even ++;
            }
            else{
                odd++;
            }
        }
        return new int []{odd, even};
    }
}