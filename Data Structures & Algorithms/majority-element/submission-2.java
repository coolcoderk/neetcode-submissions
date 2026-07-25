class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int num:nums){

        
        for(int i:nums){
            if(i==num){
                count++;
            }
        }
        

        if(count>n/2){
            return num;
        }
        }
    return -1;

    }
}