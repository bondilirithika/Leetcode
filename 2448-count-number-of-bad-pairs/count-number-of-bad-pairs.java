class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Long,Long> map=new HashMap<>();
        long count=0;
        for(int i=0;i<nums.length;i++)
        {
            long res=nums[i]-i;
            if(map.containsKey(res))
            {
                count+=map.get(res);;
            }
                map.put(res,map.getOrDefault(res,0L)+1);
        }
        long n=nums.length;
        long tot=n*(n-1)/2;
        return tot-count;
    }
}