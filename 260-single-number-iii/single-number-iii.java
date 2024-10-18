class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        int c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int k:map.keySet())
        {
            int v=map.get(k);
            if(v==1)
            {
                ans[c]=k;
                c++;
            }
        }
        return ans;
    }
}