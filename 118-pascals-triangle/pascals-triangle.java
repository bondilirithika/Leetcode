class Solution {
    public List<List<Integer>> generate(int n) {
        //all abt ncr
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> a=new ArrayList<>();
            int ans=1;
            for(int j=0;j<i+1;j++)
            {
                if(j==0)
                a.add(ans);
                else
                {
                    ans=ans*(i+1-j)/j;
                a.add(ans);
                }
            }
            arr.add(a);
        }
        return arr;

    }
    
}