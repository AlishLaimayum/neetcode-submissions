class Solution {
    public int dp(int[] nums , int start, int end){
        int prev1=0,prev2=0;
        for(int i=start;i<end;i++){
            int curr=Math.max(prev1,prev2+nums[i]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int excludeZ=dp(nums,0,n-1);
        int excludeL=dp(nums,1,n);
        return Math.max(excludeZ,excludeL);

        
    }
}
