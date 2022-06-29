class Solution {
    public int findMin(int[] arr) {
        
        int left = 0;
        int right = arr.length - 1;
        
        
        int N = arr.length;

        
        while(left <= right){
            int mid = (left + right) / 2;
            int prev = (mid + N - 1) % N;
            int next = (mid + 1) % N;
            
            if(arr[mid] <= arr[prev] && arr[mid] <= arr[next])
                return arr[mid];
            else if(arr[mid] <= arr[right])
                right = mid - 1;
            else
                left = mid + 1;
        }
        
        return 0;
        
    }
}