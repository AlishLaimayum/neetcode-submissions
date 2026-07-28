class Solution {
    public int maxArea(int[] heights) {
        int max=Integer.MIN_VALUE;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int minH=Math.min(heights[left],heights[right]);
            int diff=right-left;
            int localmax=minH*diff;
            max=Math.max(localmax,max);
            //if(heights[left+1]>heights[right-1]) left--; this is wrong 
            if(heights[left]<heights[right]) left++;
            else right--;  
        }
        return max;
    }
}
