class MyHashSet {
public int[] visited;
    public MyHashSet() {
        this.visited=new int[10000] ;
         Arrays.fill(this.visited, -1); 
        
        


    }
    
    public void add(int key) {
        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==key){
                return;
            }
             
        }
        for(int i=0;i<visited.length;i++)
        if (visited[i]==-1){
                visited[i]=key;
                break;
                
            }
        
    }
    
    public void remove(int key) {
         for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==key){
                visited[i]=-1;
            }
        }
    }
    
    public boolean contains(int key) {
         for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */