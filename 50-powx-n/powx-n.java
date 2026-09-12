class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double mul = 1.0;
        while (N > 0) {
            if (N % 2 == 1) {
                mul *= x;
            }
            x *= x;
            N /= 2;
        }
        return mul;
    }
}