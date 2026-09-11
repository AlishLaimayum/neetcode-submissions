class Solution {
    public int find(int[][] grid, int i , int j ){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0) return 0;
        if(grid[i][j]==0) return 0;
        grid[i][j]=0;
        int up=find(grid,i-1,j);
        int down=find(grid,i+1,j);
        int right=find(grid,i,j-1);
        int left=find(grid,i,j+1);
        return 1+up+down+right+left;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int answer=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                answer=Math.max(find(grid,i,j),answer);
            }
        }
        return answer;  
    }
}
