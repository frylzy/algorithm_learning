package leetcode_0726;

public class offer_10 {
    public int numWays(int n) {
        //动态规划
        //dp[0] = 1
        //dp[1] = 1
        //dp[2] = 2
        //dp[3] = 3
        //dp[3] = dp[2]
        //dp[3] += dp[1]
        //dp[4] = dp[3] + dp[2] = 5
        //dp[5] = dp[4] + dp[3] = 8
        //dp[6] = dp[5] + dp[4] = 13
        //dp[7] = 21
        if(n == 0 || n == 1) {
            return 1;
        }
        int f0 = 1;
        int f1 = 1;
        int res = 0;
        for(int i = 2; i <= n; i++) {
            res = (f0 + f1) % 1000000007;
            f0 = f1;
            f1 = res;
        }
        return res;
    }
}
