class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i =0, j = 0, maxLen = 0, len = 0;
        while(i<arr.length){
            if(arr[i]<=dep[j]){
                len++;
                i++;
            }else{
                len--;
                j++;
            }
            maxLen = Math.max(len, maxLen);
        }
        return maxLen;
    }
}