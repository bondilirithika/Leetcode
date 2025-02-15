class Solution {
    public int punishmentNumber(int n) {
        int ans=0;
        for(int i=1;i<=n;i++)
        {
            int s=i*i;
            if(solve(i,s+"",0))
            ans+=s;
        }
        return ans;
    }
    boolean solve(int tar,String str,int i)
    {
        if(i==str.length()&& tar==0)
        return true;
        if(i==str.length())
        return false;

        for(int j=i+1;j<=str.length();j++)
        {
            String s=str.substring(i,j);
            if(solve(tar-Integer.parseInt(s),str,j))
            return true;
        }
        return false;
    }
}