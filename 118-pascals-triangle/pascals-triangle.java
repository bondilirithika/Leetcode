class Solution {
    public List<List<Integer>> generate(int numRows) {
        //we are cancelling n-r fact
        List<List<Integer>> ans=new ArrayList<>();
        for(int n=0;n<numRows;n++)
        {
            List<Integer> a=new ArrayList<>();
            int p=1;
            for(int r=0;r<=n;r++)
            {
                if(r==0)
                a.add(p);
                else{
                p=p*(n-r+1)/r;
                a.add(p);
                }
            }
            ans.add(a);
        }
        return ans;
    }

}