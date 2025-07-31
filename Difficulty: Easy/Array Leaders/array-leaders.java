class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int leader = Integer.MIN_VALUE;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i =arr.length - 1 ; i>=0 ; i--){
            
            if(arr[i]>= leader){
                result.add(arr[i]);
                leader = arr[i];
            }
        }
        Collections.reverse(result);
        
        return result;
    }
}
