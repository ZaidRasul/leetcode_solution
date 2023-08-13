class Solution {
    public double myPow(double x, long n) {
        if(n < 0) {
            x = 1 / x;
            n = -n;
        }
        double result = 1;
        double c_product = x;
        while(n > 0) {
            if(n % 2 == 1) {
                result = result * c_product;
            }
            c_product = c_product * c_product;
            n = n / 2;
        }

        return result;
    }
}