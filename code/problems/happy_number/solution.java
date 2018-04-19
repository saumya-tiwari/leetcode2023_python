class Solution {
    public boolean isHappy(int n) {
    int slow, fast;
    slow = fast = n;
    do {
        slow = digitSquareSum(slow);
        fast = digitSquareSum(fast);
        fast = digitSquareSum(fast);
    } while(slow != fast);
    if (slow == 1) return true;
    else return false;
    }
    
int digitSquareSum(int n) {
    int sum = 0,a=0;
    while(n > 0){
        a = n % 10;
        sum+= a * a;
        n = n / 10;
    }
    return sum;
}
}