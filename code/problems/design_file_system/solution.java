class FileSystem {
    
    Map<String,Integer> pathMap;
    

    public FileSystem() {
        this.pathMap =  new HashMap<>();
    }
    
    public boolean createPath(String path, int value) {
        
        if((path.length() == 0 && !path.startsWith("/"))|| path.equals("/"))
            return false;
        
        if(pathMap.containsKey(path))
            return false;  
        
        int index = path.lastIndexOf("/");
        String parent = path.substring(0, index);
        
        System.out.print(parent);
        
        if(parent.length() > 1 && !this.pathMap.containsKey(parent))
            return false;
        
        pathMap.put(path, value);
        return true;
        
    }
    
    public int get(String path) {
        return pathMap.getOrDefault(path, -1);
    }
}

/**
 * Your FileSystem object will be instantiated and called as such:
 * FileSystem obj = new FileSystem();
 * boolean param_1 = obj.createPath(path,value);
 * int param_2 = obj.get(path);
 */