class Solution {
    public List<Integer> getRow(int r) {
        List<Integer> arr=new ArrayList<>();
        long ans=1;
        for(int i=0;i<r+1;i++)
        {
            if(i==0)
            arr.add((int)ans);
            else
            {
                ans=ans*(r+1-i)/i;
                arr.add((int)ans);
            }
        }
        return arr;
    }
}