class Solution {
    public int characterReplacement(String s, int k) {
   int size=0;
        Set<Character>charset= new HashSet<>();
        for(Character a:s.toCharArray()){
            charset.add(a);
        }

        for(char c:charset){
                int l=0,   count=0;
       for(int r=0;r<s.length();r++){
      
            if(s.charAt(r)!=c){
                count++;
            }
            while(count>k){
              if(s.charAt(l)!=c){
                count--;}
                           l++;

            }
            size=Math.max(size,r-l+1);

        }
        }



        return size;
    }
}
