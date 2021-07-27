package leetcode_0727;

public class offer_16 {
    public double myPow(double x, int n) {
        if(n < 0) {
            return 1 / getPow(x, -n);
        } else {
            return getPow(x, n);
        }
    }
    private double getPow(double x, int n) {
        if(n == 0) {
            return 1.0;
        }
        if(n == 1) {
            return x;
        }
        double res = getPow(x, n / 2);
        if ((n & 1) == 1) {
            return x * res * res;
        }
        return res * res;
    }

    public double myPow1(double x, int n) {
        double res = 1.0;
        long tmp = n;
        if(tmp < 0) {
            tmp = -tmp;
        }
        while(tmp != 0) {
            if ((tmp & 1) == 1) {
                res *= x;
            }
            x *= x;
            tmp = tmp >> 1;
        }
        if(n < 0) {
            return 1 / res;
        }
        return res;
    }
}
