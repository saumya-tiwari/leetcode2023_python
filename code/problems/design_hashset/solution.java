class MyHashSet {
    
   List<Integer>[] set ;
   private final int MAX_LEN =  1000000;

    /** Initialize your data structure here. */
    public MyHashSet() {
        set = (List<Integer>[])new ArrayList[MAX_LEN];
    }
    
    public int getIndex(int key){
        return key % MAX_LEN;
    }
    
    public int getPos(int key, int index){
        List<Integer> temp = set[index];
        if (temp == null) {
            return -1;
        }
        // Iterate all the elements in the bucket to find the target key.
        for (int i = 0; i < temp.size(); ++i) {
            if (temp.get(i) == key) {
                return i;
            }
        }
        return -1;
    }
    
    public void add(int key) {
       int index = getIndex(key);
       int pos = getPos(key, index);
       
        if (pos < 0) {
            // Add new key if key does not exist.
            if (set[index] == null) {
                set[index] = new ArrayList<Integer>();
            }
            set[index].add(key);
        }
           
    }
    
    public void remove(int key) {
       int index = getIndex(key);
       int pos = getPos(key, index);
        if (pos >= 0) {
            // Remove the key if key exists.
            set[index].remove(pos);
        }
    }
    
    /** Returns true if this set did not already contain the specified element */
    public boolean contains(int key) {
       int index = getIndex(key);
       int pos = getPos(key, index);
        return pos >= 0;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */