class Solution {
    int dp[];
    public int climbStairs(int n) {
       dp=new int[n+1];
       Arrays.fill(dp,-1);
       return ways(n);
    }

    int ways(int n)
    {
         if(n==0)
        return 1;
        if(n<0)
        return 0;
        if(dp[n]!=-1)
        return dp[n];
        return dp[n]=ways(n-1)+ways(n-2);
    }
}