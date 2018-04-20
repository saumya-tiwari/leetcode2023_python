class Logger {

    /** Initialize your data structure here. */
    LinkedHashMap<String,Integer> messages;
    
    public Logger() {
        messages = new LinkedHashMap<>();
    }
    
    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        int diff = 0;
        if(!messages.containsKey(message)){
             messages.put(message, timestamp);
             return true;
        }else{
            diff = timestamp - messages.get(message) ;
            if(diff >= 10){
               messages.put(message, timestamp);
               return true;
            }
            else
                return false;
        }
       
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */