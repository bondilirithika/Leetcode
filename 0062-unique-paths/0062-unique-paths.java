class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m+1][n+1];
        for(int[] a:dp)
        Arrays.fill(a,-1);
        return numpath(0,0,m,n);
    }

    int numpath(int i,int j,int m,int n)
    {
        
        if(i>=m || j>=n)
        return 0;
        if(i==m-1 && j==n-1)
        return 1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        return dp[i][j]=numpath(i,j+1,m,n)+numpath(i+1,j,m,n);
    }
}