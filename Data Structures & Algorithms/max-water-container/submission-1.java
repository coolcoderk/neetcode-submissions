class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int best=0;
        while(l<r){
            int area= Math.min(heights[l],heights[r])*(r-l);
            best=Math.max(best,area);
            if(heights[l]<heights[r]){
             l++;
            

        }
        else r--;
        }
        return best;
    }
}
