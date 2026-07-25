class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<String> ana= new ArrayList<>();
        Map<String, List<String>> groups= new HashMap<>();
        
        for(String s: strs){
           
           int[] count=new int[26];
           for(char c :s.toCharArray()){
            count[c-'a']++ ;
           } 
           StringBuilder sb= new StringBuilder();
           for(int x:count){
            sb.append(x).append('#');
           }
            String key=sb.toString();
            groups.computeIfAbsent(key,k->new ArrayList<>()).add(s);

                                
        }   
       return new ArrayList<>(groups.values());
        
        
    }
}
