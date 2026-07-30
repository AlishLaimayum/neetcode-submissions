class Solution {
    public int maxProfit(int[] prices) {
        int globalmax=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            int max=prices[i]-buy;
            globalmax=Math.max(max,globalmax);
        }
        return globalmax;
    }
}
