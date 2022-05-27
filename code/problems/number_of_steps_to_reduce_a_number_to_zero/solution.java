class Solution {
    public int numberOfSteps(int num) {
        
      String binary = Integer.toBinaryString(num);
        
        int step = 0;
        
        for(char c: binary.toCharArray()){
            if(c == '1')
                step += 2;
            else
                step += 1;
        }
        
        return step - 1;
    }
}