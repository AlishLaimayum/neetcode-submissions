class Solution {
    List<List<Integer>> answer= new ArrayList<>();
    public void finder(int[] nums,int index){
        if(index==nums.length){
            List<Integer> curr=new ArrayList<>();
            for(int num:nums){
                curr.add(num);
            }
            answer.add(curr);
            return;
        }
        for(int i=index;i<nums.length;i++){
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            finder(nums,index+1);
            temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        finder(nums,0);
        return answer;
    }
}
