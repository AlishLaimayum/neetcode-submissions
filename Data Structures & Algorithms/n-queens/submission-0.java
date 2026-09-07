class Solution {
    List<List<String>> answer=new ArrayList<>();
    public boolean isSafe(char[][] board,int col, int row){
        //check horizontal
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1 ;i>=0 && j<board.length; i--,j++){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
    public void backTrack(char[][] board, int row){
        if(row==board.length){
            List<String> curr=new ArrayList<>();
            for(char[] c:board){
                curr.add(new String(c));
            }
            answer.add(curr);
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,col,row)){
                board[row][col]='Q';
                backTrack(board,row+1);
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0;i<board.length;i++){
            Arrays.fill(board[i],'.');
        }
        backTrack(board,0);
        return answer;
    }
}
