class Solution {
    StringBuilder s= new StringBuilder();
    List<String> answer=new ArrayList<>();
    public void backtrack(int n,int open , int close,StringBuilder s){
        if(s.length()==2*n){
            answer.add(s.toString());
            return;
        }
        if(open<n){
            s.append('(');
            backtrack(n,open+1,close,s);
            s.deleteCharAt(s.length()-1);
        }
        if(close<open){
            s.append(')');
            backtrack(n,open,close+1,s);
            s.deleteCharAt(s.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        backtrack(n,0,0,s);
        return answer;
    }
}
