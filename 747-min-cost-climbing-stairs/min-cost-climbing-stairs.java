class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length+2];
        Arrays.fill(dp,-1);
        return solve(cost,-1);
    }
    int solve(int[] cost,int i)
    {
        if(i>=cost.length)
        return 0;
        if(dp[i+1]!=-1)
        return dp[i+1];
        int op1=0,op2=0;
        if(i+1<cost.length)
         op1=cost[i+1]+solve(cost,i+1);
         if(i+2<cost.length)
         op2=cost[i+2]+solve(cost,i+2);
        return dp[i+1]=Math.min(op1,op2);
    }
}