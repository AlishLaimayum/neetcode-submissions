class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int num:piles){
            max=Math.max(max,num);
        }
        int left=1;
        int ans=max;
        while(left<=max){
            int mid=left+(max-left)/2;
            int hours=0;
            for(int num:piles){
                int rem=num%mid;
                hours+=num/mid;
                if(rem!=0) hours+=1;
            }
            if(hours<=h){
                ans=mid;
                max=mid-1;
            }
            else left=mid+1;
        }
        return ans;
    }
}
