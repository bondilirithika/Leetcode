class Solution {
    int[][][][] dp;
    public int countDigitOne(int n) {
        String k=n+"";
        dp=new int[k.length()][k.length()][2][2];
        
            for(int[][][] b:dp)
            {
                for(int[][] c:b)
                {
                    for(int[] d:c)
                    Arrays.fill(d,-1);
                }
            }
        
        return solve(n+"",0,0,0,0);
    }

    int solve(String n,int i,int noone,int nz,int f)
    {
        if(i==n.length())
        {
            return noone;
        }
        if(dp[i][noone][nz][f]!=-1)
        return dp[i][noone][nz][f];
        int dig=n.charAt(i)-'0';
        int lim=dig;
        if(f==1)
        lim=9;
        int count=0;
        if(nz==0)
        {
            count+=solve(n,i+1,count,nz,1);
        }
        for(int j=0;j<=lim;j++)
        {
            if(j==0 && nz==0)
            continue;
            int no=0;
           // int nval=val|((1<<j));
            if(j==1)
            no++;
            if(j<lim)
            {
                count+=solve(n,i+1,noone+no,1,1);
            }
            else
            {
                count+=solve(n,i+1,noone+no,1,f);
            }
        }
        return dp[i][noone][nz][f]=count;
    }
}