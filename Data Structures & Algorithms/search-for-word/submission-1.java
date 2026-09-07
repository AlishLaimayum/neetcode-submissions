class Solution {
    public boolean backtrack(char[][] board, String word,int index, int i ,int j){
        if(index==word.length()) return true;
        if (i < 0 || i >= board.length ||
            j < 0 || j >= board[0].length) {
            return false;
        }
        if(board[i][j]!=word.charAt(index)) return false;
        
        char temp=board[i][j];
        board[i][j]='#';
        boolean b=backtrack(board,word,index+1,i,j-1) ||backtrack(board,word,index+1,i,j+1)||backtrack(board,word,index+1,i-1,j)|| backtrack(board,word,index+1,i+1,j);
        board[i][j]=temp;
        return b;
    }
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){    
                if(backtrack(board,word,0,i,j)) return true;
            }
        }
        return false;
    }
}
