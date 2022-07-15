public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0, start = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0;j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                if(map.get(s.charAt(j)) >= start)
                    start = map.get(s.charAt(j)) + 1;
            }
            ans = Math.max(ans, j - start + 1);
            map.put(s.charAt(j), j);
        }
        return ans;
    }
}