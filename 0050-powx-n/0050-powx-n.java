class Solution {
    public double myPow(double x, int n) {
        long n1=n;
        return pow(x,n1);
    }
    double pow(double x,long n)
    {
        if(n==0)
        return 1;
        if(n==1)
        return x;
        if(n<0)
        {
            double pos=pow(x,n*-1);
            return 1/pos;
        }
        double half=pow(x,n/2);
        if(n%2==0)
        {
            return half*half;
        }
        else
        {
            return half*half*x;
        }
    }
}