class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int solution=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<s.length()){
            int windowSize=right-left+1;
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            int max=0;
            for(int val:map.values()){
                max=Math.max(max,val);
            }
            if(windowSize-max<=k){
                solution=Math.max(solution,windowSize);
            }
            else{
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            right++;
        }
        return solution;
    }
}
