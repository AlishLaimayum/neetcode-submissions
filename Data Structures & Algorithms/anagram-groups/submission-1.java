class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        output.addAll(map.values());
        return output;
    }
}
