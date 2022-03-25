class MyQueue {
    
    Stack<Integer> stackNewest;
    Stack<Integer> stackOldest;

    public MyQueue() {
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }
    
    public void push(int x) {
        stackNewest.push(x);
    }
    
    public int pop() {
        shiftStack();
        return stackOldest.pop();
        
    }
    
    public int peek() {
        shiftStack();
        return stackOldest.peek();
    }
    
    public boolean empty() {
        
        return stackOldest.isEmpty() && stackNewest.isEmpty();
        
    }
    
    private void shiftStack(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty())
                stackOldest.push(stackNewest.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */