class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
          int n1=t.length();
        Map<Character,Integer>hashmap= new HashMap<>();
                Map<Character,Integer>hashmap2= new HashMap<>();

        for(int i=0;i<n;i++)
            {
                hashmap.put(s.charAt(i),hashmap.getOrDefault(s.charAt(i),0)+1);
        }
        for(int j=0;j<n1;j++)
            {
                hashmap2.put(t.charAt(j),hashmap2.getOrDefault(t.charAt(j),0)+1);
        }
        return hashmap.equals(hashmap2);

        
        
    }
}
