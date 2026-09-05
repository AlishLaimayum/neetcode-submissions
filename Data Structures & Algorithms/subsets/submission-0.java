class Solution {
    List<List<Integer>> answer=new ArrayList<>();
    public void find(int[] nums,int index,List<Integer> ans){
        if(index==nums.length){
            answer.add(new ArrayList<>(ans));
            return;
        }
        find(nums,index+1,ans);
        ans.add(nums[index]);
        find(nums,index+1,ans);
        ans.remove(ans.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        find(nums,0,new ArrayList<>());
        return answer;
    }
}
