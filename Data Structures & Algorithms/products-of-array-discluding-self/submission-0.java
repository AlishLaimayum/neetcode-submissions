class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix=new int[len];
        int[] suffix= new int[len];
        int[] output=new int[len];
        int pre=1,su=1;
        if(len<=1) return nums;
        for(int i =0;i<len;i++){
            pre*=nums[i];
            su*=nums[len-i-1];
            prefix[i]=pre;
            suffix[len-i-1]=su;
        }
        for(int i=0;i<len;i++){
            if(i==0){
                output[i]=suffix[i+1];
            }
            else if(i==len-1){
                output[i]=prefix[i-1];
            }
            else{
                output[i]=prefix[i-1]*suffix[i+1];
            }
        }
        return output;
    }
}  
