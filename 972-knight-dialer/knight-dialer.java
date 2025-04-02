class Solution {
    static int mod=1000000007;
    int[][][] dp;
    public int knightDialer(int n) {
        //dont have to store as they idnt ask fo rthe numv=ber just say the no.of valid numbers we can get
        dp=new int[4][3][n+1];
        for(int[][] arr:dp)
        {
            for(int[] a:arr)
            {
                Arrays.fill(a,-1);
            }
        }
        int ans=0;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==3 && (j==0 || j==2))continue;
                ans=(ans+valid(i,j,n-1)%mod)%mod;
            }
        }
        return ans%mod;
    }

    int valid(int i,int j,int n)
    {
        if(i<0 || i>3 || j<0 || j>2 ||(i==3 && (j==0 || j==2))) return 0;
        if(n==0)return 1;
        if(dp[i][j][n]!=-1)return dp[i][j][n];
        int count=0;
        count=(count+valid(i-1,j-2,n-1))%mod;
        count=(count+valid(i-1,j+2,n-1))%mod;
        count=(count+valid(i-2,j-1,n-1))%mod;
        count=(count+valid(i-2,j+1,n-1))%mod;
        count=(count+valid(i+1,j-2,n-1))%mod;
        count=(count+valid(i+1,j+2,n-1))%mod;
        count=(count+valid(i+2,j-1,n-1))%mod;
        count=(count+valid(i+2,j+1,n-1))%mod;
        return dp[i][j][n]=count%mod;
    }
}