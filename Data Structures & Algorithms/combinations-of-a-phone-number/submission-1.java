class Solution {
    Map<Character,List<Character>> map=new HashMap<>();
    public Solution(){
        map.put('2', List.of('a', 'b', 'c'));
        map.put('3', List.of('d', 'e', 'f'));
        map.put('4', List.of('g', 'h', 'i'));
        map.put('5', List.of('j', 'k', 'l'));
        map.put('6', List.of('m', 'n', 'o'));
        map.put('7', List.of('p', 'q', 'r', 's'));
        map.put('8', List.of('t', 'u', 'v'));
        map.put('9', List.of('w', 'x', 'y', 'z'));
    }
    List<String> solution=new ArrayList<>();
    public void backtrack(String digits,int index,StringBuilder curr){
        if(index==digits.length()){
            solution.add(curr.toString());
            return;
        }
        List<Character> vals=map.get(digits.charAt(index));
        for(int i=0;i<vals.size();i++){
            Character val=vals.get(i);
            backtrack(digits,index+1,curr.append(val));
            curr.deleteCharAt(curr.length()-1);
        }            
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0) return solution;
        backtrack(digits,0,new StringBuilder());
        return solution;
    }
}
