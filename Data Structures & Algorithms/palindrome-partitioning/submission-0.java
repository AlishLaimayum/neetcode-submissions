class Solution {
    public void backtrack(String s ,int partition, List<String> curr,List<List<String>> solution){
        if(partition==s.length()){
            solution.add(new ArrayList<>(curr));
            return;
        }
        for(int i=partition;i<s.length();i++){
            if(isPalindrome(s.substring(partition,i+1))){
                curr.add(s.substring(partition,i+1));
                backtrack(s,i+1,curr,solution);
                curr.remove(curr.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s){
        StringBuilder sb=new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }
    public List<List<String>> partition(String s) {
        List<List<String>> solution=new ArrayList<>();
        backtrack(s,0,new ArrayList<>(),solution);
        return solution;
    }
}
