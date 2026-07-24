class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> forS=new HashMap<>();
        //HashMap<Character,Integer> forT=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(char c:s.toCharArray()){
            if(forS.containsKey(c)){
                forS.put(c,forS.get(c)+1);
            }
            else forS.put(c,1);
        }
        for(char c:t.toCharArray()){
            if(!forS.containsKey(c)){
                return false;
            }
            forS.put(c,forS.get(c)-1);
            if(forS.get(c)==0) forS.remove(c);
        }
        return forS.isEmpty();
    }
}
