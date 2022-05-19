class Solution {
    public boolean winnerOfGame(String colors) {
        
        if(colors.length() <= 2)
            return false;
        
        
        int [] noOfTriplets = findTriplets(colors);
        
        if(noOfTriplets[0] > noOfTriplets[1])
            return true;
        else
            return false;     
        
    }
    
    int[] findTriplets(String colors){
        int noOfTripletsA = 0, noOfTripletsB = 0;
        
        for(int i = 2; i < colors.length(); i++){
            if(colors.charAt(i - 2) =='A' && colors.charAt( i - 1) =='A' && colors.charAt(i) == 'A')
                noOfTripletsA++;
            else  if(colors.charAt(i - 2) =='B' && colors.charAt( i - 1) =='B' && colors.charAt(i) == 'B')
                noOfTripletsB++;
        }
        
        
        return new int[]{noOfTripletsA, noOfTripletsB};
        
    }
}