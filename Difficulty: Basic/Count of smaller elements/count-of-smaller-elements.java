
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // Code here
        int count =0;
        for(int i = 0; i < arr.size();i++ ){
            if(arr.get(i) <= x){
                count++;
            }
        }
        
        return count;
    }
}