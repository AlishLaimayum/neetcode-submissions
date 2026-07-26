class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i =0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==('.')){
                    continue;
                }
                else{
                    char c=board[i][j];
                    
                    if(!set.add(c+"seen in row "+i)||
                    !set.add(c+"seen in col"+j)||
                    !set.add(c+"seen in sub-box"+i/3+"-"+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
