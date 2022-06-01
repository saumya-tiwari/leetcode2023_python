class Solution {
    
     private class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String order1 = a + b;
            String order2 = b + a;
           return order2.compareTo(order1);
        }
    }
    
    public String largestNumber(int[] nums) {
        
        String[] strNums = new String[nums.length];
        
        
         for(int i = 0; i < strNums.length; i++)
            strNums[i] = String.valueOf(nums[i]);
        
        
      Comparator<String> comparator = (a, b) -> (a + b).compareTo(b + a);
        
      
       Arrays.sort(strNums, new LargerNumberComparator());
        
       if(strNums[0].equals("0")) return "0";
        
        String ans = "";
        
        for(int i = 0; i < strNums.length; i++)
            ans += strNums[i];
        
        return ans;
        
    }
}