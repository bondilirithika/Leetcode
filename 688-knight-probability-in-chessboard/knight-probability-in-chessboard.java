class Solution {
    double[][][] dp;
    public double knightProbability(int n, int k, int r, int c) {
        dp=new double[k+1][n][n];
        for(double[][] arr:dp)
        {
            for(double[] a:arr)
            {
                Arrays.fill(a,-1);
            }
        }
        return prob(n, k, r, c);
    }

    double prob(int n, int k, int r, int c) {
        if (r < 0 || r >= n || c < 0 || c >= n) // Fix the bounds check (n-1 is the max index)
            return 0;
        if (k == 0)
            return 1;
        if(dp[k][r][c]!=-1) return dp[k][r][c];
        double ans = 0;
        ans += (1.0 / 8) * prob(n, k - 1, r - 1, c - 2);
        ans += (1.0 / 8) * prob(n, k - 1, r - 1, c + 2);
        ans += (1.0 / 8) * prob(n, k - 1, r - 2, c - 1);
        ans += (1.0 / 8) * prob(n, k - 1, r - 2, c + 1);
        ans += (1.0 / 8) * prob(n, k - 1, r + 1, c - 2);
        ans += (1.0 / 8) * prob(n, k - 1, r + 1, c + 2);
        ans += (1.0 / 8) * prob(n, k - 1, r + 2, c - 1);
        ans += (1.0 / 8) * prob(n, k - 1, r + 2, c + 1);
        
        return dp[k][r][c]=ans;
    }
}
