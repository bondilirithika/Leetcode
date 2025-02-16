class Solution {
    //int ans=0;
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()+1][text2.length()+1];
        for(int[] arr:dp)
        {
            Arrays.fill(arr,-1);
        }
        return solve(text1,text2,0,0);
    }

    int solve(String s1,String s2,int i,int j)
    {
        if(i>=s1.length() || j>=s2.length())
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j]=1+solve(s1,s2,i+1,j+1);
        }
        else{
        int op2=solve(s1,s2,i+1,j);
        int op3=solve(s1,s2,i,j+1);
        return dp[i][j]=Math.max(op2,op3);
        }

        
    }
}