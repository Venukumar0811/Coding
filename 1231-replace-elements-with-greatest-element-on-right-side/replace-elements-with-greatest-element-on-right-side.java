class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int [] res = new int[n];
        int max =1;
        for(int i =n-1; i>=0; i--){
            res[i] = max;
            max = Math.max(max,arr[i]);
        }
        res[n-1] = -1;
        return res;
    }
}