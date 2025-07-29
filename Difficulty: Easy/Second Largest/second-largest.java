class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest = arr[0];
        int sec_largest = -1;
        
        for(int i = 1; i<= arr.length-1; i++){
            if(arr[i] > largest ){
                
                sec_largest = largest;
                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > sec_largest){
                sec_largest = arr[i];
            }
        }
        
        return sec_largest;
    }
}