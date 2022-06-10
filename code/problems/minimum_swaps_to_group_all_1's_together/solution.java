class Solution {
    public int minSwaps(int[] data) {
        
        int windowSize = 0;
        
        for(int num:data){
            windowSize += num;
        }
        
        int currNoOfOnes = 0;
        int maxNoOfOnes = 0;
        
        for(int i = 0; i< data.length; i++){
            currNoOfOnes += data[i];
            
            if(i >= windowSize){
                currNoOfOnes -= data[i - windowSize];
            }
            maxNoOfOnes = Math.max(maxNoOfOnes, currNoOfOnes);
        }
        
        return windowSize - maxNoOfOnes;
    }
}