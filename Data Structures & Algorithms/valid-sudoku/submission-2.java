class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Character>row= new HashSet<>();
            Set<Character>col= new HashSet<>();
            for(int j=0;j<9;j++){
                char r=board[i][j];
                char c= board[j][i];
                if(r!='.' && !row.add(r)) return false;
                if(c!='.' && !col.add(c)) return false;
            }


        }
for(int br=0;br<9;br+=3){
    for(int bc=0;bc<9;bc+=3){
              Set<Character> box= new HashSet<>();
for(int i=br;i<br+3;i++){
    for(int j=bc;j<bc+3;j++){
        char v=board[i][j];
        if(v!='.' && !box.add(v)){
            return false;
        }
    }
 }
       
       
    }
    
}
       return true; 
    }
}
