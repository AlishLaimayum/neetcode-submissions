class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int curr=num;
                int local=0;
                while(set.contains(curr)){
                    curr++;
                    local++;
                }
                longest=Math.max(longest,local);
            }
            
        }
        return longest;
    }
}
