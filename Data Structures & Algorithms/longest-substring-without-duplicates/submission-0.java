class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastseen= new int[128];
        int ans=0;
        int l=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            l=Math.max(l,lastseen[c]);
            ans=Math.max(ans,r-l+1);
            lastseen[c]=r+1;


        }
        return ans;
    }
}
