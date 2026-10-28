class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>al=new ArrayList<>();
      Arrays.sort(nums1);
      Arrays.sort(nums2);

        for(int i=0;i<nums1.length;i++){
            al.add(nums1[i]);
        }
       
        for(int i=0;i<nums2.length;i++){
            al.add(nums2[i]);
        }
        al.sort(Comparator.naturalOrder());
         System.out.println(al);
        
        int size=nums1.length+nums2.length;
                 System.out.println(size);

        if((size)%2!=0){
            return al.get((size/2));
        }
        else{
            System.out.println((al.get((size/2)-1)));
            double a=(al.get((size/2)-1));
            double b=(al.get((size/2)));
            System.out.println(al.get((size/2)));
           // return (al.get((size/2)-1)+al.get((size/2)))/2;
           return ((a+b)/2);
        }
    }
}
