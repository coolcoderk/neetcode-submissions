class Solution {
    public int maxProfit(int[] prices) {

        int n=prices.length;
        int low=0;
        int high=low+1;
        int maxp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 if(prices[j]>prices[i]){
                    maxp=Math.max(maxp,prices[j]-prices[i]);
                 }
            }
            
        }
return maxp;
    }
}
