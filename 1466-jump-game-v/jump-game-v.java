class Solution {
    int[] dp;
    public int maxJumps(int[] arr, int d) {
        int ans=0;
        dp=new int[arr.length];
        Arrays.fill(dp,-1);
        for(int i=0;i<arr.length;i++)
        {
            ans=Math.max(ans,1+solve(i,d,arr));
        }
        return ans;
        

    }
    int solve(int i,int d,int[] arr)
    {
        int op1=0,op2=0;
        if(dp[i]!=-1)
        return dp[i];
        for(int j=i-1;(j>=i-d && j>=0);j--)
        {
            if(j<0 || arr[j]>=arr[i])
            break;
            op1=Math.max(op1,1+solve(j,d,arr));
        }
        for(int j=i+1;(j<arr.length && j<=i+d);j++)
        {
            if(j>=arr.length || arr[j]>=arr[i])
            break;
            op2=Math.max(op2,1+solve(j,d,arr));
        }
        return dp[i]=Math.max(op1,op2);
    }
}