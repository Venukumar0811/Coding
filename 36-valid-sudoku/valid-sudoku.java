class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(rowcheck(board,i)==false||colcheck(board,i)==false)
            return false;
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                if(!gridcheck(board,i,j))return false;
            }
        }
        return true;
    }
    private static boolean rowcheck(char bd[][],int row){
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<9;i++){
            char ch=bd[row][i];
            if(ch!='.'){
                if(!set.add(ch))return false;
            }
        }return true;
    }
    private static boolean colcheck(char bd[][],int col){
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<9;i++){
            char ch=bd[i][col];
            if(ch!='.'){
                if(!set.add(ch))return false;
            }
        }
        return true;
    }
    private static boolean gridcheck(char bd[][],int row,int col){
             HashSet<Character>set=new HashSet<>();
             for(int i=row;i<row+3;i++){
                for(int j=col;j<col+3;j++){
                      char ch=bd[i][j];
                       if(ch!='.'){
                      if(!set.add(ch))return false;
                      
            }
                }
             }
             return true;
    }
}