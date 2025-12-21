// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
          HashSet<String> seen=new HashSet<>();
       ArrayList<ArrayList<Integer>> result=new ArrayList<>();
      
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==0){
                ArrayList<Integer> pair=new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                String key=arr[left]+ ","+ arr[right];
                if(!seen.contains(key)){
                    result.add(pair);
                    seen.add(key);
                    
                }
                left++;
                right--;
            }else if(sum<0){
                left++;
            }else{
                right--;
            }
        }
        return result;
    }
}
