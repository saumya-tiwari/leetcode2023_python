class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean flag = false;
        
        for(int i : nums){
            if(!map.containsKey(i))
                map.put(i,1);
            else
                map.put(i, map.get(i)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                flag = true;
                break;
            }
                
        }
        return flag;
    }
}