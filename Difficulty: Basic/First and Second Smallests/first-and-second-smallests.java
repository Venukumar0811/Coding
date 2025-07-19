class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here'
        int first = Integer.MAX_VALUE;
        int secd = Integer.MAX_VALUE;
        
        if(arr.length<2){
            return new ArrayList<Integer>(List.of(-1));

        }
            
        for(int num : arr){
            
            if(num < first ){
                
                secd = first;
                first = num;
            }
            else if(num > first && num < secd ){
                secd = num;
            }
        }
        
        if(secd == Integer.MAX_VALUE ){
            return new ArrayList<Integer>(List.of(-1));
        }
        
        return new ArrayList<Integer>(List.of(first, secd));
    }
}
