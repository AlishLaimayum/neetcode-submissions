class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0;
        int high=row*col-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int a=mid/col;
            int b=mid%col;
            if(target==matrix[a][b]) return true;
            else if(target>matrix[a][b]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
