class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            char right=s.charAt(r);
            if(map.containsKey(right)){
                l=Math.max(l,map.get(right)+1);
            }
            map.put(right,r);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
