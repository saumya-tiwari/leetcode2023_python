class LRUCache {
    
    class DLinkedNode{
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
    }
    
    private void addNewNode(DLinkedNode node){
        
        //add just after head
        
        node.prev = head;
        node.next = head.next;
        
        head.next.prev = node;
        head.next = node;
    }
    
    private void removeNode(DLinkedNode node){
        //remove existing node form list
        
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;
        
        prev.next = next;
        next.prev = prev;
    }
    
    private void moveToHead(DLinkedNode node){
        
        removeNode(node);
        addNewNode(node);
        
    }

    private DLinkedNode popTail(){
        
        DLinkedNode res = tail.prev;
        removeNode(res);
        return res;
        
    }
    
    private Map<Integer, DLinkedNode> cache = new HashMap<>();
    int capacity;
    int size;
    private DLinkedNode head, tail;


    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        
        head = new DLinkedNode();
        tail = new DLinkedNode();
        
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        
        DLinkedNode node = cache.get(key);
        
        if(node != null){
            moveToHead(node);
            return node.value;
        }else
            return -1;
        
    }
    
    public void put(int key, int value) {
        
        DLinkedNode node1 = cache.get(key);
        
        if(node1 == null){
            DLinkedNode node = new DLinkedNode();
            node.value = value;
            node.key = key;
            
            cache.put(key, node);
            addNewNode(node);
            
            ++size;
            
            if(size > capacity){
                DLinkedNode node2 = popTail();
                cache.remove(node2.key);
                size--;
            }
        }else{
            node1.value = value;
            moveToHead(node1);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */