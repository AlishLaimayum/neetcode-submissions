class Solution {
    public int islandPerimeter(int[][] grid) {
        Queue<int[]> q= new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    q.offer(new int[]{i,j});
                    grid[i][j]=2;
                    break;
                }
            }
            if(!q.isEmpty()) break;
        }
        int ans=0;
        int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int[] island=q.poll();
            for(int[] dir:directions){
                int nrow = island[0]+dir[0];
                int ncol = island[1]+dir[1];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length){
                    if(grid[nrow][ncol]==1){
                        grid[nrow][ncol]=2;
                        q.offer(new int[]{nrow,ncol});
                    }
                    else if(grid[nrow][ncol]==0) ans++;
                }
                else{
                    ans++;
                }
            }
            
        }
        return ans;
    }
}