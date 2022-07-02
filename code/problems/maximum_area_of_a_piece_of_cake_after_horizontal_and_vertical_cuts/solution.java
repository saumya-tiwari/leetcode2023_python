class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        int n = horizontalCuts.length;
        int m = verticalCuts.length;
        
        long max_h = Math.max(horizontalCuts[0], h - horizontalCuts[n - 1]);
        long max_v = Math.max(verticalCuts[0], w - verticalCuts[m - 1]);
        
        for(int i = 1; i < n; i++){
            max_h = Math.max(max_h, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        
          for(int i = 1; i < m; i++){
            max_v = Math.max(max_v, verticalCuts[i] - verticalCuts[i - 1]);
        }
        
        return (int) ((max_h * max_v) % (1000000007));
        
    }
}