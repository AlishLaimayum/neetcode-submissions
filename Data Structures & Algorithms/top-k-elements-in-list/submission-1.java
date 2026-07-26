class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] output=new int[k];
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else map.put(num,1);
        }
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        Set<Map.Entry<Integer,Integer>> entries= map.entrySet();
        for(Map.Entry<Integer,Integer> entry:entries){
            int number=entry.getKey();
            int frequency=entry.getValue();
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(number);
        }
        int index=0;
        for(int i=nums.length;i>=0 && index<k;i--){
            if(bucket[i]!=null){
                for(int num:bucket[i]){
                    output[index]=num;
                    index++;
                    if(index==k) break;
                }
            }
        }
        return output;
    }
}