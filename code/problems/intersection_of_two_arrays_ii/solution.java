class Solution {
    public int[] intersect(int[] arr1, int[] arr2) {
      int map[] = new int[1001]; 
        int res[]  = new int[Math.min(arr1.length, arr2.length)]; 
        for (int i = 0; i < arr2.length; i++) {
            map[arr2[i]]++; 
        }
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (map[arr1[i]] > 0) { // if frequency of value is greater than 0 then add that element to array
                res[j++] = arr1[i];
                map[arr1[i]]--; // decrement its count
            }
        }
        
        return Arrays.copyOf(res, j); // return resultant array with range upto size length of last added element
    }
}