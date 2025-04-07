class Solution {
    int[][]dp;
    public int maxScore(int[] nums) {
        dp=new int[8][(1<<14)];
        for(int[] a:dp)
        Arrays.fill(a,-1);
        return mscore(nums,(nums.length)/2,0,0);
    }
    int mscore(int[] nums,int n,int vis,int op)
    {
        if(op==n)
        return 0;
        if(dp[n][vis]!=-1)
        return dp[n][vis];
        int score=0;
        for(int i=0;i<nums.length;i++)
        {
            if((vis&(1<<i))!=0)
            continue;
            for(int j=1;j<nums.length;j++)
            {
                if(i==j)
                continue;
                if((vis & (1<<j))!=0)
                continue;
                int nval=(vis|(1<<i)|(1<<j));
                int cscore=(op+1)*gcd(nums[i],nums[j])+mscore(nums,n,nval,op+1);
                score=Math.max(score,cscore);
            }
        }
        return dp[n][vis]=score;
    }

    int gcd(int a,int b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
}