class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen= new HashSet<>();
        for(int i = 0 ;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.') continue;
                char num=board[i][j];
                if(!seen.add(num+"in row"+i) || !seen.add(num+"in col"+j) ||!seen.add(num+"in box"+i/3+"_"+j/3)){
                    return false;
                }
            }
        }
        return true;
    }
}
