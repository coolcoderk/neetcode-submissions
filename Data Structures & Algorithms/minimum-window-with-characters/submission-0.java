class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0||t.length()==0) return "";
        Map<Character,Integer>need=new HashMap<>();
        for(char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }

       Map<Character,Integer> window=new HashMap<>();
       int required= need.size();
       int formed=0;
       int l=0,r=0;
       int minLen=Integer.MAX_VALUE, start=0;
       while(r<s.length()){
        char c=s.charAt(r);
        window.put(c, window.getOrDefault(c,0)+1);
       
       if(need.containsKey(c)&& window.get(c).intValue()==need.get(c).intValue()){
        formed++;
       }
    while(l<=r && formed==required){
        if(r-l+1<=minLen){
            minLen=r-l+1;
            start=l;
        }
        char lc=s.charAt(l);
        window.put(lc,window.get(lc)-1);
        if(need.containsKey(lc) && window.get(lc)<need.get(lc)){
            formed--;

        }
        l++;
    
    }
    r++;
       }
       return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);

    }
            

}
