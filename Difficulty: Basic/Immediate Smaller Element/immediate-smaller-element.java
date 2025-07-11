// User function Template for Java

class Solution {
    public void immediateSmaller(int arr[]) {
        // code here

        for(int i= 1 ; i<=arr.length-1; i++){
            if(arr[i-1] > arr[i]){
                arr[i-1] = arr[i];
            }
            else{
                arr[i-1] = -1;
            }
        }
        arr[arr.length-1] = -1;
    }
}