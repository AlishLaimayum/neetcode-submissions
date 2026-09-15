class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2) q.offer(new int[]{i,j});
                if(grid[i][j]==1) fresh++;
            }
        }
        int[][] direction={
            {-1,0},
            {1,0},
            {0,1},
            {0,-1}

        };
        int solution=0;
        while(!q.isEmpty() && fresh>0){
            int i=0;
            int size=q.size();
            while(i<size){
                int[] curr=q.poll();
                for(int[] dir:direction){
                    int newR=dir[0]+curr[0];
                    int newC=dir[1]+curr[1];
                    if(newR>=0 && newR<grid.length && newC>=0 && newC<grid[0].length){
                        if(grid[newR][newC]==1){
                            fresh--;
                            grid[newR][newC]=2;
                            q.offer(new int[]{newR,newC});
                        }
                    }
                }
                i++;
            }
            solution++;
        }
        if(fresh==0) return solution;
        else return -1;

    }
}
