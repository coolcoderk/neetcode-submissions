class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>hm= new HashMap<>();
        // Map<Integer, Integer> sortedMap = new TreeMap<>(hm);
        for(int i:nums){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
         int max=-1,best=0;
       for(Map.Entry<Integer,Integer>e:hm.entrySet()){
        if(e.getValue()>max){
            max=e.getValue();
            best=e.getKey();
        }
        
       }
        ans[i]=best;
        hm.remove(best);

       
       
        }
        return ans;

    }
}
