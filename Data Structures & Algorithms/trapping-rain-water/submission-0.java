class Solution {
    public int trap(int[] height) {
        int[] left=new int[height.length];
        int[] right=new int[height.length];
        int[] min=new int[height.length];
        int leftmax=0;
        int rightmax=0;
        int solution=0;
        for(int i=0;i<height.length;i++){
            left[i]=leftmax;
            leftmax=Math.max(leftmax,height[i]);
            right[height.length-i-1]=rightmax;
            rightmax=Math.max(rightmax,height[height.length-i-1]);
        }
        for(int i=0;i<height.length;i++){
            min[i]=Math.min(left[i],right[i]);
            min[i]=(min[i]-height[i]<0)? 0: (min[i]-height[i]);
            solution+=min[i];
        }
        return solution;
    }
}
