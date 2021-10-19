class Solution {
    public List<List<Integer>> generate(int numRows) {
        
       List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 1; i <= numRows; i++) {
            int c=1;
            List<Integer> a = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                a.add(c);
                c = c * (i - j) / j;
            }
            res.add(a);
        }
        
        return res;
      
    }
}