class Solution {
    public int numDupDigitsAtMostN(int n) {
        return n-(repdig(n+"",0,0,0,0))+1;
    }
    int repdig(String numb,int vis,int prev,int i,int nz)
    {
        if (i >= numb.length())
    return 1;
    int count=0;
    if(nz==0)
    {
        count+=repdig(numb,vis,1,i+1,0);
    }

        int lim=numb.charAt(i)-'0';
        int l=lim;
        if(prev==1)
        l=9;
        //int count=0;
        
        for(int j=0;j<=l;j++)
        {
            if(j==0 && nz==0)
            continue;
            if((vis&(1<<j))!=0)
            continue;
            int nvis=vis|(1<<j);
            if(j<lim)
            {
                count+=repdig(numb,nvis,1,i+1,1);
            }
            else if(j==lim)
            {
                count+=repdig(numb,nvis,prev,i+1,1);
            }
            else
            {
               if(prev==1)
                count+=repdig(numb,nvis,prev,i+1,1);
            }
        }
        return count;
    }
}