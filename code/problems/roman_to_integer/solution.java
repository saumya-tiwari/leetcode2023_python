class Solution {
    Map<Character, Integer> map = new HashMap<>();

    public int romanToInt(String s) {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;

        int lastValue = map.get(s.charAt(s.length() - 1));
        sum += lastValue;

        for (int i = s.length() - 2; i >= 0; i--) {
            int currentValue = map.get(s.charAt(i));

            if (lastValue > currentValue) sum -= currentValue; else sum += currentValue;

            lastValue = currentValue;
        }

        return sum;
    }
}
