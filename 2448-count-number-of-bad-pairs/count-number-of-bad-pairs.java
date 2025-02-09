class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Long,Long> map=new HashMap<>();
        long g=0;
        for(int i=0;i<nums.length;i++)
        {
            long p=i-nums[i];
            g+=map.getOrDefault(p,0L);
            map.put(p,map.getOrDefault(p,0L)+1L);
        }
        long n=nums.length;
        return (n*(n-1)/2)-g;
    }
}