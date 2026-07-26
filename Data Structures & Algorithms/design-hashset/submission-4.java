class MyHashSet {
    private final List<Integer>[] buckets;
    private static final int SIZE=10000;



    public MyHashSet() {
        buckets= new List[SIZE];
        for(int i=0;i<SIZE;i++){
            buckets[i]=new ArrayList<>();
        }

    }
    
    public void add(int key) {
        List<Integer>bucket=buckets[key%SIZE];
        if(!bucket.contains(key)) bucket.add(key);
    }
    
    public void remove(int key) {
        buckets[key%SIZE].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
return buckets[key%SIZE].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */