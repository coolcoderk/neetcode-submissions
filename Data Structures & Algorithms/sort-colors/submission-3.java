class Solution {
    private void swap(int nums[], int low , int high){
        int temp=nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
    }
    public void sortColors(int[] nums) {
        //dutch national flag
        int i=0;
        int low=0;
        int high=nums.length-1;
        while(i<=high){
            if(nums[i]==0){
                swap(nums,low++,i++);
    
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                swap(nums,i,high--);
            }
        }


    }
}