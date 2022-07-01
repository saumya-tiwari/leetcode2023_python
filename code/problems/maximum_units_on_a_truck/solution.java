class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        
        int capacity = 0;
        
        for(int[] box: boxTypes){
            
            int boxCnt = Math.min(box[0], truckSize);
            capacity += boxCnt * box[1];
            
            truckSize -= boxCnt;
            
            if(truckSize == 0)
                break;
            
        }
        
        return capacity;
        
        
        
    }
}