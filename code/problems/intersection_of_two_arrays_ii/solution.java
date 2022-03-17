class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
      int i  = 0;
        int j  = 0;
        
        int p = 0;
        
        int max_size  = 0;
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(arr1.length > arr2.length)
            max_size = arr1.length;
        else
            max_size = arr2.length;
        
        int[] res = new int[max_size];
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j])
                i++;
            else if(arr1[i] > arr2[j])
               j++;
            else if(arr1[i] == arr2[j]){
                  res[p++] = arr1[i];
                  i++;
                j++;
            }
              
        
        }
        
        return Arrays.copyOfRange(res, 0, p);
    }
}