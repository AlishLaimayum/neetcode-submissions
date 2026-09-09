// class Solution {
//     public int recursion(int[] nums, int index,int[] answer){
//         if(index>=nums.length) return 0;
//         if (answer[index] != -1) return answer[index];
//         int skip=recursion(nums,index+1,answer);
//         int rob=nums[index]+recursion(nums,index+2,answer);
//         answer[index]=Math.max(skip,rob);
//         return answer[index];
//     }
//     public int rob(int[] nums) {
//         int[] answer=new int[nums.length];
//         Arrays.fill(answer,-1);
//         return recursion(nums,0,answer);
//     }
// }
class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 2];
        for (int i = n - 1; i >= 0; i--) {
            int skip = dp[i + 1];
            int rob = nums[i] + dp[i + 2];
            dp[i] = Math.max(skip, rob);
        }
        return dp[0];
    }
}
