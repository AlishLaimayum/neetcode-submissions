class Solution {
    public int recursion(int[] nums, int start, int end){
        int prev1=0;
        int prev2=0;
        for(int i=start;i<=end;i++){
            int skip=prev1;
            int rob=nums[i]+prev2;
            int curr=Math.max(skip,rob);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int includeFirst=recursion(nums,0,n-2);
        int excludeFirst=recursion(nums,1,n-1);
        return Math.max(includeFirst,excludeFirst);
    }
}
