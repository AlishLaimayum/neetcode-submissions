class Solution {
    int[] dp;
    public int recursion(int[] cost, int index) {
        if (index >= cost.length) return 0;
        if(dp[index]!=-1) return dp[index];
        int oneStep = recursion(cost, index + 1);
        int twoStep = recursion(cost, index + 2);
        return dp[index]=cost[index] + Math.min(oneStep, twoStep);
    }

    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        Arrays.fill(dp,-1);

        return Math.min(recursion(cost, 0), recursion(cost, 1));
    }
}