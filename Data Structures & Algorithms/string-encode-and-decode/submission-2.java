class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb= new StringBuilder();
        for(String str:strs){
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> output=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j =i;
            while(str.charAt(j)!=('#')){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j)); //eg 5# ...then find the 5 and change it to int
            output.add(str.substring(j+1,j+1+len));
            i=j+1+len;
        }
        return output;
    }
}
