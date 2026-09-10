class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set = new HashSet<>();
        for(int n:nums) set.add(n);
        int maxi=0;

        for(int n:set){
            if(!set.contains(n-1)){
                int len=1;
                while(set.contains(n+len)){len++;
}
                    maxi= Math.max(maxi,len);
                    

                
            }
        }
        return maxi;
    }
}
