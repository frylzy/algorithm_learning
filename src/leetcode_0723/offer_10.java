package leetcode_0723;

public class offer_10 {
    class Solution {
        public int fib(int n) {
            if(n == 0 || n== 1) {
                return n;
            }

            int f0 = 0;
            int f1 = 1;
            int res = 1;
            for(int i = 2; i <= n; i++) {
                res = (f0 + f1) % 1000000007;
                f0 = f1;
                f1 = res;
            }
            return res;
        }
    }
    class Solution1 {
        int[] cache = new int[101];
        public int fib(int n) {
            if(n == 0 || n== 1) {
                return n;
            }
            if(cache[n] != 0) {
                return cache[n];
            }
            cache[n] = (fib(n - 1) + fib(n - 2)) % 1000000007;
            return cache[n];
        }
    }
}
