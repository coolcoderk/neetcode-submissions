class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        
        int x=0;
        int maxi=1;
Arrays.sort(nums);
  int consecutivesubsequence=1;
        for(int i=0;i<nums.length-1;i++){
        //   1 2 3 4 7 8 9 10


            if(nums[i+1]==nums[i])continue;
            if(nums[i]+1==nums[i+1]){
                consecutivesubsequence++;
                maxi=Math.max(maxi,consecutivesubsequence);
            
                
     
                
            }
            else{
                consecutivesubsequence=1;
            }
            
            
        } 
//         if(nums[nums.length-1]-nums[nums.length-2]==0){
//             maxi+=0;
//         }else if(nums[nums.length-1]-nums[nums.length-2]==1){
// maxi+=1;
//         }
    


        return maxi;
    }
}
