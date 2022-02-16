class Solution {
    public boolean validMountainArray(int[] arr) {
        
       int i = 0;
       int j = arr.length - 1;
        
        
       if(arr.length < 3)
           return false;
        
        while(i + 1 < arr.length - 1 && arr[i + 1] > arr [i]) i++;
        while(j - 1 > 0 && arr[j - 1] > arr[j]) j--;
        
     
        
        return (i == j);
        
        
    }
}