class Solution {
    public int expand(char[][] grid, boolean[][] connected,int i , int j){
        if( i>=grid.length|| j>=grid[0].length || i<0 || j<0) return 0;
        if(connected[i][j]==true ||grid[i][j]=='0') return 0;
        connected[i][j]=true;
        int down=expand(grid, connected,i+1,j);
        int right=expand(grid,connected,i,j+1);
        int up=expand(grid,connected,i-1,j);
        int left=expand(grid,connected,i,j-1);
        return 1;
    }
    public int numIslands(char[][] grid) {
        boolean[][] connected=new boolean[grid.length][grid[0].length];
        int ans=0;
        for(boolean[] n:connected){
            Arrays.fill(n,false);
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ans+=expand(grid,connected,i,j);
            }
        }
        return ans;
    }
}
