class Solution {
    public int[] findPermutation(String s) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        stack.push(1);
        
        int i = 2;//next number
        int j = 0;//index of ans array
        
        int[] ans = new int[s.length() + 1];
        
        for(Character c: s.toCharArray()){
            if(c == 'I'){
                while(stack.size() > 0)
                    ans[j++] = stack.pop();
            }
            
            stack.push(i++);
                
        }
        
          while(stack.size() > 0)
                    ans[j++] = stack.pop();
        
        return ans;
        
    }
}