class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int W_count =0;
        for(int i =0; i<k ; i++){
            if(blocks.charAt(i)== 'W'){
                W_count++;
            }
        }

        int l =0;
        int r = k-1;
        int min_count = W_count;

        while(r < blocks.length()-1){
            if(blocks.charAt(l)== 'W'){
                W_count--;
            }
            if(blocks.charAt(r+1) == 'W'){
                W_count++;
            }

            min_count = Math.min(W_count, min_count);
            l++;
            r++;
        }
        
        return min_count;
    }
}