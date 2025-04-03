class Solution {
     int ans;
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        for(int[] a:dp)
        Arrays.fill(a,-1);
        ans=0;
        return path(0,0,m,n);
        //return ans;
    }
    int path(int i,int j,int m,int n)
    {
        if(i<0 ||i>=m ||j<0 ||j>=n)
        return 0;
        if(i==m-1 && j==n-1)
        {
            //ans++;
            return 1;
        }
        if(dp[i][j]!=-1)
        return dp[i][j];
        int op1=path(i,j+1,m,n);
        int op2=path(i+1,j,m,n);
        return dp[i][j]=op1+op2;
    }
}