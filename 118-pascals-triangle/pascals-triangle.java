class Solution {
    public List<List<Integer>> generate(int numRows) {
        //we are cancelling n-r fact
        List<List<Integer>> ans=new ArrayList<>();
        for(int n=0;n<numRows;n++)
        {
            List<Integer> a=new ArrayList<>();
            for(int r=0;r<=n;r++)
            {
                a.add(ncr(n,r));
            }
            ans.add(a);
        }
        return ans;
    }

    int ncr(int n,int r)
    {
        int p=1;
        for(int i=n;i>n-r;i--)
        {
            p=p*i;
            p=p/(n-i+1);
        }
        return p;

    }
}