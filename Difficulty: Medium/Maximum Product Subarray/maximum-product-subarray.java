class Solution {
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int pre=1;
        int suff=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(pre==0)pre=1;
            if(suff==0) suff=1;
            pre*=arr[i];
            suff*=arr[n-i-1];
            ans=Math.max(ans,Math.max(pre,suff));
        }
        return ans;
    }
}