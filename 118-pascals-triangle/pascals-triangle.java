class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> c=new ArrayList<>();
            for(int j=0;j<i+1;j++)
            {
                if(j==0 || j==i)
                c.add(1);
                else
                c.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
            }
            arr.add(c);
        }
        return arr;
    }
}