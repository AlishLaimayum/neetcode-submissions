class Solution {
    private List<List<Integer>> list=new ArrayList<>();
    private Set<List<Integer>> set= new HashSet<>();
    public void subFinder(int[] nums,int index, List<Integer> curr){
        if(nums.length==index){
            List<Integer> temp = new ArrayList<>(curr);
            if(set.contains(temp)) return;
            set.add(temp);
            list.add(temp);
            return;
        }
        subFinder(nums,index+1,curr);
        curr.add(nums[index]);
        subFinder(nums,index+1,curr);
        curr.remove(curr.size()-1);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subFinder(nums,0,new ArrayList<>());
        return list;
    }
}
