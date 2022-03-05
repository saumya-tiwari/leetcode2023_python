class Solution {
    public int majorityElement(int[] nums) {
        
    int count = 1;
        
    Map<Integer, Integer> countMap = new HashMap<>();
        
        for(int num : nums){
            if(countMap.containsKey(num))
                countMap.put(num, countMap.get(num) + 1);
            else
                countMap.put(num, 1);
        }
        
        
        for(Map.Entry<Integer, Integer> entry: countMap.entrySet()){
            if(entry.getValue() > (nums.length / 2))
                return entry.getKey();
        }
        
        
        return count;
        
        
        
    }
}