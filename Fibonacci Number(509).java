class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int first = 0;
        int second = 1;
        int sum = first + second;

        while(n > 1) {
            sum = first + second;
            first = second;
            second = sum;
            n--;
        }
        return sum;
    }
}
