class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        int[] parent = new int[isConnected.length];
        int[] rank = new int[isConnected.length];
        
        Arrays.fill(parent, -1);
        Arrays.fill(rank, 0);
        
        
        for(int i  = 0; i < isConnected.length; i++){
            for(int j = 0 ; j < isConnected[0].length; j++){
                if(isConnected[i][j] == 1 && i != j)
                    union(parent, rank, i , j);
            }
        }
        
        
        int count = 0;
        
        for(int n: parent){
            if(n == -1)
                count++;
        }
        
        return count;
        
    }
    
    
    void union(int[] parent, int[] rank, int x, int y){
     int rootX = find(parent,x);
     int rootY = find(parent, y);
    if (rootX != rootY) {
        if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else {
            parent[rootY] = rootX;
            rank[rootX] += 1;
        }
    }
    }
    
    
    int find(int[] parent, int x){
        if(parent[x] == -1)
            return x;
        return parent[x] = find(parent, parent[x]);
    }
}