class Solution {
    
    List<List<Integer>> subsets = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        
        //List<List<Integer>> subsets = new ArrayList<>();
        
        
        List<Integer> op = new ArrayList<>();
        
        subsets = findSubsets(nums ,op);
        
        return subsets;
        
    }
    
    public List<List<Integer>> findSubsets( int[] ip,  List<Integer> op) {
        
       if(ip.length == 0){
          subsets.add(op);
          return subsets;
       }
        
        List<Integer> op1 = new ArrayList<>(op);
        List<Integer> op2 = new ArrayList<>(op);
        
        op2.add(ip[0]);
       
        int[] nums = Arrays.copyOfRange(ip, 1, ip.length);
        
        
        findSubsets(nums, op1);
        findSubsets(nums, op2);
       
       
        return subsets;
          
    }
}