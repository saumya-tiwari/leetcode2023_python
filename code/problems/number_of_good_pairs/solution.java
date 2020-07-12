class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] c = new int[101];
        
        for(int i: nums){
            ++c[i];
        }
           for(int i = 0; i < 100 ; i++){
                count += c[i] *(c[i] - 1)/2;
           }
             
        return count;
        
    }
}