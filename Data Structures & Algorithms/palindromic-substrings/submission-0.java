class Solution {
    public int count(String s, int left , int right){
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
    public int countSubstrings(String s) {
        int count=0;
        for(int i =0;i<s.length();i++){
            count+=count(s,i,i);
            count+=count(s,i-1,i);
        }
        return count;
    }
}
