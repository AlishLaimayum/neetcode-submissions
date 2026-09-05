class Solution {
    List<List<Integer>> answer=new ArrayList<>();
    public void find(int[] nums, int target, List<Integer> curr,int index,int currSum){
        if(currSum==target){
            answer.add(new ArrayList<>(curr));
            return;
        }
        if(index==nums.length || currSum>target){
            return;
        }
        find(nums,target,curr,index+1,currSum);
        curr.add(nums[index]);
        find(nums,target,curr,index,currSum+nums[index]);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        find(nums,target,new ArrayList<>(),0,0);
        return answer;
    }
}
