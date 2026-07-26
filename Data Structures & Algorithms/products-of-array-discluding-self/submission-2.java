class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] suffix= new int[nums.length];
        int helperP=1;
        int helperS=1;
        for(int i=0;i<nums.length;i++){
            helperP=helperP*nums[i];
            helperS=helperS*nums[nums.length-i-1];
            prefix[i]=helperP;
            suffix[nums.length-i-1]=helperS;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0) suffix[i]=suffix[i+1];
            else if(i==nums.length-1) suffix[i]=prefix[i-1];
            else suffix[i]=prefix[i-1]*suffix[i+1];
        }
        return suffix;
        
    }
}  
