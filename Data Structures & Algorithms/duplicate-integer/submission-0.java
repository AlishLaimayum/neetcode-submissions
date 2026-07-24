
class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        Set<Integer> set= new HashSet<>(list);
        boolean output=(list.size()!=set.size());
        return output;
        
    }
}