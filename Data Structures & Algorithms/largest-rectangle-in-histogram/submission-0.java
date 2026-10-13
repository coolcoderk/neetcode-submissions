class Solution {
    public int largestRectangleArea(int[] heights) {
        int n =heights.length, maxArea=0;
        Deque<int[]> stack=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            int start=i;
            while(!stack.isEmpty() && stack.peek()[1]>heights[i]){
                int[]top=stack.pop();
                maxArea=Math.max(maxArea,top[1]*(i-top[0]));
                start=top[0];

            }
            stack.push(new int[]{start,heights[i]});
        }
        for(int []p:stack){
            maxArea=Math.max(maxArea,p[1]*(n-p[0]));
        }
        return maxArea;

    }
}
