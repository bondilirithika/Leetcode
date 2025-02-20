class Solution {
    public List<List<Integer>> generate(int n) {
        //all abt ncr
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> a=new ArrayList<>();
            for(int j=0;j<i+1;j++)
            {
                a.add(ncr(i,j));
            }
            arr.add(a);
        }
        return arr;

    }
    int ncr(int n,int r)
    {
        int res=1;
        for(int i=0;i<r;i++)
        {
            res=res*(n-i);
            res=res/(i+1);
        }
        return res;
    }
}