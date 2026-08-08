class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> hm= new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);

        }
        int k=0;
        for(int i=0;i<3;i++){
            int j=0;
        int count = hm.getOrDefault(i, 0);    

            while(j<count)
           {
                nums[k]=i;
                j++;
                k++;
            }
        }
    }
}